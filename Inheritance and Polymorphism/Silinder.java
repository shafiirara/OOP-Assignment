public class Silinder extends Lingkaran {
    private double tinggi;

    // Constructor (memanggil constructor 'Lingkaran')
    public Silinder(double tinggi, double r, String warna) {
        super(r, warna); // Meneruskan r dan warna ke constructor Lingkaran
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Method hitung volume silinder (Luas Alas * Tinggi)
    public double hitungVolume() {
        return hitungLuas() * tinggi; 
    }

    // Overriding printInfo
    @Override
    public void printInfo() {
        System.out.println("Silinder berwarna " + getWarna() + ", volume = " + hitungVolume());
    }
}
