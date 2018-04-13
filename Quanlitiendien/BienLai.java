package Quanlitiendien;

import java.util.Scanner;

public class BienLai  extends KhachHang{
	private int soMoi;
	private int soCu;
	private int soTienTra;
	
	public BienLai() {
		
	}
	public BienLai( String hoTen,int soNha,int soCongTo,int soMoi,int soCu) {
		super(hoTen,soNha,soCongTo);
		this.soCu=soCu;
		this.soMoi=soMoi;
		
		
	}
	@Override
	public void NhapThongTin() {
		Scanner sc=new Scanner(System.in);
		super.NhapThongTin();
		System.out.println("Chi so moi:");
		soMoi=Integer.parseInt(sc.nextLine());
		System.out.println("Chi so cu:");	
		soCu=Integer.parseInt(sc.nextLine());
		}
	@Override
	public void HienThiThongTin() {
		super.HienThiThongTin();
		System.out.println("Chi so moi:"+soMoi);	
		System.out.println("Chi so cu:"+soCu);	
		System.out.println("So tien phai tra:"+TinhTienDien());	
		
	}
	public int TinhTienDien() {
		soTienTra= (soMoi-soCu)*850000;
		return soTienTra;
		
	}
	

}
