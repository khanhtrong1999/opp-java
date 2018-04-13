package Quanlitiendien;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int luachon, n;
		BienLai[] danhsachHD=null;
		Scanner key = new Scanner(System.in);
		System.out.println("1. Nhap thong tin cho n ho dan.");
		System.out.println("2. Hien thi tat ca ho dan.");
		System.out.println("3. Thoat chuong trinh");
		System.out.println("============");
		do {
			System.out.println("Moi ban nhap lua chon: ");
			luachon = Integer.parseInt(key.nextLine());
			if(luachon<1||luachon>3) {
				System.out.println("Ban nhap khong hop le, vui long kiem tra lai");
			}
			
			switch(luachon) {
				case 1:{
					System.out.println("Nhap vao so luong ho dan: ");
					n=Integer.parseInt(key.nextLine());
					danhsachHD = new BienLai[n];
					
					for(int i=0;i<danhsachHD.length;i++) {
						System.out.println("Ho dan: "+(i+1));
						danhsachHD[i] = new BienLai();
						danhsachHD[i].NhapThongTin();
						
					}
					break;
				}
				case 2:{	
					System.out.println("Hien thi thong tin ho dan: ");
					for(int i=0;i<danhsachHD.length;i++) {
						danhsachHD[i].HienThiThongTin();
					}
					break;
				}
				case 3:{
					break;
				}
			}
		}
		while(luachon!=3);	
		}

}
