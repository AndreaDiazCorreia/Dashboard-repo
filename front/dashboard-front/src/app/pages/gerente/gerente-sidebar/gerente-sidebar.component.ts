import { Component, OnInit } from '@angular/core';

import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-gerente-sidebar',
  templateUrl: './gerente-sidebar.component.html',
  styleUrls: ['./gerente-sidebar.component.css']
})
export class GerenteSidebarComponent implements OnInit {

  constructor( public login:LoginService) { }

  ngOnInit(): void {
  }

  public logout(){
    this.login.logout();
    window.location.reload();
  }

}
