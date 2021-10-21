import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MailComponent } from './components/mail/mail.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
// import { LoginComponent } from './components/login1/login.component';
import { SignupComponent } from './components/signup/signup.component';
import { AddProductComponent } from './components/add-product/add-product.component';
import { EditProductComponent } from './components/edit-product/edit-product.component';
import { ProductTableComponent } from './components/product-table/product-table.component';
import { HomePageComponent } from './components/home-page/home-page.component';
import { OrderTableAdminComponent } from './components/order-table-admin/order-table-admin.component';
import { CartComponent } from './components/cart/cart.component';
import { MyOrderComponent } from './components/my-order/my-order.component';
import { CommonModule } from '@angular/common';
import { ProductPageComponent } from './components/product-page/product-page.component';
// Material Form Controls

import { MatAutocompleteModule } from '@angular/material/autocomplete';
import { MatCheckboxModule } from '@angular/material/checkbox';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatRadioModule } from '@angular/material/radio';
import { MatSelectModule } from '@angular/material/select';
import { MatSliderModule } from '@angular/material/slider';
import { MatSlideToggleModule } from '@angular/material/slide-toggle';
// Material Navigation
import { MatMenuModule } from '@angular/material/menu';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatToolbarModule } from '@angular/material/toolbar';
// Material Layout
import { MatCardModule } from '@angular/material/card';
import { MatDividerModule } from '@angular/material/divider';
import { MatExpansionModule } from '@angular/material/expansion';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatListModule } from '@angular/material/list';
import { MatStepperModule } from '@angular/material/stepper';
import { MatTabsModule } from '@angular/material/tabs';
import { MatTreeModule } from '@angular/material/tree';
// Material Buttons & Indicators
import { MatButtonModule } from '@angular/material/button';
import { MatButtonToggleModule } from '@angular/material/button-toggle';
import { MatBadgeModule } from '@angular/material/badge';
import { MatChipsModule } from '@angular/material/chips';
import { MatIconModule } from '@angular/material/icon';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { MatProgressBarModule } from '@angular/material/progress-bar';
import { MatRippleModule } from '@angular/material/core';
// Material Popups & Modals
import { MatBottomSheetModule } from '@angular/material/bottom-sheet';
import { MatDialogModule } from '@angular/material/dialog';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { MatTooltipModule } from '@angular/material/tooltip';
// Material Data tables
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatSortModule } from '@angular/material/sort';
import { MatTableModule } from '@angular/material/table';

import { ScrollingModule } from '@angular/cdk/scrolling';

import { FlexLayoutModule } from '@angular/flex-layout';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NavbarAdminComponent } from './components/navbar-admin/navbar-admin.component';
import { NavbarUserComponent } from './components/navbar-user/navbar-user.component';

import { AuthGuard } from './auth.guard';
import { AdminGuard } from './admin.guard';
import { UserGuard } from './user.guard';
import { AuthQrComponent } from './components/auth-qr/auth-qr.component';
import { AuthOtpComponent } from './components/auth-otp/auth-otp.component';
import { NotificationModule } from './notification.module';

import { ForgotPasswordComponent } from './components/forgot-password/forgot-password.component';

import { RouterModule } from '@angular/router';
import {
	NbThemeModule,
	NbLayoutModule,
	NbButtonModule,
	NbFormFieldModule,
	NbIconModule,
	NbInputModule,
	NbCheckboxModule,
	NbCardModule,
	NbTabsetModule,
	NbListModule,
	NbToastrModule,
	NbStepperModule,
	NbSearchModule,
	NbSidebarModule,
	NbDialogModule,
} from '@nebular/theme';
import { NbEvaIconsModule } from '@nebular/eva-icons';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { SiginComponent } from './components/login/sigin.component';
import { CheckoutComponent } from './components/checkout/checkout.component';
import { GpayComponent } from './components/checkout/gpay/gpay.component';
import { GooglePayButtonModule } from '@google-pay/button-angular';
import { InterceptorService } from './components/loader/interceptor.service';

@NgModule({
	declarations: [
		MailComponent,
		AppComponent,
		SignupComponent,
		AddProductComponent,
		EditProductComponent,
		ProductTableComponent,
		HomePageComponent,
		OrderTableAdminComponent,
		CartComponent,
		MyOrderComponent,
		ProductPageComponent,
		NavbarAdminComponent,
		NavbarUserComponent,
		AuthQrComponent,
		AuthOtpComponent,
		ForgotPasswordComponent,
		// LoginComponent,
		DashboardComponent,
		SiginComponent,
		CheckoutComponent,
		GpayComponent,
	],
	imports: [
		NbSidebarModule,
		NbSearchModule,
		BrowserModule,
		AppRoutingModule,
		FormsModule,
		BrowserAnimationsModule,
		FlexLayoutModule,
		CommonModule,
		MatAutocompleteModule,
		MatCheckboxModule,
		MatDatepickerModule,
		MatFormFieldModule,
		MatInputModule,
		MatRadioModule,
		MatSelectModule,
		MatSliderModule,
		MatSlideToggleModule,
		MatMenuModule,
		MatSidenavModule,
		MatToolbarModule,
		MatCardModule,
		MatDividerModule,
		MatExpansionModule,
		MatGridListModule,
		MatListModule,
		MatStepperModule,
		MatTabsModule,
		MatTreeModule,
		MatButtonModule,
		MatButtonToggleModule,
		MatBadgeModule,
		MatChipsModule,
		MatIconModule,
		MatProgressSpinnerModule,
		MatProgressBarModule,
		MatRippleModule,
		MatBottomSheetModule,
		MatDialogModule,
		MatSnackBarModule,
		MatTooltipModule,
		MatPaginatorModule,
		MatSortModule,
		MatTableModule,
		ScrollingModule,
		HttpClientModule,
		NotificationModule,
		NbThemeModule.forRoot({ name: 'default' }),
		NbLayoutModule,
		NbEvaIconsModule,
		NbCardModule,
		NbListModule,
		NbIconModule,
		NbStepperModule,
		NbToastrModule.forRoot(),
		NbDialogModule.forRoot(),
		NbThemeModule.forRoot({ name: 'default' }),
		NbLayoutModule,
		NbEvaIconsModule,
		NbIconModule,
		NbCardModule,
		NbListModule,
		NbToastrModule.forRoot(),
		NbStepperModule,
		NbThemeModule.forRoot({ name: 'default' }),
		NbLayoutModule,
		NbEvaIconsModule,
		NbButtonModule,
		NbFormFieldModule,
		NbIconModule,
		FormsModule,
		NbInputModule,
		NbCheckboxModule,
		NbCardModule,
		NbTabsetModule,
		NbListModule,
		NbToastrModule.forRoot(),
		NbStepperModule,
		GooglePayButtonModule,
	],

	providers: [
		{ provide: HTTP_INTERCEPTORS, useClass: InterceptorService, multi: true },
		NotificationModule,
		AuthGuard,
		AdminGuard,
		UserGuard,
	],
	bootstrap: [AppComponent],
	entryComponents: [AuthQrComponent, AuthOtpComponent, MailComponent],
})
export class AppModule {}