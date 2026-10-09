public class Bentuk {
    // Atribut
    protected String warna;

    // Constructor
    public Bentuk(String warna) {
        this.warna = warna;
    }

    // Method Getter
    public String getWarna() {
        return warna;
    }

    // Method Setter
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Method printInfo
    public void printInfo() {
        System.out.println("Bentuk berwarna " + warna);
    }
}