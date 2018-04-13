package quanlikhachhang;

import java.util.Scanner;

public class Khachhang {
	private String Makh;
	private String Hoten;
	private int namsinh;
	private int tongluong;
	
	Khachhang()
	{}
	Khachhang(String Makh){
		this.Makh=Makh;
	}
Khachhang( String Makh,String Hoten,int namsinh,int tongluong){
	this.Makh=Makh;
	this.Makh=Hoten;
	this.namsinh=namsinh;
	this.tongluong=tongluong;
	
}
public String getMakh( String Makh) {
	return Makh;}
public void setMaKh(String Makh) {
	this.Makh=Makh;
	
}
public String getHoten( String Hoteh) {
	return Hoten;}
public void setHoTen(String Hoten) {
	this.Hoten=Hoten;
	
}
public int getNamsinh( int namsinh) {
	return namsinh;}
public void setNamsinh(int namsinh) {
	this.namsinh=namsinh;
	
}
public int getTongluong(int tongluong) {
	return tongluong;}
public void setMaKh(int tongluong) {
	this.tongluong=tongluong;
	
}
public void nhapTT() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Ma khach hang la : ");
	Makh=sc.nextLine();
	System.out.println("Ho ten khach hang la : ");
	Hoten=sc.nextLine();
	System.out.println("Nam sinh : ");
	namsinh=Integer.parseInt(sc.nextLine());
	System.out.println("Tong luong : ");
	tongluong=Integer.parseInt(sc.nextLine());
	
}
public void HienthiTT() {
	
	System.out.println("Ma khach hang:"+Makh);
	System.out.println("Ho ten khach hang"+Hoten);
	System.out.println("Nam sinh"+namsinh);
	System.out.println("Tong luong "+Makh);
}
public int getTongLuong() {
	return tongluong;
}

public void setTongLuong(int tongluong) {
	this.tongluong = tongluong;
}}