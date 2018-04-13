package QuanliHoDan;

import java.util.Scanner;

public class HoDan extends NhanSu {
	private int soThanhVien;
	private String soNha;
	
	//phuong thuc khoi tao mac dinh
	public HoDan() {
		
	}
	
	public HoDan(String hoTen, int tuoi, int namSinh, String ngheNghiep, int soThanhVien, String soNha) {
		super(hoTen, tuoi, namSinh, ngheNghiep);
		this.soThanhVien = soThanhVien;
		this.soNha = soNha;
	}
	NhanSu[] danhsach = null;
	@Override
	public void NhapTT() {
		Scanner key = new Scanner (System.in);
		while(true) {
			try {
				System.out.println("So thanh vien: ");
				soThanhVien = Integer.parseInt(key.nextLine());
				
				if(soThanhVien<0) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Ban can nhap so nguyen duong");
				
			}
		}
		
		danhsach = new NhanSu[soThanhVien];
		System.out.print("So nha: ");
		soNha = key.nextLine();

		for(int i =0;i<danhsach.length;i++) {
			System.out.println("Thong tin thanh vien thu: "+(i+1));
			danhsach[i] = new NhanSu();
			danhsach[i].NhapTT();
		}
	}
	
	@Override
	public void HienThiTT() {
		System.out.println("So thanh vien: "+soThanhVien);
		System.out.println("So nha"+soNha);
		for(int i=0;i<danhsach.length;i++) {
			danhsach[i].HienThiTT();
		}
	}
}

		