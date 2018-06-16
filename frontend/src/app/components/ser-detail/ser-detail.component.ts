import {Component, Input, OnInit} from '@angular/core';
import {SersService} from '../../services/sers.service';
import {Ser} from '../../shared/models/ser';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-ser-detail',
  templateUrl: './ser-detail.component.html',
  styleUrls: ['./ser-detail.component.scss']
})
export class SerDetailComponent implements OnInit {

  @Input() ser: Ser;

  constructor(
    private route: ActivatedRoute,
    private sersService: SersService
  ) { }

  ngOnInit() {
    this.getSer();
  }

  getSer(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.sersService.getSer(id)
      .subscribe(ser => this.ser = ser);
  }
}
