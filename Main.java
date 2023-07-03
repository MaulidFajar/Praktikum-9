// Nama   : Muhammad Maulid Fajar
// NIM    : G.111.20.0040
// Matkul : Pemrograman Berorientasi Objek

public class Main {

  public static void main(String[] args) {

    Buku buku1 = new Buku("B001", "Pemrograman Java");
    BukuLuar buku2 = new BukuLuar("B002", "Naruto");
    Petugas petugas1 = new Petugas("fajar", "001");
    Peminjam mhs1 = new Mahasiswa();
    mhs1.setNamaPeminjam("jafar");
    mhs1.setKodePeminjam("M001");

    mhs1.doLogin();
    // mhs1.doLogout();

      try{
          Peminjaman peminjaman = new Peminjaman(mhs1, petugas1, buku1);
          
          System.out.println("Nama Peminjam : " + peminjaman.getPeminjam().getNamaPeminjam());
          System.out.println("Kode Peminjam : " + peminjaman.getPeminjam().getKodePeminjam());
          System.out.println("Nama Petugas : " + peminjaman.getPetugas().getNamaPetugas());
          System.out.println("Judul Buku : " + peminjaman.getBuku().getNamaBuku());
      } catch(Exception e) {
          System.out.println("Terjadi Kesalahan : " + e.getMessage());
      } finally {
          System.out.println("Program Selesai");
      }
    }
  }
