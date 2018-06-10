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

  constructor(private spoService: SpoService) { }

  ngOnInit() {
    this.getSpos();
  }

  getSpos(): void {
    this.spoService.getSpos()
      .subscribe(spos => this.spos = spos);
  }
}
