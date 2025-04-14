package labtuan2;

public class Vehicle {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;

    public Vehicle() {

    }

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double tinhThue() {
        if (dungTich < 100)
            return triGia * 0.01;
        else if (dungTich <= 200)
            return triGia * 0.03;
        else
            return triGia * 0.05;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-15s %10d %,20.2f %,20.2f",
                tenChuXe, loaiXe, dungTich, triGia, tinhThue());
    }
}

