import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  valor:number = 20;
  deleteCiclo:boolean = false;

  mudarValor(){
    this.valor = 85;
  }

  deletarCiclo(){
    this.deleteCiclo = true;
  }
}
