import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SposComponent } from './spos.component';

describe('SpoComponent', () => {
  let component: SposComponent;
  let fixture: ComponentFixture<SposComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SposComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SposComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
