import { Component } from '@angular/core';
import { AsyncPipe } from '@angular/common';
import { Store } from '@ngrx/store';
import { Observable } from 'rxjs';
import { loadCourses } from '../../store/course.actions';
import { selectCourses } from '../../store/course.selector';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [AsyncPipe],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})

export class CourseList {

  courses$!: Observable<any[]>;

  constructor(private store: Store<{courses: any[]}>) {

    this.courses$ = this.store.select(selectCourses);

    this.store.dispatch(loadCourses());

  }

}