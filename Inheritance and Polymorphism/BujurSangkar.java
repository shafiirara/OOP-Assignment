public class BujurSangkar extends Bentuk {
    private double sisi;

    // Constructor (memanggil constructor superclass 'Bentuk')
    public BujurSangkar(double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    // Overriding method printInfo dari kelas Bentuk
    @Override
    public void printInfo() {
        System.out.println("Bujursangkar berwarna " + getWarna() + ", luas = " + hitungLuas());
    }
}
