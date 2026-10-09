public class Main {
    public static void main(String[] args) {
        // 1. Objek Bentuk
        Bentuk bentuk = new Bentuk("merah");
        bentuk.printInfo();

        // 2. Objek BujurSangkar (sisi: 5, warna: biru)
        BujurSangkar bujurSangkar = new BujurSangkar(5, "biru");
        bujurSangkar.printInfo();

        // 3. Objek Lingkaran (r: 7, warna: hijau)
        Lingkaran lingkaran = new Lingkaran(7, "hijau");
        lingkaran.printInfo();

        // 4. Objek Silinder (tinggi: 10, r: 7, warna: kuning)
        Silinder silinder = new Silinder(10, 7, "kuning");
        silinder.printInfo();
    }
}