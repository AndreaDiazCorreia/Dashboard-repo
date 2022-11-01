import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-coordinador-sidebar',
  templateUrl: './coordinador-sidebar.component.html',
  styleUrls: ['./coordinador-sidebar.component.css']
})
export class CoordinadorSidebarComponent implements OnInit {

  constructor( public login:LoginService) { }

  ngOnInit(): void {
  }

  public logout(){
    this.login.logout();
    window.location.reload();
  }

}
