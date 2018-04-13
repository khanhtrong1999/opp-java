package QuanliHoDan;

import java.util.Scanner;

public class NhanSu {
	private String hoTen;
	private int tuoi;
	private int namSinh;
	private String ngheNghiep;
	
	public NhanSu() {
		
	}
	
	public NhanSu(String hoTen, int tuoi, int namSinh, String ngheNghiep) {
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.namSinh = namSinh;
		this.ngheNghiep = ngheNghiep;
	}
	
	public void NhapTT() {
		Scanner key = new Scanner(System.in);
		System.out.print("-Ho ten thanh vien: ");
		hoTen = key.nextLine();
		
		while(true) {
			try {
				System.out.print("-Tuoi: ");
				tuoi = Integer.parseInt(key.nextLine());
				if(tuoi<0) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Ban can nhap so nguyen duong.");
			}
		}
		
		while(true) {
			try {
				System.out.print("-Nam sinh: ");
				namSinh = Integer.parseInt(key.nextLine());
				if(namSinh<0) {
					throw new NumberFormatException();
				}
				break;
			} catch (Exception e) {
				System.out.println("ban can nhap so nguyen duong.");
			}
		}
		
		System.out.print("-Nghe nghiep: ");
		ngheNghiep = key.nextLine();
	}
	
	public void HienThiTT() {
		System.out.println("Ho ten thanh vien: "+ hoTen);
		System.out.println("Tuoi: "+tuoi);
		System.out.println("Nam sinh: "+namSinh);
		System.out.println("Nghe nghiep: "+ngheNghiep);
	}
}