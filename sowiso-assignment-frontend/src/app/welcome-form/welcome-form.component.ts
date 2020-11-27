import { Component, OnInit } from '@angular/core';
import {Route, Router} from '@angular/router';

@Component({
  selector: 'app-welcome-form',
  templateUrl: './welcome-form.component.html',
  styleUrls: ['./welcome-form.component.css']
})
export class WelcomeFormComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  onStart(): void {
    this.router.navigate(['/question']);
  }
}
