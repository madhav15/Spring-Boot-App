import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes} from '@angular/router';


import { AppComponent } from './app.component';
import { ListuserComponent } from './component/listuser/listuser.component';
import { UserformComponent } from './component/userform/userform.component';

const AppRoutes: Routes  = [
  { path: '', component : ListuserComponent},
  { path: 'op', component : UserformComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    ListuserComponent,
    UserformComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(AppRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
