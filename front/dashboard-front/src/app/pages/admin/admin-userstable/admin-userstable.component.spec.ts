import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminUserstableComponent } from './admin-userstable.component';

describe('AdminUserstableComponent', () => {
  let component: AdminUserstableComponent;
  let fixture: ComponentFixture<AdminUserstableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminUserstableComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdminUserstableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
