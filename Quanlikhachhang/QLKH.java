package quanlikhachhang;

import java.util.ArrayList;
import java.util.Scanner;

public class QLKH {
	public static void main(String[] args) {
		int[] Array;
		int n;
		ArrayList<Khachhang> danhsach = new ArrayList();
		int luachon; //so luong khach hang
		System.out.println("=====================");
		System.out.println("1. Nhap vao n khach hang.");
		System.out.println("2. Hien thi thong tin danh sach khach hang.");
		System.out.println("3. Hien thi khach hang co tong luong lon hon x.");
		System.out.println("4. Thoat chuong trinh");
		System.out.println("======================");
		Scanner key = new Scanner(System.in);
		do {
			System.out.println("Moi ban nhap vao lua chon: ");
			
			try {
				luachon = key.nextInt(); key.nextLine();
			}catch(NumberFormatException e) {
				luachon = 0;
				System.out.println("ban can nhap vao so nguyen");
			}
			
			switch(luachon) {
				case 1:{
					System.out.println("Nhap vao so luong khach hang: ");
					n = Integer.parseInt(key.nextLine());
					Array = new int[n];//tao lap so luong phan tu trong mang
					for(int i=0; i<Array.length;i++) {
						Khachhang KH = new Khachhang();
						System.out.println("Thong tin khach hang: "+(i+1));
						KH.nhapTT();
						danhsach.add(KH); //them khach hang vao danh sach 
					}
					break;
				}
				case 2:{
					System.out.println("thong tin khach hang co trong danh sach");
					for(int i =0;i<danhsach.size();i++) {
						System.out.println("Thong tin khach hang: "+(i+1));
						danhsach.get(i).HienthiTT();
					}
					break;
				}
				case 3:{
					int x;
					System.out.print("Nhap vao tong luong.");
					x=Integer.parseInt(key.nextLine());
					System.out.println("THONG TIN KHACH HANG CO LUONG LON HON GIA TRI LUONG BAN VUA NHAP: ");
					for(int i=0;i<danhsach.size();i++) {
						if(x<=danhsach.get(i).getTongLuong()) {
							danhsach.get(i).HienthiTT();
						}
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