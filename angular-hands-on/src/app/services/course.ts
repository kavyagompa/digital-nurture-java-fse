import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  courses = [
    {
      name: 'Angular Development',
      duration: 40
    },
    {
      name: 'Java Full Stack',
      duration: 60
    },
    {
      name: 'React Development',
      duration: 45
    }
  ];

  getCourses() {
    return this.courses;
  }

}