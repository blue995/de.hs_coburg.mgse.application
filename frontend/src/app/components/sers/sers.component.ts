import { Component, OnInit } from '@angular/core';
import { SersService } from '../../services/sers.service';
import {SerMeta} from '../../shared/models/ser-meta';

@Component({
  selector: 'app-sers',
  templateUrl: './sers.component.html',
  styleUrls: ['./sers.component.scss']
})
export class SersComponent implements OnInit {
  sersMeta: SerMeta[];

  // TODO: somehow get list of courseOfStudies including degrees in courseOfStudies

  constructor(private sersService: SersService) { }

  ngOnInit() {
    this.getSersMeta();
  }

  getSersMeta(): void {
    this.sersService.getSersMeta()
      .subscribe(sersMeta => this.initLists(sersMeta));
  }

  initLists(sersMeta: SerMeta[]): void {
    this.sersMeta = sersMeta;
    /*
    if (!this.coursesOfStudy) {
      this.coursesOfStudy = [];
    }

    for (let i = 0; i < sersMeta.length; i++) {
      if (!_.find(this.coursesOfStudy, ['name', sersMeta[i].courseOfStudy.name])) {
        this.coursesOfStudy.push(sersMeta[i].courseOfStudy);
      }
    }
    this.coursesOfStudy = _.sortBy(this.coursesOfStudy, ['name']);
    console.log(this.coursesOfStudy);*/
  }
}
