import { Component, OnInit } from '@angular/core';
import Airline from 'src/app/Entity/Airline';

@Component({
  selector: 'app-add-airline',
  templateUrl: './add-airline.component.html',
  styleUrls: ['./add-airline.component.css']
})
export class AddAirlineComponent implements OnInit {

  airline:Airline=new Airline;
  msg:string

  constructor() { }

  onSubmit(){


  }

  ngOnInit(): void {
  }

}
