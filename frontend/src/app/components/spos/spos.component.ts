import { Component, OnInit } from '@angular/core';
import { SpoService } from '../../services/spo.service';
import { Spo } from '../../shared/models/spo';
import { CourseOfStudy } from '../../shared/models/course-of-study';
import * as _ from 'lodash';

@Component({
  selector: 'app-spos',
  templateUrl: './spos.component.html',
  styleUrls: ['./spos.component.scss']
})
export class SposComponent implements OnInit {
  spos: Spo[];
  coursesOfStudy: CourseOfStudy[];

  // TODO: somehow get list of courseOfStudies including degrees in courseOfStudies
  // TODO: somehow get

  constructor(private spoService: SpoService) { }

  ngOnInit() {
    this.getSpos();
  }

  getSpos(): void {
    this.spoService.getSpos()
      .subscribe(spos => this.initLists(spos));
  }

  initLists(spos: Spo[]): void {
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
