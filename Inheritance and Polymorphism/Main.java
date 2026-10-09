public class Main {
    public static void main(String[] args) {
        // Objek Bentuk
        Bentuk bentuk = new Bentuk("merah");
        bentuk.printInfo();

        // Objek BujurSangkar (sisi: 5, warna: biru)
        BujurSangkar bujurSangkar = new BujurSangkar(5, "biru");
        bujurSangkar.printInfo();

        // Objek Lingkaran (r: 7, warna: hijau)
        Lingkaran lingkaran = new Lingkaran(7, "hijau");
        lingkaran.printInfo();

        // Objek Silinder (tinggi: 10, r: 7, warna: kuning)
        Silinder silinder = new Silinder(10, 7, "kuning");
        silinder.printInfo();
    }
}
