public class Silinder extends Lingkaran {
    // Atribut private untuk tinggi
    private double tinggi;

    // Constructor (memanggil constructor 'Lingkaran')
    public Silinder(double tinggi, double r, String warna) {
        super(r, warna); // Meneruskan r dan warna ke constructor Lingkaran
        this.tinggi = tinggi;
    }

    // Getter & Setter
    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Method hitung volume silinder (Luas Alas * Tinggi)
    public double hitungVolume() {
        return hitungLuas() * tinggi; // hitungLuas() diwarisi dari class Lingkaran
    }

    // Overriding printInfo
    @Override
    public void printInfo() {
        System.out.println("Silinder berwarna " + getWarna() + ", volume = " + hitungVolume());
    }
}