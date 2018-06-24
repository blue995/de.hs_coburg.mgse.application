import { Pipe, PipeTransform } from '@angular/core';
import { NAVLINKS } from '../../components/hsis-shell/hsis-shell.component';
import * as _ from 'lodash';

@Pipe({
  name: 'getRouteLabel'
})
export class GetRouteLabelPipe implements PipeTransform {

  transform(value: String): String {
    let routeName = '';
    for (let i = 0; i < NAVLINKS.length; i++) {
      if (_.startsWith(value, NAVLINKS[i].routeString)) {
        routeName = NAVLINKS[i].label;
      }
    }

    return routeName;
  }

}
