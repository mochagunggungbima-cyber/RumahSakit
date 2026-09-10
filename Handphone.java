public class Handphone {
    private String merek;
    private String warna;
    private String kapasitasPenyimpanan;
    private String baterai;
    private String ukuranLayar;

    // Relasi asosiasi dengan class lain
    private Tumbler tumbler;
    private Mouse mouse;
    private Keyboard keyboard;
    private Komputer komputer;

    public Handphone(String merek, String warna, String kapasitasPenyimpanan, String baterai, String ukuranLayar) {
        this.merek = merek;
        this.warna = warna;
        this.kapasitasPenyimpanan = kapasitasPenyimpanan;
        this.baterai = baterai;
        this.ukuranLayar = ukuranLayar;
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

    public String getKapasitasPenyimpanan() {
        return kapasitasPenyimpanan;
    }

    public void setKapasitasPenyimpanan(String kapasitasPenyimpanan) {
        this.kapasitasPenyimpanan = kapasitasPenyimpanan;
    }

    public String getBaterai() {
        return baterai;
    }

    public void setBaterai(String baterai) {
        this.baterai = baterai;
    }

    public String getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(String ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public Tumbler getTumbler() {
        return tumbler;
    }

    public void setTumbler(Tumbler tumbler) {
        this.tumbler = tumbler;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Komputer getKomputer() {
        return komputer;
    }

    public void setKomputer(Komputer komputer) {
        this.komputer = komputer;
    }

    public String menyalakan() {
        return merek + ": handphone dinyalakan";
    }

    public String mematikan() {
        return merek + ": handphone dimatikan";
    }

    public String mengisiDaya() {
        return merek + ": daya sedang diisi";
    }

    public String membukaAplikasi(String namaAplikasi) {
        return merek + ": membuka aplikasi " + namaAplikasi;
    }

    public String mengambilFoto() {
        return merek + ": foto diambil";
    }

    public String getInfo() {
        String info = "";
        info += "===== Handphone =====\n";
        info += "Merek                 : " + merek + "\n";
        info += "Warna                 : " + warna + "\n";
        info += "Kapasitas Penyimpanan : " + kapasitasPenyimpanan + "\n";
        info += "Baterai               : " + baterai + "\n";
        info += "Ukuran Layar          : " + ukuranLayar + "\n";

        if (tumbler != null) {
            info += "\n----- Terhubung dengan Tumbler -----\n";
            info += tumbler.getInfo() + "\n";
        }
        if (mouse != null) {
            info += "\n----- Terhubung dengan Mouse -----\n";
            info += mouse.getInfo() + "\n";
        }
        if (keyboard != null) {
            info += "\n----- Terhubung dengan Keyboard -----\n";
            info += keyboard.getInfo() + "\n";
        }
        if (komputer != null) {
            info += "\n----- Terhubung dengan Komputer -----\n";
            info += komputer.getInfo() + "\n";
        }

        return info;
    }
}