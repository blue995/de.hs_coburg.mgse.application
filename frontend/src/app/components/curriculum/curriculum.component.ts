import {Component, Input, OnInit} from '@angular/core';
import {Curriculum} from '../../shared/models/curriculum';
import {ActivatedRoute} from '@angular/router';
import {CurriculaService} from '../../services/curricula.service';

@Component({
  selector: 'app-curriculum',
  templateUrl: './curriculum.component.html',
  styleUrls: ['./curriculum.component.scss']
})
export class CurriculumComponent implements OnInit {

  @Input() curriculum: Curriculum;

  constructor(
    private route: ActivatedRoute,
    private curriculaService: CurriculaService
  ) { }

  ngOnInit() {
    this.getCurriculum();
  }

  getCurriculum(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.curriculaService.getCurriculum(id)
      .subscribe(curriculum => this.curriculum = curriculum);
  }

}
