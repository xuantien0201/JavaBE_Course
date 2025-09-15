
public class DemoOOP {
	public static void main(String[] args) {
		sinhVien sinhVienA = new sinhVien("Nguyen Van A", "12A1", "19-02-2000");
		sinhVien sinhVienB = new sinhVien();
		sinhVienB.setHoTen("Nguyen Van B");
		
		giaoVien giaoVienA = new giaoVien();
		giaoVienA.tinhLuong();
		hieuTruong ht1 = new hieuTruong("Hieu Truong A", "A14", "19-03-1999");
		ht1.tinhLuong();
		System.out.println("Hieu truong co ten la: " + ht1.getHoTen());
		System.out.println("Kiem Tra: " + sinhVienA.getHoTen());
		System.out.println("Kiem Tra: " + sinhVienB.hoTen);
		giaoVienA.denTruong();
		
	}
}
class sinhVien {
	String hoTen;
	String lop;
	String ngaySinh;
	
	
	// phuong thuc khoi tao constructor co tham so truyen vao
	public sinhVien(String hoTen, String lop, String ngaysinh) {
		this.hoTen = hoTen;
		this.lop = lop;
		this.ngaySinh = ngaysinh;
	}
	// phuong thuc khoi tao constructor khong co tham so truyen vao
	public sinhVien() {
		
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
}

interface hanhDong {
	void denTruong();
}
class giaoVien extends sinhVien implements hanhDong  {
	String monHoc;

	public giaoVien(String hoTen, String lop, String ngaySinh) {
		super(hoTen, lop, ngaySinh);
	}
	public giaoVien() {
		
	}
	public void tinhLuong() {
		System.out.println("Luong giao vien 10tr");
	}
	@Override
	public void denTruong() {
		// TODO Auto-generated method stub
		System.out.println("Bang xe dap");
		
	}
	
}
				// ghi đè override
				// khi class con muốn định nghĩa lại 1 phương thức của class cha
				//  mục đích là class con thay đổi hoặc bổ sung vào phương thức
				//cha mà không làm thay đổi phương thức cha

class hieuTruong extends giaoVien {
	String quanLy;
	
	public hieuTruong(String hoTen, String lop, String ngaySinh) {
		super(hoTen, lop, ngaySinh);
	}
	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		super.tinhLuong();
		System.out.println("Luong Hieu Truong la 30tr");
	}
}
