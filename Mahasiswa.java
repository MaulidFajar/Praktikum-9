// Nama   : Muhammad Maulid Fajar
// NIM    : G.111.20.0040
// Matkul : Pemrograman Berorientasi Objek

public class Mahasiswa extends Peminjam{
  private String namaMhs;
  private String nim;

  @Override
  public void setKodePeminjam(String kodePeminjam) {
    this.nim = kodePeminjam;
  }

  @Override
  public String getKodePeminjam() {
    return this.nim;
  }

  @Override
  public void setNamaPeminjam(String namaPeminjam) {
    this.namaMhs = namaPeminjam;
  }

  @Override
  public String getNamaPeminjam() {
    return this.namaMhs;
  }

}
