import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Params, Router} from '@angular/router';
import {faAward, faExclamationCircle} from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-answer-form',
  templateUrl: './answer-form.component.html',
  styleUrls: ['./answer-form.component.css']
})
export class AnswerFormComponent implements OnInit {
  correct: boolean;
  answer: string;
  faAward = faAward;
  faFail = faExclamationCircle;

  constructor(private route: ActivatedRoute,
              private router: Router) { }

  ngOnInit(): void {
    this.route.queryParams.subscribe((params: Params) => {
      this.correct = (params['correct'] == 'true');
      this.answer = params['answer'];
    });

    console.log(this.correct);
  }

  onNext(): void {
    this.router.navigate(['/question']);
  }
}
