import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HomeComponent } from './components/home/home.component';
import { LoginformComponent } from './components/loginform/loginform.component';
import { UserdashboardComponent } from './components/userdashboard/userdashboard.component';

const routes: Routes = [
  {
    path: '',
    component:HomeComponent,
    pathMatch:'full'
  },
  {
    path:'login',
    component:LoginformComponent,
    pathMatch:'full'
  },
  {
    path:'dashboard',
    component:DashboardComponent,
    pathMatch:'full'
  },
  {
    path:'userdashboard',
    component:UserdashboardComponent,
    pathMatch:'full'
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
