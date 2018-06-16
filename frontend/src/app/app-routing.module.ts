import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';

/* route components */
import { LoginComponent } from './components/login/login.component';
import { AuthGuard } from './auth-guard.guard';
import { HsisShellComponent } from './components/hsis-shell/hsis-shell.component';
import { SersComponent } from './components/sers/sers.component';
import { CoursesComponent } from './components/courses/courses.component';
import { CurriculaComponent } from './components/curricula/curricula.component';
import {SerDetailComponent} from './components/ser-detail/ser-detail.component';


const routes: Routes = [
  { path: 'login', component: LoginComponent },
  {
    path: '', canActivate: [AuthGuard], component: HsisShellComponent,
    children: [
      { path: '', canActivate: [AuthGuard], component: SersComponent },
      { path: 'sers', canActivate: [AuthGuard], component: SersComponent },
      { path: 'sers/:id', canActivate: [AuthGuard], component: SerDetailComponent },
      { path: 'courses', canActivate: [AuthGuard], component: CoursesComponent },
      { path: 'curriculum', canActivate: [AuthGuard], component: CurriculaComponent },
    ]
  },
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
