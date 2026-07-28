import { ComponentFixture, TestBed } from '@angular/core/testing';
import { CourseDetails } from './course-details';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';

describe('CourseDetails', () => {

  let component: CourseDetails;
  let fixture: ComponentFixture<CourseDetails>;

  beforeEach(async () => {

    await TestBed.configureTestingModule({

      imports: [CourseDetails],

      providers: [
        {
          provide: ActivatedRoute,
          useValue: {
            snapshot: {
              paramMap: {
                get: () => '1'
              }
            },
            paramMap: of({
              get: () => '1'
            })
          }
        }
      ]

    }).compileComponents();


    fixture = TestBed.createComponent(CourseDetails);
    component = fixture.componentInstance;

    fixture.detectChanges();

  });


  it('should create', () => {
    expect(component).toBeTruthy();
  });

});