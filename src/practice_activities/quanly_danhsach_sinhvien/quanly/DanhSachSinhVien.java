package practice_activities.quanly_danhsach_sinhvien.quanly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>(); //Nếu người ta k truyền,mình tạo ta 1 list (khai báo 1 arraylist)
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
    //thêm sinh viên vào danh sách
    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);//Thêm vào cuối
    }
    //In danh sách
    public void inDanhSachSinhVien() {
        for (SinhVien sinhvien: danhSach) {
            System.out.println(sinhvien );
        }
    }
    //Kiểm tra danh sách có rỗng hay k
    public boolean kiemTraDanhSachRong() {
        return this.danhSach.isEmpty();
    }
    //Lấy ra số lượng sv trong danh sách
    public int laySoLuongSinhVien() {
        return this.danhSach.size();
    }
    //Làm rỗng danh sách sinh viên
    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);
    }
    //Kiểm tra sinh viên có tồn tại, dựa trên msv
    public boolean kiemTraTonTai(SinhVien sv) {
        return this.danhSach.contains(sv);
    }
    //xóa 1 sinh ra khỏi danh sách,dựa trên msv
    public boolean xoaSinhVien(SinhVien sv) {
        return this.danhSach.remove(sv);
    }
    //Tìm kiếm tất cả sinh viên, nhập từ bàn phím
    public void timSinhVien(String ten) {
        for (SinhVien sinhVien: danhSach) {
            if (sinhVien.getHoVaTen().indexOf(ten)>= 0) {
                System.out.println(sinhVien);
            }
        }
    }
    //Xuất ra danh sachs sv có điểm từ cao đến thấp
    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
                    return 1;
                } else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
                    return -1;
                } else  {
                    return 0;
                }
            }
        });
    }

}
