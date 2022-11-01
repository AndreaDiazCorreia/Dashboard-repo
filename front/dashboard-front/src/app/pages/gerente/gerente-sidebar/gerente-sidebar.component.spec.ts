import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GerenteSidebarComponent } from './gerente-sidebar.component';

describe('GerenteSidebarComponent', () => {
  let component: GerenteSidebarComponent;
  let fixture: ComponentFixture<GerenteSidebarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GerenteSidebarComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GerenteSidebarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
