package Pewarisan;

public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String jenisBahanBakar;

    public Mobil(String merek, String model, int tahunProduksi, int jumlahPintu, String jenisBahanBakar) {
        super(merek, model, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void tampilkanInfoMobil(){
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + this.jumlahPintu);
        System.out.println("Jenis Bahan Bakar: " + jenisBahanBakar);
    }
}
