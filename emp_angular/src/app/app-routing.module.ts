//import {BrowserModule} from '@angular/platform-browser'
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
//import {AppRoutingModule,routingComponents} from './app.module';
import { DepartmentListComponent } from './department-list/department-list.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { HomeComponent } from './home/home.component';
import { NewemployeeComponent } from './newemployee/newemployee.component';

const routes: Routes = [{path:"departments",component:DepartmentListComponent},
{path:"employees",component:EmployeeListComponent},{path:"home",component:HomeComponent},{path:"newemployee",component:NewemployeeComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
//export const routingComponents=[DepartmentListComponent,EmployeeListComponent]

