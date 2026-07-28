import { Component } from '@angular/core';
import { FormGroup, FormControl, Validators, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-reactive-registration',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './reactive-registration.html',
  styleUrl: './reactive-registration.css'
})
export class ReactiveRegistration {

  studentForm = new FormGroup({

    name: new FormControl('', Validators.required),

    email: new FormControl('', [
      Validators.required,
      Validators.email
    ]),

    course: new FormControl('', Validators.required)

  });


  submitForm() {

    if(this.studentForm.valid){

      console.log(this.studentForm.value);

      alert("Reactive Form Submitted Successfully!");

    }

  }

}