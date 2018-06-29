import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomRouterLink } from '../../shared/interfaces/custom-router-link';
import {HelloService} from '../../services/hello.service';

export const NAVLINKS: CustomRouterLink[] = [
  { routeString: '/sers', label: 'Studienprüfungsordnungen' },
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

  constructor(private router: Router, private helloService: HelloService) { }

  ngOnInit() {
    this.sideNavOpened = false;
    this.navLinks = NAVLINKS;
    this._router = this.router;

    console.log(this.getHelloMessage());
  }

  getHelloMessage() {
    this.helloService.getHelloMessage();
  }

  logout() {
    localStorage.removeItem('isLoggedIn');
    this.router.navigate(['/login']);
  }
}
