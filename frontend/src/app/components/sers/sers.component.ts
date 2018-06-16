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

  constructor(private sersService: SersService) { }

  ngOnInit() {
    this.getSersMeta();
  }

  getSersMeta(): void {
    this.sersService.getSersMeta()
      .subscribe(sersMeta => this.sersMeta = sersMeta);
  }
}
