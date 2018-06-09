import { TestBed, inject } from '@angular/core/testing';

import { SpoService } from './spo.service';

describe('SpoService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SpoService]
    });
  });

  it('should be created', inject([SpoService], (service: SpoService) => {
    expect(service).toBeTruthy();
  }));
});
