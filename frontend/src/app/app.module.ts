import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {
  MatButtonModule,
  MatCardModule,
  MatCheckboxModule, MatDividerModule, MatExpansionModule,
  MatFormFieldModule,
  MatIconModule,
  MatInputModule, MatListModule,
  MatSidenavModule,
  MatToolbarModule, MatTooltipModule
} from '@angular/material';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './components/login/login.component';
import { AuthGuard } from './auth-guard.guard';
import { HsisShellComponent } from './components/hsis-shell/hsis-shell.component';
import { SersComponent } from './components/sers/sers.component';
import { CoursesComponent } from './components/courses/courses.component';
import { CurriculaComponent } from './components/curricula/curricula.component';
import {
  GlossaryComponent,
  KeysPipe,
  LocalizedDatePipe,
  OrderBy,
  TranslatePipe
} from './components/glossary/glossary.component';

import { SerDetailComponent } from './components/ser-detail/ser-detail.component';
import { CourseCatalogueComponent } from './components/course-catalogue/course-catalogue.component';
import { CurriculumComponent } from './components/curriculum/curriculum.component';
import { RomanizePipe } from './shared/pipes/romanize.pipe';
import { GetSemPipe } from './shared/pipes/get-sem.pipe';
import { GetRouteLabelPipe } from './shared/pipes/get-route-label.pipe';
import { ChildGlossaryComponent } from './components/child-glossary/child-glossary.component';
import { ChildFootnotesComponent } from './components/child-footnotes/child-footnotes.component';

@NgModule({
  declarations: [
    AppComponent,
    HsisShellComponent,
    LoginComponent,
    SersComponent,
    CoursesComponent,
    CurriculaComponent,
    SerDetailComponent,
    CourseCatalogueComponent,
    CurriculumComponent,
    GlossaryComponent,
    KeysPipe,
    TranslatePipe,
    LocalizedDatePipe,
    OrderBy, RomanizePipe, GetSemPipe, GetRouteLabelPipe, ChildGlossaryComponent, ChildFootnotesComponent
  ],
  imports: [
    BrowserModule, // make sure this import is on the top of the list
    HttpClientModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatSidenavModule,
    MatCheckboxModule,
    MatIconModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatCardModule,
    MatExpansionModule,
    MatListModule,
    MatDividerModule,
    MatTooltipModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [AuthGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
