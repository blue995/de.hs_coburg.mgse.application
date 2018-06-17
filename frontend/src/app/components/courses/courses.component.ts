import { Component, OnInit } from '@angular/core';
import {CoursesService} from '../../services/courses.service';
import {CourseCatalogueMeta} from '../../shared/models/course-catalogue-meta';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.scss']
})
export class CoursesComponent implements OnInit {

  courseCataloguesMeta: CourseCatalogueMeta[];

  constructor(private coursesService: CoursesService) { }

  ngOnInit() {
    this.getCourseMeta();
  }

  getCourseMeta(): void {
    this.coursesService.getCoursesMeta()
      .subscribe(courseCataloguesMeta => this.courseCataloguesMeta = courseCataloguesMeta);
  }
}
