import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { MatSnackBar } from '@angular/material/snack-bar';
import Swal from 'sweetalert2';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

    public user ={
      username : '',
      password : '',
      name : '',
      lastName : '',
      email :''
    }



  constructor( private userService:UserService, private snack:MatSnackBar) { }

  ngOnInit(): void {
  }

  formSubmit(){
    console.log(this.user);
    if(this.user.username == '' || this.user.username == null){
      this.snack.open('Por favor ingrese un nombre de usuario', 'Aceptar',{
        duration: 3000,
        verticalPosition: 'top',
        horizontalPosition: 'right'
      });
      return;
    }
    if(this.user.password== '' || this.user.password == null){
      this.snack.open('Por favor ingrese una contraseña', 'Aceptar',{
        duration: 3000,
        verticalPosition: 'top',
        horizontalPosition: 'right'
      });
      return;
    }
    if(this.user.name== '' || this.user.name == null){
      this.snack.open('Por favor ingrese un nombre', 'Aceptar',{
        duration: 3000,
        verticalPosition: 'top',
        horizontalPosition: 'right'
      });
      return;
    }
    if(this.user.lastName== '' || this.user.lastName == null){
      this.snack.open('Por favor ingrese un apellido', 'Aceptar',{
        duration: 3000,
        verticalPosition: 'top',
        horizontalPosition: 'right'
      });
      return;
    }
    if(this.user.email== '' || this.user.email == null){
      this.snack.open('Por favor ingrese un email', 'Aceptar',{
        duration: 3000,
        verticalPosition: 'top',
        horizontalPosition: 'right'
      });
      return;
    }

    this.userService.addUser(this.user).subscribe(
      (data)=> {
        console.log(data);
        Swal.fire('Usuario guardado', 'Usuario registrado con exito', 'success')
      },(error) =>{
        console.log(error);
        this.snack.open('Usuario o email ya existente', 'Aceptar',{
          duration: 3000,
          verticalPosition: 'top',
          horizontalPosition: 'right'
        });
      }
      )


  }

}
