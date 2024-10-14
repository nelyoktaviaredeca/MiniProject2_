package model;

// Interface untuk operasi CRUD
public interface CRUDOperations {
    void tambahAlatMusik(AlatMusik alat);
    void hapusAlatMusik(String namaAlat);
    void updateAlatMusik(String namaAlat, AlatMusik alatBaru);
    void lihatDaftarAlatMusik();
}

