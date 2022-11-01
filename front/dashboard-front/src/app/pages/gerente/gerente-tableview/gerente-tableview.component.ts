import { Component, OnInit } from '@angular/core';
import { TablesService } from 'src/app/services/tables.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-gerente-tableview',
  templateUrl: './gerente-tableview.component.html',
  styleUrls: ['./gerente-tableview.component.css']
})
export class GerenteTableviewComponent implements OnInit {

  tables: any = []

  constructor(private tableService: TablesService) { }

  ngOnInit(): void {
    this.tableService.listarTableGerente().subscribe(
      (dato:any) => {
        this.tables = dato;
        console.log(this.tables);
      },
      (error) => {
        console.log(error);
        Swal.fire('Error')
      }
    )
  }

}
