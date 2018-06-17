import {Component, Input, OnInit} from '@angular/core';
import {Course} from '../../shared/models/course';
import {CoursesService} from '../../services/courses.service';
import {ActivatedRoute} from '@angular/router';
import {CourseCatalogue} from '../../shared/models/course-catalogue';

@Component({
  selector: 'app-course-catalogue',
  templateUrl: './course-catalogue.component.html',
  styleUrls: ['./course-catalogue.component.scss']
})
export class CourseCatalogueComponent implements OnInit {

  @Input() courseCatalogue: CourseCatalogue;

  constructor(
    private route: ActivatedRoute,
    private coursesService: CoursesService
  ) { }

  ngOnInit() {
  }

}
