import { InMemoryDbService } from 'angular-in-memory-web-api';

import { SPOS } from '../mocks/mock-spos';

export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const spos = SPOS;
    console.log(spos);
    return {spos};
  }
}
