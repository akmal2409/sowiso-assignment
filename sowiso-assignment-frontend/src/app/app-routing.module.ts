import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterModule} from '@angular/router';
import {HomePageComponent} from './home-page/home-page.component';
import {WelcomeFormComponent} from './welcome-form/welcome-form.component';
import {QuestionFormComponent} from './question-form/question-form.component';
import {AnswerFormComponent} from './answer-form/answer-form.component';


const routes = [
  { path: '', component: HomePageComponent, children: [
      { path: '', component: WelcomeFormComponent },
      { path: 'question', component: QuestionFormComponent },
      { path: 'answer', component: AnswerFormComponent }
    ] }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
