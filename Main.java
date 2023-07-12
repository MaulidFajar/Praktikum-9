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


    Buku buku3 = new Buku("B001", "Pemrograman Java");
    BukuLuar buku4 = new BukuLuar("B002", "Naruto");
    Petugas petugas2 = new Petugas("fajar", "001");
    Peminjam mhs2 = new Mahasiswa();
    mhs2.setNamaPeminjam("jafar");
    mhs2.setKodePeminjam("M001");

    mhs2.doLogin();
    Peminjaman peminjaman1 = new Peminjaman(mhs1, petugas1, buku1);
          
    System.out.println("Nama Peminjam : " + peminjaman1.getPeminjam().getNamaPeminjam());
    System.out.println("Kode Peminjam : " + peminjaman1.getPeminjam().getKodePeminjam());
    System.out.println("Nama Petugas : " + peminjaman1.getPetugas().getNamaPetugas());
    System.out.println("Judul Buku : " + peminjaman1.getBuku().getNamaBuku());
    Denda denda1 = new Denda(peminjaman1, 5);
    System.out.println("Tagihan Denda : " + denda1.getTagihan());

    System.out.println("=============================================");
      try{
          Peminjaman peminjaman2 = new Peminjaman(mhs2, petugas2, buku3);
          
          System.out.println("Nama Peminjam : " + peminjaman2.getPeminjam().getNamaPeminjam());
          System.out.println("Kode Peminjam : " + peminjaman2.getPeminjam().getKodePeminjam());
          System.out.println("Nama Petugas : " + peminjaman2.getPetugas().getNamaPetugas());
          System.out.println("Judul Buku : " + peminjaman2.getBuku().getNamaBuku());
          Denda denda2 = new Denda(peminjaman2, 7);
          System.out.println("Tagihan Denda : " + denda2.getTagihan());

          System.out.println("=== Denda Dihapuskan ===");

          mhs1.addAntiDenda();

          System.out.println("Tagihan Denda : " + denda2.getTagihan());

          System.out.println("=== Denda Ditambahkan ===");

          mhs1.removeAntiDenda();
          System.out.println("Tagihan Denda : " + denda2.getTagihan());
      } catch(Exception e) {
          System.out.println("Terjadi Kesalahan : " + e.getMessage());
      } finally {
          System.out.println("Program Selesai");
      }
    }
  }
