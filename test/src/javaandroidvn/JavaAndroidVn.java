package javaandroidvn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SinhVien {

    public String hoTen;
    public int diem;
}

public class JavaAndroidVn {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số sinh viên: ");
        int n = input.nextInt();

        ArrayList<SinhVien> danhSach = new ArrayList();

        for (int i = 0; i < n; i++) {
           // input.nextLine();
            SinhVien x = new SinhVien();
            System.out.println("Thông tin sinh viên thứ " + i);
            System.out.print("Họ và Tên: ");
            input = new Scanner(System.in);
            x.hoTen = input.nextLine();
            System.out.print("Điểm: ");
            input = new Scanner(System.in);
            x.diem = input.nextInt();
            danhSach.add(x);
        }

        //Sắp xếp danh sách theo số điểm giảm dần!
        Collections.sort(danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.diem < sv2.diem) {
                    return 1;
                } else {
                    if (sv1.diem == sv2.diem) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });

        System.out.println("Danh sách sắp xếp theo thứ tự điểm giảm dần là: ");
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println("Tên: " + danhSach.get(i).hoTen + " Điểm: " + danhSach.get(i).diem);
        }
    }
}