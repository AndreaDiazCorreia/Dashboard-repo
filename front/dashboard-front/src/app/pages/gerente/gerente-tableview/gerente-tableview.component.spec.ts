import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GerenteTableviewComponent } from './gerente-tableview.component';

describe('GerenteTableviewComponent', () => {
  let component: GerenteTableviewComponent;
  let fixture: ComponentFixture<GerenteTableviewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GerenteTableviewComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GerenteTableviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
