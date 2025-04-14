package labtuan2;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

public HinhChuNhat(double dai, double rong) {
        this.chieuDai = dai;
        this.chieuRong = rong;
    }

public double getchieuDai() {
        return chieuDai;
    }

public void setchieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

public double getchieuRong() {
        return chieuRong;
    }

public void setchieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    @Override
public String toString() {
 return "Chieu dai: " + chieuDai +
        "\nChieu rong: " + chieuRong +
        "\nDien tich: " + tinhDienTich() +
        "\nChu vi: " + tinhChuVi();
    }
}
