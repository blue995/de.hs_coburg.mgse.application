import { Component, OnInit } from '@angular/core';
import { GlossaryService } from "../../services/glossary.service";
import { Glossary } from "../../shared/models/glossary";

import { PipeTransform, Pipe } from '@angular/core';

// TEST: get key-value pair from object/array
@Pipe({name: 'keys'})
export class KeysPipe implements PipeTransform {
  transform(value, args:string[]) : any {
    let keys = [];
    for (let key in value) {
      keys.push({key: key, value: value[key]});
    }
    return keys;
  }
}

// TEST: translation
@Pipe({name: 'translate'})
export class TranslatePipe implements PipeTransform {
  transform(value) : any {
    let lexicon = {
      abbreviation: "Abkürzung",
      word: "Bezeichnung",
      description: "Bedeutung",
      meaning: "Bedeutung"
    };
    return (lexicon[value] !== undefined) ? lexicon[value] : value;
  }
}

// TEST: sort array
@Pipe({name: 'orderBy', pure: false})
export class OrderBy implements PipeTransform {

  static _orderByComparator(a:any, b:any):number{

    if (a === undefined || b === undefined) return 0;

    if((isNaN(parseFloat(a)) || !isFinite(a)) || (isNaN(parseFloat(b)) || !isFinite(b))){
      //Isn't a number so lowercase the string to properly compare
      if(a.toLowerCase() < b.toLowerCase()) return -1;
      if(a.toLowerCase() > b.toLowerCase()) return 1;
    }
    else{
      //Parse strings as numbers to compare properly
      if(parseFloat(a) < parseFloat(b)) return -1;
      if(parseFloat(a) > parseFloat(b)) return 1;
    }

    return 0; //equal each other
  }

  transform(input:any, [config = '+']): any{

    if(!Array.isArray(input)) return input;

    if(!Array.isArray(config) || (Array.isArray(config) && config.length == 1)){
      var propertyToCheck:string = !Array.isArray(config) ? config : config[0];
      var desc = propertyToCheck.substr(0, 1) == '-';

      //Basic array
      if(!propertyToCheck || propertyToCheck == '-' || propertyToCheck == '+'){
        return !desc ? input.sort() : input.sort().reverse();
      }
      else {
        var property:string = propertyToCheck.substr(0, 1) == '+' || propertyToCheck.substr(0, 1) == '-'
          ? propertyToCheck.substr(1)
          : propertyToCheck;

        return input.sort(function(a:any,b:any){
          return (!desc) ? OrderBy._orderByComparator(a[property], b[property]) : -OrderBy._orderByComparator(a[property], b[property]);
        });
      }
    }
    else {
      //Loop over property of the array in order and sort
      return input.sort(function(a:any,b:any){
        for(var i:number = 0; i < config.length; i++){
          var desc = config[i].substr(0, 1) == '-';
          var property = config[i].substr(0, 1) == '+' || config[i].substr(0, 1) == '-'
            ? config[i].substr(1)
            : config[i];

          var comparison = (!desc) ? OrderBy._orderByComparator(a[property], b[property]) : -OrderBy._orderByComparator(a[property], b[property]);

          //Don't return 0 yet in case of needing to sort by next property
          if(comparison != 0) return comparison;
        }

        return 0; //equal each other
      });
    }
  }
}

@Component({
  selector: 'app-glossary',
  templateUrl: './glossary.component.html',
  styleUrls: ['./glossary.component.scss']
})
export class GlossaryComponent implements OnInit {

  glossary: Glossary;

  constructor(private glossaryService: GlossaryService) { }

  ngOnInit() {
    this.getGlossary();
  }

  getGlossary(): void {
    this.glossaryService.getGlossary()
      .subscribe(glossary => this.glossary = glossary);
  }
}
