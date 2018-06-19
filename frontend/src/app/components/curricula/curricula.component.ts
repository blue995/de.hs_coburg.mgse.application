import { Component, OnInit } from '@angular/core';
import {CurriculumMeta} from '../../shared/models/curriculum-meta';
import {CurriculaService} from '../../services/curricula.service';

@Component({
  selector: 'app-curriculum',
  templateUrl: './curricula.component.html',
  styleUrls: ['./curricula.component.scss']
})
export class CurriculaComponent implements OnInit {

  curriculaMeta: CurriculumMeta[];

  constructor(private curriculaService: CurriculaService) { }

  ngOnInit() {
    this.getCurriculaMeta();
  }

  getCurriculaMeta(): void {
    this.curriculaService.getCurriculaMeta()
      .subscribe( curriculaMeta => this.curriculaMeta = curriculaMeta);
  }

}
