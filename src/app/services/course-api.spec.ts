import { TestBed } from '@angular/core/testing';
import { CourseApi } from './course-api';
import { provideHttpClient } from '@angular/common/http';

describe('CourseApi', () => {

  let service: CourseApi;

  beforeEach(() => {

    TestBed.configureTestingModule({
      providers: [
        provideHttpClient()
      ]
    });

    service = TestBed.inject(CourseApi);

  });


  it('should be created', () => {

    expect(service).toBeTruthy();

  });

});