import {Component, Input, OnInit} from '@angular/core';
import {Glossary} from '../../shared/models/glossary';

@Component({
  selector: 'app-child-glossary',
  templateUrl: './child-glossary.component.html',
  styleUrls: ['./child-glossary.component.scss']
})
export class ChildGlossaryComponent implements OnInit {

  @Input() glossary: Glossary;

  constructor() { }

  ngOnInit() { }

}
