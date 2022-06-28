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

  getAllAirline(){
    return this.http.get(Base_URL+'/allAirline');
  }

  deleteAirline(airline){
    return this.http.delete(Base_URL+"/deleteAirline/"+airline.id);
  }

  enableAirline(airline,id){
    return this.http.put(Base_URL+'/enableAirline/'+id,airline)
  }

  disableAirline(airline,id){
    return this.http.put(Base_URL+'/disableAirline/'+id,airline)
  }
  
}
