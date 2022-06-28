import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookFlightComponent } from './components/book-flight/book-flight.component';
import { CancelTicketComponent } from './Components/cancel-ticket/cancel-ticket.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { HomeComponent } from './components/home/home.component';
import { LoginformComponent } from './components/loginform/loginform.component';
import { SearchListComponent } from './components/search-list/search-list.component';
import { SearchComponent } from './components/search/search.component';
import { TicketbookPageComponent } from './components/ticketbook-page/ticketbook-page.component';
import { UserdashboardComponent } from './components/userdashboard/userdashboard.component';
import { ViewByPNRComponent } from './Components/view-by-pnr/view-by-pnr.component';
import { AuthGuard } from './services/auth.guard';



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
    pathMatch:'full',
    canActivate:[AuthGuard]
  },
  {
    path:'userdashboard',
    component:UserdashboardComponent,
    pathMatch:'full'
  },
  {
    path:'search',
    component:SearchComponent,
    pathMatch:'full'
  },
  {
    path:'searchlist',
    component:SearchListComponent,
    pathMatch:'full'
  },
  {
    path:'book/:id',
    component:BookFlightComponent,
    pathMatch:'full'
  },
  {
    path:'lastticket',
    component:TicketbookPageComponent,
    pathMatch:'full'
  },
  {
    path:'cancel',
    component:CancelTicketComponent,
    pathMatch:'full'
  },
  {
    path:'pnrticket',
    component:ViewByPNRComponent,
    pathMatch:'full'
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
