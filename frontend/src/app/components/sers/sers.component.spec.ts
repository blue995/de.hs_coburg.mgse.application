import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SersComponent } from './sers.component';

describe('SpoComponent', () => {
  let component: SersComponent;
  let fixture: ComponentFixture<SersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
