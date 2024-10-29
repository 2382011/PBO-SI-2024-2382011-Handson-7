package Polimorfisme;

public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(final double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        System.out.println("Menghitung Luas Lingkaran");
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double keliling() {
        System.out.println("Menghitung Keliling Lingkaran");
        return 8 * Math.PI * jariJari;
    }
}