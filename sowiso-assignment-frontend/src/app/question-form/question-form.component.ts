import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {QaCombinedService} from '../qa-combined.service';
import {Router} from '@angular/router';
import {Question} from '../shared/Question.model';

@Component({
  selector: 'app-question-form',
  templateUrl: './question-form.component.html',
  styleUrls: ['./question-form.component.css']
})
export class QuestionFormComponent implements OnInit {

  questionForm: FormGroup;
  question: Question;

  constructor(private qaService: QaCombinedService,
              private router: Router) {
    this.question = {
      id: null,
      question: null,
      createdOn: null
    };
  }

  ngOnInit(): void {
    this.qaService.fetchQuestion().subscribe((data) => {
     this.question = data;
    });
    this.questionForm = new FormGroup({
      answer: new FormControl(0, [Validators.required, Validators.pattern('^[0-9]*$')])
    });
  }

  onSubmit(): void {
    this.qaService.sumbitAnswer(this.questionForm, this.question).subscribe(response => {
      this.router.navigate(['/answer'], {queryParams: {correct: response.correct, answer: response.answer}});
    });
  }

}
