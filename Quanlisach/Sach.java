package Quanlisach;


import java.util.Scanner;

public class Sach {
	private String tenSach;
	private String tenTacGia;
	private int namXB;
	
	public Sach() {
		
	}
	
	public Sach(String tenSach, String tenTacGia, int namXB) {
		this.tenSach = tenSach;
		this.tenTacGia = tenTacGia;
		this.namXB = namXB;
	}
	
	public String getTenSach() {
		return tenSach;
	}
	
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	
	public String getTenTacGia() {
		return tenTacGia;
	}
	
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public int getNamXB() {
		return namXB;
	}
	
	public void setNamXB(int namXB) {
		this.namXB = namXB;
	}
	
	public void NhapTT() {
		Scanner key = new Scanner (System.in);
		System.out.println("Nhap ten sach: ");
		tenSach = key.nextLine();
		System.out.println("Nhap ten Tac Gia");
		tenTacGia = key.nextLine();
		
		while(true) {
			try {
				System.out.println("Nhap nam xuat ban: ");
				namXB = Integer.parseInt(key.nextLine());
				if(namXB<0) {
					throw new NumberFormatException();
				}
				break;
			} catch (Exception e) {
				System.out.println("Ban can nhap so nguyen duong");
			}
		}
	}
	
	public void HienThiTT() {
		System.out.println("Ten Sach: "+tenSach);
		System.out.println("Ten tac gia: "+tenTacGia);
		System.out.println("Nam Xuat ban: "+namXB);
	}
}
