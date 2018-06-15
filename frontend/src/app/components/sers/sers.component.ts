import { Component, OnInit } from '@angular/core';
import { SersService } from '../../services/sers.service';
import { Ser } from '../../shared/models/ser';
import { CourseOfStudy } from '../../shared/models/course-of-study';
import * as _ from 'lodash';

@Component({
  selector: 'app-spos',
  templateUrl: './sers.component.html',
  styleUrls: ['./sers.component.scss']
})
export class SersComponent implements OnInit {
  spos: Ser[];
  coursesOfStudy: CourseOfStudy[];

  // TODO: somehow get list of courseOfStudies including degrees in courseOfStudies

  constructor(private spoService: SersService) { }

  ngOnInit() {
    this.getSpos();
  }

  getSpos(): void {
    this.spoService.getSpos()
      .subscribe(spos => this.initLists(spos));
  }

  initLists(spos: Ser[]): void {
    this.spos = spos;

    if (!this.coursesOfStudy) {
      this.coursesOfStudy = [];
    }

    for (let i = 0; i < spos.length; i++) {
      if (!_.find(this.coursesOfStudy, ['name', spos[i].courseOfStudy.name])) {
        this.coursesOfStudy.push(spos[i].courseOfStudy);
      }
    }
    this.coursesOfStudy = _.sortBy(this.coursesOfStudy, ['name']);
    console.log(this.coursesOfStudy);
  }
}
