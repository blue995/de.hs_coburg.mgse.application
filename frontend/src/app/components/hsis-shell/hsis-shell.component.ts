import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

const NAVLINKS: Object[] = [
  { link: '/spo', label: 'SPOs anzeigen' },
  { link: '/courses', label: 'Module anzeigen' },
  { link: '/curriculum', label: 'Studienpläne anzeigen' }
];

@Component({
  selector: 'app-hsis-shell',
  templateUrl: './hsis-shell.component.html',
  styleUrls: ['./hsis-shell.component.scss']
})
export class HsisShellComponent implements OnInit {

  sideNavOpened: boolean;
  navLinks: Object[];

  constructor(private router: Router) { }

  ngOnInit() {
    this.sideNavOpened = true;
    this.navLinks = NAVLINKS;
  }

  logout() {
    localStorage.removeItem('isLoggedIn');
    this.router.navigate(['/login']);
  }
}
