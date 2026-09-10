public class Mouse {
    private String merek;
    private String warna;
    private String jenisKoneksi;
    private String dpi;
    private int jumlahTombol;

    public Mouse(String merek, String warna, String jenisKoneksi, String dpi, int jumlahTombol) {
        this.merek = merek;
        this.warna = warna;
        this.jenisKoneksi = jenisKoneksi;
        this.dpi = dpi;
        this.jumlahTombol = jumlahTombol;
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

    public String getJenisKoneksi() {
        return jenisKoneksi;
    }

    public void setJenisKoneksi(String jenisKoneksi) {
        this.jenisKoneksi = jenisKoneksi;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public int getJumlahTombol() {
        return jumlahTombol;
    }

    public void setJumlahTombol(int jumlahTombol) {
        this.jumlahTombol = jumlahTombol;
    }

    public String klikKiri() {
        return merek + ": klik kiri ditekan";
    }

    public String klikKanan() {
        return merek + ": klik kanan ditekan";
    }

    public String scroll() {
        return merek + ": scroll digunakan";
    }

    public String menggerakkanPointer() {
        return merek + ": pointer digerakkan";
    }

    public String dragDrop() {
        return merek + ": drag & drop dilakukan";
    }

    public String getInfo() {
        String info = "";
        info += "Merek         : " + merek + "\n";
        info += "Warna         : " + warna + "\n";
        info += "Jenis Koneksi : " + jenisKoneksi + "\n";
        info += "DPI           : " + dpi + "\n";
        info += "Jumlah Tombol : " + jumlahTombol;
        return info;
    }
}