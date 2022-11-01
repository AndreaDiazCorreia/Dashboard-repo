import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CoordinadorSidebarComponent } from './coordinador-sidebar.component';

describe('CoordinadorSidebarComponent', () => {
  let component: CoordinadorSidebarComponent;
  let fixture: ComponentFixture<CoordinadorSidebarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CoordinadorSidebarComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CoordinadorSidebarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
