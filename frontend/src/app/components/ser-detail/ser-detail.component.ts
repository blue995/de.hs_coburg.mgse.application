import {Component, ElementRef, Input, OnInit, ViewChild} from '@angular/core';
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
  @ViewChild('a4Sheet') elementView: ElementRef;
  viewHeight: number;

  constructor(
    private route: ActivatedRoute,
    private sersService: SersService
  ) { }

  ngOnInit() {
    this.getSer();
    this.viewHeight = this.elementView.nativeElement.offsetHeight;
    console.log(this.viewHeight);
  }

  getSer(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.sersService.getSer(id)
      .subscribe(ser => this.ser = ser);
  }

}
