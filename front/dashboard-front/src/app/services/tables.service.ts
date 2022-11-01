import {HttpClient} from '@angular/common/http'
import {Injectable} from '@angular/core'
import baseUrl from './helper'

@Injectable({
  providedIn: 'root'
})
export class TablesService {
  constructor (private http: HttpClient){}

  public listarTableGerente(){
    return this.http.get(`${baseUrl}/gerente_dash/`);
  }
  public listarTableCoordinador(){
    return this.http.get(`${baseUrl}/coordinador_dash/`);
  }
}
