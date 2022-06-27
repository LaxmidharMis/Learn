import { AirlineService } from "../services/airline.service";
import Airline from "./Airline";

export default class Flight{
    id:number;
    flightNumber:string="";
    airlineName:number;
    departureCity:string="";
    arrivalCity:string="";
    meal:string="";
    dateOfDeparture:any="";
    bussinessSeat:number;
    nonBussinessSeat:number;
    price:number;
    airline:Airline;
}