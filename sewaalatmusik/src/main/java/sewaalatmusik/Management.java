package sewaalatmusik;

import model.AlatMusik;
import model.Gitar;
import model.Drum;
import model.Biola;
import model.Trompet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {
    private final List<AlatMusik> daftarSewa; // Menggunakan final untuk daftar alat musik

    public Management() {
        daftarSewa = new ArrayList<>(); // Inisialisasi daftar
    }

    public void tambahAlatMusik(Scanner scanner) {
        System.out.print("Masukkan jenis alat (Gitar/Drum/Biola/Trompet): ");
        String jenis = scanner.nextLine().toLowerCase();
        System.out.print("Masukkan harga sewa: ");
        double harga = scanner.nextDouble();
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline

        AlatMusik alat;
        switch (jenis) {
            case "gitar" -> alat = new Gitar("Gitar", harga, jumlahBarang);
            case "drum" -> alat = new Drum("Drum", harga, jumlahBarang);
            case "biola" -> alat = new Biola("Biola", harga, jumlahBarang);
            case "trompet" -> alat = new Trompet("Trompet", harga, jumlahBarang);
            default -> {
                System.out.println("Jenis alat musik tidak valid.");
                return;
            }
        }

    daftarSewa.add(alat);
    System.out.println("Alat musik " + alat.getNamaAlat() + " berhasil ditambahkan.");
}


    public void hapusAlatMusik(String namaAlat) {
        boolean ditemukan = false;
        for (int i = 0; i < daftarSewa.size(); i++) {
            if (daftarSewa.get(i).getNamaAlat().equalsIgnoreCase(namaAlat)) {
                daftarSewa.remove(i);
                System.out.println("Alat musik " + namaAlat + " berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Alat musik " + namaAlat + " tidak ditemukan.");
        }
    }

    public void updateAlatMusik(String namaAlat, AlatMusik alatBaru) {
        boolean ditemukan = false;
        for (int i = 0; i < daftarSewa.size(); i++) {
            if (daftarSewa.get(i).getNamaAlat().equalsIgnoreCase(namaAlat)) {
                daftarSewa.set(i, alatBaru);
                System.out.println("Alat musik " + namaAlat + " berhasil di-update.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Alat musik " + namaAlat + " tidak ditemukan.");
        }
    }

    public void lihatDaftarAlatMusik() {
        if (daftarSewa.isEmpty()) {
            System.out.println("Tidak ada alat musik yang disewa.");
        } else {
            System.out.println("Daftar Alat Musik:");
            for (AlatMusik alat : daftarSewa) {
                alat.tampilkanDetail(); // Asumsikan metode ini ada dalam kelas AlatMusik
                System.out.println("--------------------");
            }
        }
    }
}
