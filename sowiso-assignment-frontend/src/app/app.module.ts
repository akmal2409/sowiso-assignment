import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {AppRoutingModule} from './app-routing.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {FontAwesomeModule} from '@fortawesome/angular-fontawesome';
import {HttpClientModule} from '@angular/common/http';
import { WelcomeFormComponent } from './welcome-form/welcome-form.component';
import { HomePageComponent } from './home-page/home-page.component';
import { QuestionFormComponent } from './question-form/question-form.component';
import { AnswerFormComponent } from './answer-form/answer-form.component';
import { ValidationComponent } from './validation/validation.component';

@NgModule({
  declarations: [
    AppComponent,
    WelcomeFormComponent,
    HomePageComponent,
    QuestionFormComponent,
    AnswerFormComponent,
    ValidationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FontAwesomeModule,
    ReactiveFormsModule,
    HttpClientModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
