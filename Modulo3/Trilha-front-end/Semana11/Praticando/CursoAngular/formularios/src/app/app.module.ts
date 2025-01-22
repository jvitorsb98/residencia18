import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TemplateFormModule } from './components/template-form/template-form.module';
import { DataFormModule } from './components/data-form/data-form.module';
import { CompartilhadoModule } from './components/share/compartilhado/compartilhado.module';

@NgModule({
  declarations: [
    AppComponent,
      ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    TemplateFormModule,
    DataFormModule,
    CompartilhadoModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
