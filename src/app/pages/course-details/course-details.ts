import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-course-details',
  standalone: true,
  imports: [],
  templateUrl: './course-details.html',
  styleUrl: './course-details.css'
})
export class CourseDetails {

  courseId = '';

  constructor(private route: ActivatedRoute) {
    this.courseId = this.route.snapshot.paramMap.get('id') || '';
  }

}