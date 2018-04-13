package Quanlisach;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSach {
	public static void main(String[] args) {
		ArrayList<Sach> danhsach = new ArrayList<>();
		int n=0; //so luong sach
		int luachon;
		int[] Array = null;
		Scanner key = new Scanner(System.in);
		do {
			System.out.println("-------MENU------");
			System.out.println("1. Nhap thong tin sach");
			System.out.println("2. Hien thi thong tin sach");
			System.out.println("3. Sach xuat ban truoc nam n");
			System.out.println("4. Thoat");
			System.out.println("-------END-------");
			
			while(true) {
				try {
					System.out.println("Moi ban nhap lua chon");
					luachon = Integer.parseInt(key.nextLine());
					if(luachon<0) {
						throw new NumberFormatException();
					}
					break;
				} catch (Exception e) {
					System.out.println("Ban can nhap so nguyen duong");
				}
			}
		
			switch(luachon) {
				case 1:{
					while(true) {
						try {
							System.out.println("So luong sach: ");
							n = Integer.parseInt(key.nextLine());
							if(n<0) {
								throw new NumberFormatException();
							}
							break;
						} catch (Exception e) {
							System.out.println("Ban can nhap so nguyen duong");
						}
					}
					Array = new int [n]; //mang luu tru n quyen sach
					for(int i=0;i<Array.length;i++) {
						System.out.println("quyen sach thu: "+(i+1));
						Sach s = new Sach();
						s.NhapTT();
						danhsach.add(s); //them doi tuong cao danh sach
					}
					System.out.println("\n");
					break;
				}
				case 2:{
					for(int i=0;i<danhsach.size();i++) {
						danhsach.get(i).HienThiTT();
					}
					break;
				}
				case 3:{
					int nam;
					int dem=0;
					System.out.println("Nhap nam xuat ban: ");
					nam = Integer.parseInt(key.nextLine());
					for(int i=0;i<danhsach.size();i++) {
						if(nam>danhsach.get(i).getNamXB()) {
							danhsach.get(i).HienThiTT();
							dem++;
						}
					}
					System.out.println("\n");
					if(dem==0) {
						System.out.println("Khong co quyen sach nao truoc nam: "+nam);
					}
					break;
				}
				case 4:{
					break;
				}
			}
		}
		while(luachon!=4);
	}
}