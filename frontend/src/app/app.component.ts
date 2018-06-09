import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'HSIS';

  isLoggedIn() {
    return localStorage.getItem('isLoggedIn') === 'true';
  }
}
