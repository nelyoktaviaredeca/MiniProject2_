package model;

public class Gitar extends AlatMusik {
    private int jumlahSenar;

    public Gitar(String nama, double hargaSewa, int jumlahSenar) {
        super(nama, hargaSewa);
        this.jumlahSenar = jumlahSenar;
    }

    public String getNama() {
        return super.getNamaAlat(); // Mengambil nama dari kelas induk AlatMusik
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }

    public void setJumlahSenar(int jumlahSenar) {
        this.jumlahSenar = jumlahSenar;
    }

    public void tampilkanDetail() {
        System.out.println("Nama: " + getNama());
        System.out.println("Harga Sewa: " + getHargaSewa());
        System.out.println("Jumlah Senar: " + jumlahSenar);
    }
}
