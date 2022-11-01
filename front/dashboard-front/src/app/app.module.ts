import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './components/navbar/navbar.component';
import { SignupComponent } from './pages/signup/signup.component';
import { LoginComponent } from './pages/login/login.component';

/* Angular material */
import { AngularMaterialModule } from './angular-material.module';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { FlexLayoutModule } from '@angular/flex-layout';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HomeComponent } from './pages/home/home.component';
import { AdminDashboardComponent } from './pages/admin/admin-dashboard/admin-dashboard.component';
import { CoordinadorDashboardComponent } from './pages/coordinador/coordinador-dashboard/coordinador-dashboard.component';
import { GerenteDashboardComponent } from './pages/gerente/gerente-dashboard/gerente-dashboard.component';
import { UserDashboardComponent } from './pages/user/user-dashboard/user-dashboard.component';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import { authInterceptorProviders } from './services/auth.interceptor';
import { AdminSidebarComponent } from './pages/admin/admin-sidebar/admin-sidebar.component';
import { CoordinadorSidebarComponent } from './pages/coordinador/coordinador-sidebar/coordinador-sidebar.component';
import { GerenteSidebarComponent } from './pages/gerente/gerente-sidebar/gerente-sidebar.component';
import { GerenteTableviewComponent } from './pages/gerente/gerente-tableview/gerente-tableview.component';
import { CoordinadorTableviewComponent } from './pages/coordinador/coordinador-tableview/coordinador-tableview.component';
import { AdminUserstableComponent } from './pages/admin/admin-userstable/admin-userstable.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    SignupComponent,
    LoginComponent,
    HomeComponent,
    AdminDashboardComponent,
    CoordinadorDashboardComponent,
    GerenteDashboardComponent,
    UserDashboardComponent,
    AdminSidebarComponent,
    CoordinadorSidebarComponent,
    GerenteSidebarComponent,
    GerenteTableviewComponent,
    CoordinadorTableviewComponent,
    AdminUserstableComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    AngularMaterialModule,
    FlexLayoutModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    MatSnackBarModule


  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class AppModule { }
