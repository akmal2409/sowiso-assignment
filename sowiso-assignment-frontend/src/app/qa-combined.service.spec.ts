import { TestBed } from '@angular/core/testing';

import { QaCombinedService } from './qa-combined.service';

describe('QaCombinedService', () => {
  let service: QaCombinedService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(QaCombinedService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
