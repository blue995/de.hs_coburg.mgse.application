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
import { GlossaryComponent, KeysPipe, OrderBy, TranslatePipe } from './components/glossary/glossary.component';

/* this will be removed once we start using our REST api */
import { HttpClientInMemoryWebApiModule } from 'angular-in-memory-web-api';
import { InMemoryDataService } from './shared/mocks/in-memory-data.service';
import { SerDetailComponent } from './components/ser-detail/ser-detail.component';
import { CourseCatalogueComponent } from './components/course-catalogue/course-catalogue.component';
import { CurriculumComponent } from './components/curriculum/curriculum.component';
import { RomanizePipe } from './shared/pipes/romanize.pipe';
import { GetSemPipe } from './shared/pipes/get-sem.pipe';

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
    KeysPipe,             // TEST
    TranslatePipe,        // TEST
    OrderBy, RomanizePipe, GetSemPipe
  ],
  imports: [
    BrowserModule, // make sure this import is on the top of the list
    HttpClientModule,
    // The HttpClientInMemoryWebApiModule module intercepts HTTP requests
    // and returns simulated server responses.
    // Remove it when a real server is ready to receive requests.
    HttpClientInMemoryWebApiModule.forRoot(
      InMemoryDataService, { dataEncapsulation: false }
    ),
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
