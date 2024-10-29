package ContohKelasPertama;

public class Mobil {
    String warna;
    String merek;
    int kecepatanMaks;

    public Mobil(String warna, String merek, int kecepatanMaks) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilkanInfo() { // Changed from TampilkanInfo to tampilkanInfo
        System.out.println("Mobil Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan Maks: " + kecepatanMaks);
    }

    public void berjalan() {
        System.out.println("Mobil " + merek + " Sedang Berjalan"); // Added space before "Sedang"
    }

    public void berhenti() {
        System.out.println("Mobil " + merek + " Sedang Berhenti"); // Corrected "Berheti" to "Berhenti" and added space
    }
}