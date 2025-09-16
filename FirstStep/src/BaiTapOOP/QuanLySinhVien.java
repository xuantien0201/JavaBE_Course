package BaiTapOOP;

import java.util.ArrayList;
import java.util.List;

public class QuanLySinhVien {
	private List<SinhVien> ds = new ArrayList<>();
	
	public void dsAll() {
		if(ds.isEmpty()) {
			System.out.println("Danh Sach Rong");
		}
		for (SinhVien sv : ds) {
			System.out.println(sv);
		}
	}
	
	public void add(SinhVien sv) {
		ds.add(sv);
	}
	
	public void svYeu() {
		boolean found = false;
		for(SinhVien sv : ds) {
			if(sv.xepLoai().equals("Yếu")) {
				System.out.println(sv);
				found = true;
			}
		}
		if(!found) {
			System.out.println("Khong co sv nao Yeu");
		}
	}
	public void timTheoTen(String ten) {
        boolean found = false;
        for (SinhVien sv : ds) {
            if (sv.getHoTen().equalsIgnoreCase(ten)) {
                System.out.println(sv);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên tên: " + ten);
        }
    }

    public void timTheoMa(String ma) {
        boolean found = false;
        for (SinhVien sv : ds) {
            if (sv.getMaSV().equalsIgnoreCase(ma)) {
                System.out.println(sv);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sinh viên mã: " + ma);
        }
    }
	public void xoaSV(String ma) {
		boolean removed = ds.removeIf(sv -> sv.getMaSV().equalsIgnoreCase(ma));
		if(removed) {
			System.out.println("Xoa thanh cong");
		}else {
			System.out.println("Khong tim thay ma sv");
		}
	}
}
