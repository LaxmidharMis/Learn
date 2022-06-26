import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AirlineService {

  Base_URL = "http://localhost:8085/admin";

getAdmin(){
  return this.http.get(`${this.Base_URL}/test`);
}

  constructor(private http:HttpClient) { }
}
