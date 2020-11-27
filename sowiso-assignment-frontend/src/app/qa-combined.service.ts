import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Question} from './shared/Question.model';
import {map} from 'rxjs/operators';
import {FormGroup} from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class QaCombinedService {

  constructor(private httpClient: HttpClient) { }

  fetchQuestion(): Observable<any> {
    return this.httpClient
      .get<Question>('http://localhost:8080/api/question');
  }

  sumbitAnswer(questionForm: FormGroup, question: Question): Observable<any> {
    return this.httpClient.post('http://localhost:8080/api/answer/' + question.id, questionForm.value );
  }
}
