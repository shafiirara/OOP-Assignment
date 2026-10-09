public class Lingkaran extends Bentuk {
    private double r; // jari ajri

    // Constructor (memanggil constructor 'Bentuk')
    public Lingkaran(double r, String warna) {
        super(warna);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double hitungLuas() {
        return Math.PI * r * r;
    }

    // Overriding printInfo
    @Override
    public void printInfo() {
        System.out.println("Lingkaran berwarna " + getWarna() + ", luas = " + hitungLuas());
    }
}
