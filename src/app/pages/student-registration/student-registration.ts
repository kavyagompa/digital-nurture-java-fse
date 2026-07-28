import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-student-registration',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './student-registration.html',
  styleUrl: './student-registration.css'
})
export class StudentRegistration {

  student = {
    name: '',
    email: '',
    course: ''
  };

  submitForm() {
    console.log(this.student);
    alert("Registration Successful!");
  }

}