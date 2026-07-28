import { createReducer, on } from '@ngrx/store';
import { loadCourses } from './course.actions';

export interface CourseState {
  courses: any[];
}

export const initialState: CourseState = {
  courses: []
};

export const courseReducer = createReducer(
  initialState,

  on(loadCourses, state => ({
    ...state,
    courses: [
      {
        name: 'Angular Development',
        duration: 40
      },
      {
        name: 'Java Full Stack',
        duration: 60
      },
      {
        name: 'Data Structures',
        duration: 45
      }
    ]
  }))
);