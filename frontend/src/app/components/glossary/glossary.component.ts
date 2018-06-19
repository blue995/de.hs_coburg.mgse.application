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
