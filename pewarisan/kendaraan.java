package pewarisan;

public class kendaraan(final String merek, final String model, final int tahunProduksi){
    this.merek = merek;
    this.model = model;
    this.tahunProduksi;
  }

    public void tampilkanInfo(){
        System.out.println("Merek : " + merek);
        System.out.println("Model : " + model);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }
}