import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NavbarComponent } from './components/navbar/navbar.component';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginformComponent } from './components/loginform/loginform.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule } from '@angular/material/button';
import { HomeComponent } from './components/home/home.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { FormsModule } from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { HttpClientModule } from '@angular/common/http';
import { UserdashboardComponent } from './components/userdashboard/userdashboard.component'
import { LoginService } from './services/login.service';
import { AuthGuard } from './services/auth.guard';
//import { AuthInterceptor } from './services/auth.interceptor';
import { HTTP_INTERCEPTORS, HttpEvent } from '@angular/common/http';
import { AuthInterceptor } from './services/auth.interceptor';
//import { authInterceptorProviders } from './services/auth.interceptor';



@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    LoginformComponent,
    HomeComponent,
    DashboardComponent,
    UserdashboardComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatToolbarModule,
    FormsModule,
    MatFormFieldModule,
    MatInputModule,
    HttpClientModule
  ],
  providers: [[
    { provide: HTTP_INTERCEPTORS, useClass:AuthInterceptor, multi: true }
  ]],
  //providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
