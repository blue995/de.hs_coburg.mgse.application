import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'getSem'
})
export class GetSemPipe implements PipeTransform {

  transform(value: String, type: String = 'complete'): String {
    let r = 'SUMMER_SEMESTER' ? 'Sommersemester' : 'Wintersemester';

    if (type === 'short') {
      r = 'SUMMER_SEMESTER' ? 'SS' : 'WS';
    }

    return r;
  }

}
