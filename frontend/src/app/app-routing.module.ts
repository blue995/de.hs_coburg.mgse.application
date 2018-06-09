import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';

/* route components */
import { LoginComponent } from './components/login/login.component';
import { AuthGuard } from './auth-guard.guard';
import { HsisShellComponent } from './components/hsis-shell/hsis-shell.component';
import { SpoComponent } from './components/spo/spo.component';
import { CoursesComponent } from './components/courses/courses.component';
import { CurriculumComponent } from './components/curriculum/curriculum.component';


const routes: Routes = [
  { path: 'login', component: LoginComponent },
  {
    path: '', canActivate: [AuthGuard], component: HsisShellComponent,
    children: [
      { path: '', canActivate: [AuthGuard], component: SpoComponent },
      { path: 'spo', canActivate: [AuthGuard], component: SpoComponent },
      { path: 'courses', canActivate: [AuthGuard], component: CoursesComponent },
      { path: 'curriculum', canActivate: [AuthGuard], component: CurriculumComponent },
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
