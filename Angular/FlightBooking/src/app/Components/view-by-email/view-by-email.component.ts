import { Component, OnInit } from '@angular/core';
import Reservation from 'src/app/Entity/Reservation';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-view-by-email',
  templateUrl: './view-by-email.component.html',
  styleUrls: ['./view-by-email.component.css']
})
export class ViewByEmailComponent implements OnInit {

  reservations: Reservation[];
  
  email:''

  constructor(private userService:UserService) { }

  onSubmit(){

    if (this.email != null && this.email != '') {
      this.userService.findTicketByEmail(this.email).subscribe(response=>{
          console.log(response);
          this.reservations=response as Reservation[];      
      },error=>{
      console.log(error);     
      })
    }
  }
  
  ngOnInit(): void {
  }

}
