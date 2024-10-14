package model;

public class Trompet extends AlatMusik {
    private int jumlahBarang;

    public Trompet(String nama, double hargaSewa, int jumlahBarang) {
        super(nama, hargaSewa);
        this.jumlahBarang = jumlahBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("Nama Alat: " + getNama());
        System.out.println("Harga Sewa: " + getHargaSewa());
        System.out.println("Jumlah Barang: " + jumlahBarang);
    }

    private String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
