import {Component, Input, OnInit} from '@angular/core';
import {Footnote} from '../../shared/models/footnote';

@Component({
  selector: 'app-child-footnotes',
  templateUrl: './child-footnotes.component.html',
  styleUrls: ['./child-footnotes.component.scss']
})
export class ChildFootnotesComponent implements OnInit {

  @Input() footnotes: Footnote[];

  constructor() { }

  ngOnInit() {
  }

}
