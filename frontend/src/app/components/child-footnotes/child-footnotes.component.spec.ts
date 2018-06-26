import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildFootnotesComponent } from './child-footnotes.component';

describe('ChildFootnotesComponent', () => {
  let component: ChildFootnotesComponent;
  let fixture: ComponentFixture<ChildFootnotesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildFootnotesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildFootnotesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
