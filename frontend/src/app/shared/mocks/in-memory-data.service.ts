import { InMemoryDbService } from 'angular-in-memory-web-api';

// import { SERS } from './mock-sers';
import { SERS_META } from './mock-sers-meta';

export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    // const sers = SERS;
    const sers = SERS_META;

    return {sers};
  }
}
