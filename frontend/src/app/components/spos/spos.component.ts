import { Component, OnInit } from '@angular/core';
import { SpoService } from '../../services/spo.service';
import { Spo } from '../../shared/models/spo';

@Component({
  selector: 'app-spos',
  templateUrl: './spos.component.html',
  styleUrls: ['./spos.component.scss']
})
export class SposComponent implements OnInit {
  spos: Spo[];

  // TODO: somehow get list of courseOfStudies including degrees in courseOfStudies
  // TODO: somehow get

  constructor(private spoService: SpoService) { }

  ngOnInit() {
    this.getSpos();
  }

  getSpos(): void {
    this.spoService.getSpos()
      .subscribe(spos => this.spos = spos);
  }
}
