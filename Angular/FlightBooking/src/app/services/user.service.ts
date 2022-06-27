import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import Flight from '../Entity/Flight';

const BASE_URL="http://localhost:8086/user";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  flights:Flight[];

searchFlight(search){
  return this.http.get(BASE_URL+'/searchFlight/'+search.date+'/'+search.from+'/'+search.to)
}

getFlight(id){
  return this.http.get(BASE_URL+'/flight/'+id)
}


// setFlightDetails(data){
//   this.flights=data;
// }

// getFlightDetails(){
//   return this.flights;
// }

  constructor(private http:HttpClient) { }
}
