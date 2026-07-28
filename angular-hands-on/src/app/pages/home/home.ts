import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { DatePipe, UpperCasePipe } from '@angular/common';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [FormsModule, DatePipe, UpperCasePipe],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home implements OnInit {

  studentName = "Kavya";

  today = new Date();

  courses = [
    {
      name: "Angular Development",
      duration: 40
    },
    {
      name: "Java Full Stack",
      duration: 60
    },
    {
      name: "Data Structures",
      duration: 45
    }
  ];

  enrolled = true;

  ngOnInit() {
    console.log("Home Component Initialized");
  }
}