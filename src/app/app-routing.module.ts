import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditProfileComponent } from './Pages/edit-profile/edit-profile.component';
import { FormationComponent } from './Pages/formation/formation.component';
import { HomeComponent } from './Pages/home/home.component';
import { JoinusComponent } from './Pages/joinus/joinus.component';
import { LoginComponent } from './Pages/login/login.component';

const routes: Routes = [
  {path:'', redirectTo:"home", pathMatch:"full"},
  {path:'formation', loadChildren: () => import('./Pages/formation-module/formation/formation.module').then(m=>m.FormationModule) },
  {path:'home', component:HomeComponent},
  {path:'joinus', component:JoinusComponent},
  {path:'login', component:LoginComponent},
  {path:'editprofile' ,component:EditProfileComponent} ,
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
