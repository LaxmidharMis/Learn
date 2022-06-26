import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  constructor() { }
  search = {
    from: '',
    to: '',
    date: ''
  }

  onSubmit() {

    if ((this.search.from != '' && this.search.to != '' && this.search.date != '') && (this.search.from != null && this.search.to != null && this.search.date != null)) {

    }

  }
  ngOnInit(): void {
  }

}
