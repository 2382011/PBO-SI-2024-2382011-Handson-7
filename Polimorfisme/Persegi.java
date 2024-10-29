package Polimorfisme;

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(final double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        System.out.println("Menghitung Luas Persegi");
        return super.luas();
    }

    @Override
    public double keliling() {
        System.out.println("Menghitung Keliling Persegi");
        return 4 * sisi;
    }
}