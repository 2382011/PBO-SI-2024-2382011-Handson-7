package pewarisan;

import abstraksi.Kendaraan;

public class mobil extends Kendaraan {
    private int jumlahPintu;
    private String jenisBahanBakar;

    public mobil(final String meerek, final String model, final int tahunProduksi, final int jumlah) {
        super(merek,mobil, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.jumlahBahanBakar = jenisBahanBakar;
    }

    public mobil(int jumlahPintu, String jenisBahanBakar) {
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void tampilkanInfoMobil(){
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}
