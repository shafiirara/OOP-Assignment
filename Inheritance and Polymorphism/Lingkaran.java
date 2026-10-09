public class Lingkaran extends Bentuk {
    // Atribut private untuk jari-jari
    private double r;

    // Constructor (memanggil constructor 'Bentuk')
    public Lingkaran(double r, String warna) {
        super(warna);
        this.r = r;
    }

    // Getter & Setter
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    // Method hitung luas lingkaran
    public double hitungLuas() {
        return Math.PI * r * r;
    }

    // Overriding printInfo
    @Override
    public void printInfo() {
        System.out.println("Lingkaran berwarna " + getWarna() + ", luas = " + hitungLuas());
    }
}