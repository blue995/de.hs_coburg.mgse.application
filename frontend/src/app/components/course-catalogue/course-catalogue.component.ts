import {Component, Input, OnInit} from '@angular/core';
import {Course} from '../../shared/models/course';
import {CoursesService} from '../../services/courses.service';
import {ActivatedRoute} from '@angular/router';
import {CourseCatalogue} from '../../shared/models/course-catalogue';
import * as _ from 'lodash';

@Component({
  selector: 'app-course-catalogue',
  templateUrl: './course-catalogue.component.html',
  styleUrls: ['./course-catalogue.component.scss']
})
export class CourseCatalogueComponent implements OnInit {

  @Input() courseCatalogue: CourseCatalogue;
  courses: Course[];

  constructor(
    private route: ActivatedRoute,
    private coursesService: CoursesService
  ) { }

  ngOnInit() {
    this.getCourseCatalogue();
  }

  getCourseCatalogue(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.coursesService.getCourseCatalogue(id)
      .subscribe(courseCatalogue => this.initCourseLists(courseCatalogue));
  }

  initCourseLists(courseCatalogue: CourseCatalogue) {
    const courses = [];
    _.forEach(courseCatalogue.courses, function(object, key) {
      Object.keys(object).map(e => {
        if (typeof object[e] === 'string' || object[e] instanceof String) {
          object[e] = object[e].replace(/\n/g, "<br />");
        }
      });
      courses.push(object);
    });
    this.courseCatalogue = courseCatalogue;
    this.courses = courses;
  }
}
