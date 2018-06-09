import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HsisShellComponent } from './hsis-shell.component';

describe('HsisShellComponent', () => {
  let component: HsisShellComponent;
  let fixture: ComponentFixture<HsisShellComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HsisShellComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HsisShellComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
