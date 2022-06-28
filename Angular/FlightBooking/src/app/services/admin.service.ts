import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

const Base_URL = "http://localhost:8085/admin";

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http:HttpClient) { }

  addAirline(airline){
    return this.http.post(Base_URL+'/addAirline',airline)
  }

  addFlight(flight){
    return this.http.post(Base_URL+'/addFlight',flight)
  }
  
}
