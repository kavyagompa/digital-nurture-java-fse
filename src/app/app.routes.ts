import { Routes } from '@angular/router';
import { Home } from './pages/home/home';
import { CourseList } from './pages/course-list/course-list';
import { StudentProfile } from './pages/student-profile/student-profile';
import { StudentRegistration } from './pages/student-registration/student-registration';
import { ReactiveRegistration } from './pages/reactive-registration/reactive-registration';
import { CourseDetails } from './pages/course-details/course-details';

export const routes: Routes = [
  {
    path: '',
    component: Home
  },
  {
    path: 'courses',
    component: CourseList
  },
  {
    path: 'profile',
    component: StudentProfile
  },
  {
    path: 'register',
    component: StudentRegistration
  },
  {
    path: 'reactive-register',
    component: ReactiveRegistration
  },
  {
    path: 'course/:id',
    component: CourseDetails
  }
];