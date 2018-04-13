package QuanliHoDan;

import java.util.Scanner;

public class main {
	public static void main(String[]args) {
		HoDan[] danhsachHD = null;
		int n=0; //so ho dan
		int luachon;
		Scanner key = new Scanner(System.in);
		do {
			System.out.println("---------MENU--------");
			System.out.println("1. Nhap thong tin cho n ho dan");
			System.out.println("2. Hien thi thong tin ho dan trong khu pho");
			System.out.println("3. Thoat chuong trinh");
			System.out.println("---------END---------");
			
			try {
				System.out.println("Moi ban nhap vao lua chon: ");
				luachon = Integer.parseInt(key.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Ban can nhap so nguyen duong.");
				luachon = 0;
			}
			
			switch(luachon) {
				case 1:{
					while(true) {
						try {
							System.out.println("So ho dan trong khu pho: ");
							n = Integer.parseInt(key.nextLine());
							if(n<0) {
								throw new NumberFormatException();
							}
							
							break;
						} catch (NumberFormatException e) {
							System.out.println("Ban can nhap so nguyen duong");
							
						}
					}
					danhsachHD = new HoDan[n]; //danh sahc luu tru n ho dan
					for(int i=0;i<danhsachHD.length;i++) {
						System.out.println("Ho dan thu: "+(i+1));
						danhsachHD[i]=new HoDan(); //cap phat o nho de luu tru
						danhsachHD[i].NhapTT();
					}
					break;
				}
				case 2:{
					System.out.println("-----DANH SACH THANH VIEN-----");
					for(int i=0;i<danhsachHD.length;i++) {
						System.out.println("Ho dan thu: "+(i+1));
						danhsachHD[i].HienThiTT();
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