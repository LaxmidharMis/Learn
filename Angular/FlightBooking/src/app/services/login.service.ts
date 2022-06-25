import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';



@Injectable({
  providedIn: 'root'
})
export class LoginService {

   Base_URL = "http://localhost:8085/admin";
   
  //calling server to generate token

generateToken(credentials:any){
 //generate token
 return this.http.post(`${this.Base_URL}/login`,credentials)};

  constructor( private http:HttpClient) { }

  //for login user
  loginUser(token) {
    localStorage.setItem("token", token);
    return true;
  }

  // to check user is login or not
  isLoggedIn() {
    let token = localStorage.getItem("token");
    if (token == undefined || token == null || token == '') {
      return false;
    } else {
      return true;
    }
  }

  // for logout user
  logoutUser() {
    localStorage.removeItem("token");
    return true;
  }

  //for getting token
  getToken(){
   return localStorage.getItem("token");
  }

}
