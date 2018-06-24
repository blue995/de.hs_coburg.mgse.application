import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

export const NAVLINKS: Object[] = [
  { routeString: '/sers', label: 'SPOs' },
  { routeString: '/courses', label: 'Modulhandbücher' },
  { routeString: '/curricula', label: 'Studienpläne' },
  { routeString: '/glossary', label: 'Glossar' }
];

@Component({
  selector: 'app-hsis-shell',
  templateUrl: './hsis-shell.component.html',
  styleUrls: ['./hsis-shell.component.scss']
})
export class HsisShellComponent implements OnInit {

  sideNavOpened: boolean;
  navLinks: Object[];
  _router: any;

  constructor(private router: Router) { }

  ngOnInit() {
    this.sideNavOpened = false;
    this.navLinks = NAVLINKS;
    this._router = this.router;
  }

  logout() {
    localStorage.removeItem('isLoggedIn');
    this.router.navigate(['/login']);
  }
}
