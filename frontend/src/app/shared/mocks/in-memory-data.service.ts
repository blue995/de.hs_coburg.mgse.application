import { InMemoryDbService } from 'angular-in-memory-web-api';

import { SPOS } from './mock-sers';

export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const spos = SPOS;

    return {spos};
  }
}
