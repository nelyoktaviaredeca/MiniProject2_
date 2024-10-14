package model;

public abstract class AlatMusik {
    private String nama;
    private double hargaSewa;

    public AlatMusik(String nama, double hargaSewa) {
        this.nama = nama;
        this.hargaSewa = hargaSewa;
    }

    public String getNamaAlat() {
        return nama;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setNamaAlat(String nama) {
        this.nama = nama;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public void tampilkanDetail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
