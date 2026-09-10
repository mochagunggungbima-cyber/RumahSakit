public class Keyboard {
    private String merek;
    private String warna;
    private String jenisKeyboard;
    private int jumlahTombol;
    private String jenisKoneksi;

    public Keyboard(String merek, String warna, String jenisKeyboard, int jumlahTombol, String jenisKoneksi) {
        this.merek = merek;
        this.warna = warna;
        this.jenisKeyboard = jenisKeyboard;
        this.jumlahTombol = jumlahTombol;
        this.jenisKoneksi = jenisKoneksi;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getJenisKeyboard() {
        return jenisKeyboard;
    }

    public void setJenisKeyboard(String jenisKeyboard) {
        this.jenisKeyboard = jenisKeyboard;
    }

    public int getJumlahTombol() {
        return jumlahTombol;
    }

    public void setJumlahTombol(int jumlahTombol) {
        this.jumlahTombol = jumlahTombol;
    }

    public String getJenisKoneksi() {
        return jenisKoneksi;
    }

    public void setJenisKoneksi(String jenisKoneksi) {
        this.jenisKoneksi = jenisKoneksi;
    }

    public String mengetik(String teks) {
        return merek + ": mengetik \"" + teks + "\"";
    }

    public String menekanTombol(String tombol) {
        return merek + ": tombol " + tombol + " ditekan";
    }

    public String menghapusTeks() {
        return merek + ": teks dihapus";
    }

    public String menggunakanShortcut(String shortcut) {
        return merek + ": shortcut " + shortcut + " digunakan";
    }

    public String mengirimInputKeKomputer() {
        return merek + ": input dikirim ke komputer";
    }

    public String getInfo() {
        String info = "";
        info += "Merek          : " + merek + "\n";
        info += "Warna          : " + warna + "\n";
        info += "Jenis Keyboard : " + jenisKeyboard + "\n";
        info += "Jumlah Tombol  : " + jumlahTombol + "\n";
        info += "Jenis Koneksi  : " + jenisKoneksi;
        return info;
    }
}