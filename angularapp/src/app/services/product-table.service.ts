import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ProductTableItem } from '../model/product_table';
import { admin_reports } from '../components/order-table-admin/order-table-admin.component';
@Injectable({
	providedIn: 'root',
})
export class ProductTableService {
	private baseURL = 'http://localhost:8080/admin';

	constructor(private httpClient: HttpClient) {}
	getEmployeesList(): Observable<ProductTableItem[]> {
		let token = localStorage.getItem('token');
		let headers: HttpHeaders = new HttpHeaders().set(
			'Authorization',
			'Bearer ' + token
		);

		return this.httpClient.get<ProductTableItem[]>(`${this.baseURL}`, {
			headers,
		});
	}
	deleteEmployee(id: any): Observable<Object> {
		let token = localStorage.getItem('token');
		let headers: HttpHeaders = new HttpHeaders().set(
			'Authorization',
			'Bearer ' + token
		);
		return this.httpClient.get<Object>(
			`${'http://localhost:8080/admin/delete'}/${id}`,
			{ headers }
		);
	}
	GetItemById(id: any): Observable<ProductTableItem> {
		let token = localStorage.getItem('token');
		let headers: HttpHeaders = new HttpHeaders().set(
			'Authorization',
			'Bearer ' + token
		);
		return this.httpClient.get<ProductTableItem>(
			`${'http://localhost:8080/admin/productEdit'}/${id}`,
			{ headers }
		);
	}
	UpdateProductDetail(id: any, employee: ProductTableItem): Observable<Object> {
		let token = localStorage.getItem('token');
		let headers: HttpHeaders = new HttpHeaders().set(
			'Authorization',
			'Bearer ' + token
		);
		return this.httpClient.post(
			`${'http://localhost:8080/admin/productEdit'}/${id}`,
			employee,
			{ headers }
		);
	}
	getallorderadmin(): Observable<admin_reports[]> {
		let token = localStorage.getItem('token');
		let headers: HttpHeaders = new HttpHeaders().set(
			'Authorization',
			'Bearer ' + token
		);
		return this.httpClient.get<admin_reports[]>(
			`${'http://localhost:8080/admin/orders'}`,
			{ headers }
		);
	}
}
