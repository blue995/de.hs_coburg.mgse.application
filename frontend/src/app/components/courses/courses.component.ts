import { Component, OnInit } from '@angular/core';
import {CourseCatalogue} from '../../shared/models/course-catalogue';
import {CoursesService} from '../../services/courses.service';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.scss']
})
export class CoursesComponent implements OnInit {

  courseCataloguesMeta: CourseCatalogue[];

  constructor(private coursesService: CoursesService) { }

  ngOnInit() {
    this.getCourseMeta();
  }

  getCourseMeta(): void {
    this.coursesService.getCoursesMeta()
      .subscribe(courseCataloguesMeta => this.courseCataloguesMeta= courseCataloguesMeta)
  }
}
