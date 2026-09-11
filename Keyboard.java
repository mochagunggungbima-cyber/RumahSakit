public class Keyboard {
    // States / Atribut
    public String merek;
    public String warna;
    public String jenisKeyboard;
    public int jumlahTombol;
    public String jenisKoneksi;

    // Methods / Behavior
    public void Mengetik() {
        System.out.println("Keyboard " + merek + " sedang digunakan untuk mengetik.");
    }

    public void menekanTombol() {
        System.out.println("Tombol pada keyboard " + merek + " ditekan.");
    }

    public void menghapusTeks() {
        System.out.println("Menghapus teks menggunakan tombol Backspace/Delete.");
    }

    public void menggunakanShortcut() {
        System.out.println("Menjalankan kombinasi tombol shortcut pada keyboard " + merek + ".");
    }

    public void mengirimInputKeKomputer() {
        System.out.println("Mengirimkan sinyal input dari keyboard " + merek + " ke komputer via " + jenisKoneksi + ".");
    }

    public void displayInfo() {
        System.out.println("Merek          : " + merek);
        System.out.println("Warna          : " + warna);
        System.out.println("Jenis Keyboard : " + jenisKeyboard);
        System.out.println("Jumlah Tombol  : " + jumlahTombol);
        System.out.println("Jenis Koneksi  : " + jenisKoneksi);
    }
}