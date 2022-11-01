import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CoordinadorTableviewComponent } from './coordinador-tableview.component';

describe('CoordinadorTableviewComponent', () => {
  let component: CoordinadorTableviewComponent;
  let fixture: ComponentFixture<CoordinadorTableviewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CoordinadorTableviewComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CoordinadorTableviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
