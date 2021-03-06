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
import { SerDetailComponent } from './components/ser-detail/ser-detail.component';
import { CourseCatalogueComponent } from './components/course-catalogue/course-catalogue.component';
import { CurriculumComponent } from './components/curriculum/curriculum.component';
import { GlossaryComponent } from './components/glossary/glossary.component';


const routes: Routes = [
  { path: 'login', component: LoginComponent },
  {
    path: '', canActivate: [AuthGuard], component: HsisShellComponent,
    children: [
      { path: '', canActivate: [AuthGuard], component: SersComponent },
      { path: 'sers', canActivate: [AuthGuard], component: SersComponent },
      { path: 'sers/:id', canActivate: [AuthGuard], component: SerDetailComponent },
      { path: 'courses', canActivate: [AuthGuard], component: CoursesComponent },
      { path: 'courses/:id', canActivate: [AuthGuard], component: CourseCatalogueComponent },
      { path: 'curricula', canActivate: [AuthGuard], component: CurriculaComponent },
      { path: 'curricula/:id', canActivate: [AuthGuard], component: CurriculumComponent },
      { path: 'glossary', canActivate: [AuthGuard], component: GlossaryComponent },
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
