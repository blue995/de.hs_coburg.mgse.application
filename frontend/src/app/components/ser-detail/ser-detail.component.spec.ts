import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SerDetailComponent } from './ser-detail.component';

describe('SerDetailComponent', () => {
  let component: SerDetailComponent;
  let fixture: ComponentFixture<SerDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SerDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SerDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
