import { TestBed, inject } from '@angular/core/testing';

import { SersService } from './sers.service';

describe('SpoService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SersService]
    });
  });

  it('should be created', inject([SersService], (service: SersService) => {
    expect(service).toBeTruthy();
  }));
});
