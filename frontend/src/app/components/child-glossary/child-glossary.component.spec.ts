import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildGlossaryComponent } from './child-glossary.component';

describe('ChildGlossaryComponent', () => {
  let component: ChildGlossaryComponent;
  let fixture: ComponentFixture<ChildGlossaryComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildGlossaryComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildGlossaryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
