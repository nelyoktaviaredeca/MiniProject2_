package sewaalatmusik;
import model.AlatMusik;
import model.Gitar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Management management = new Management();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("+----------------------------+");
            System.out.println("|         + Menu +           |");
            System.out.println("|  1.Tambah Alat Musik       |");
            System.out.println("|  2.Hapus Alat Musik        |");
            System.out.println("|  3.Update Alat Musik       |");
            System.out.println("|  4.Lihat Daftar Alat Musik |");
            System.out.println("|  5.Keluar                  |");
            System.out.println("+----------------------------+");
            System.out.print("Pilih menu:");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    management.tambahAlatMusik(scanner);
                    break;


                case 2:
                    System.out.print("Masukkan nama alat yang ingin dihapus: ");
                    String namaHapus = scanner.nextLine();
                    management.hapusAlatMusik(namaHapus);
                    break;

                case 3:
                    System.out.print("Masukkan nama alat yang ingin di-update: ");
                    String namaUpdate = scanner.nextLine();
                    System.out.print("Masukkan nama baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan harga sewa baru: ");
                    double hargaBaru = scanner.nextDouble();
                    scanner.nextLine(); // Konsumsi newline

                    AlatMusik alatBaru = new Gitar(namaBaru, hargaBaru, 6); // Asumsi menjadi gitar
                    management.updateAlatMusik(namaUpdate, alatBaru);
                    break;

                case 4:
                    management.lihatDaftarAlatMusik();
                    break;

                case 5:
                    System.out.println("+        Terimakasih telah menggunakan      +");
                     System.out.println("|        Aplikasi Sewa Alat Musik kami      |");
                     System.out.println("+           Sampai jumpa lagi!!!            +");
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
