package Quanlitiendien;

import java.util.Scanner;

public class KhachHang {
	private String hoTen;
	private int soNha;
	private int soCongTo;
	
	public KhachHang() {
		
	}
	public KhachHang(String hoTen,int soNha,int soCongTo) {
		this.hoTen=hoTen;
		this.soNha=soNha;
		this.soCongTo=soCongTo;
		
		
	}
	public void NhapThongTin() {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Ho ten Ho dan su dung: ");
		hoTen=sc.nextLine();
		System.out.println(" So nha: ");
		soNha=Integer.parseInt(sc.nextLine());
		System.out.println(" So cong to: ");
		soCongTo=Integer.parseInt(sc.nextLine());
		
	}
	public void HienThiThongTin() {
		System.out.println(" Ho ten Ho dan: "+hoTen);
		System.out.println(" So nha: "+soNha);
		System.out.println(" So cong to: "+soCongTo);
	}

}
