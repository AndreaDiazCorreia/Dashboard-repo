import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './pages/login/login.component';
import { SignupComponent } from './pages/signup/signup.component';
import {GerenteDashboardComponent} from './pages/gerente/gerente-dashboard/gerente-dashboard.component';
import {CoordinadorDashboardComponent} from './pages/coordinador/coordinador-dashboard/coordinador-dashboard.component';
import {AdminDashboardComponent} from './pages/admin/admin-dashboard/admin-dashboard.component';
import {GerenteTableviewComponent} from './pages/gerente/gerente-tableview/gerente-tableview.component';
import {CoordinadorTableviewComponent} from './pages/coordinador/coordinador-tableview/coordinador-tableview.component';
import { AdminGuard } from './services/admin.guard';
import {AdminUserstableComponent} from './pages/admin/admin-userstable/admin-userstable.component';
import { GerenteGuard } from './services/gerente.guard';
import { CoordinadorGuard } from './services/coordinador.guard';

const routes: Routes = [
 {
  path : '',
  component: LoginComponent,
  pathMatch: 'full'
 },
 {
  path: 'signup',
  component: SignupComponent,
  pathMatch: 'full'
 },
 {
  path: 'login',
  component: LoginComponent,
  pathMatch: 'full'
 },
 {
  path:'admin',
  component: AdminDashboardComponent,
  canActivate: [AdminGuard],
  children:[
    {
      path: 'user-table',
      component: AdminUserstableComponent
    }
  ]
 },
 {
  path: 'gerente',
  component: GerenteDashboardComponent,
  canActivate: [GerenteGuard],
  children: [
    {
      path:'gerente-table',
      component: GerenteTableviewComponent
    }
  ]
 },
 {
  path: 'coordinador',
  component: CoordinadorDashboardComponent,
  canActivate: [CoordinadorGuard],
  children:[
    {
      path: 'coordinador-table',
      component: CoordinadorTableviewComponent
    }
  ]
 }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
