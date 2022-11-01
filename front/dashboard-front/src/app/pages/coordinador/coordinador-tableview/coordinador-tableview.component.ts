import { Component, OnInit } from '@angular/core';
import { TableCoordService } from '../../../services/table-coord.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-coordinador-tableview',
  templateUrl: './coordinador-tableview.component.html',
  styleUrls: ['./coordinador-tableview.component.css']
})
export class CoordinadorTableviewComponent implements OnInit {

  tables: any = []

  constructor( private tableService: TableCoordService) { }

  ngOnInit(): void {
    this.tableService.listarTableCoordinador().subscribe(
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
