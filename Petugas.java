// Nama   : Muhammad Maulid Fajar
// NIM    : G.111.20.0040
// Matkul : Pemrograman Berorientasi Objek

public class Petugas {
  private String namaPetugas;
  private String nip;

  public Petugas(String namaPetugas, String nip) {
    this.namaPetugas = namaPetugas;
    this.nip = nip;
  }

  public String getNamaPetugas() {
    return this.namaPetugas;
  }

  public String getNip() {
    return this.nip;
  }
}
