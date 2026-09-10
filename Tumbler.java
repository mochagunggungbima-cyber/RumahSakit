public class Tumbler {
    private String merek;
    private String warna;
    private String kapasitas;
    private String bahan;
    private String suhuMinuman;

    public Tumbler(String merek, String warna, String kapasitas, String bahan, String suhuMinuman) {
        this.merek = merek;
        this.warna = warna;
        this.kapasitas = kapasitas;
        this.bahan = bahan;
        this.suhuMinuman = suhuMinuman;
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

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getSuhuMinuman() {
        return suhuMinuman;
    }

    public void setSuhuMinuman(String suhuMinuman) {
        this.suhuMinuman = suhuMinuman;
    }

    public String membukaTutup() {
        return merek + ": tutup dibuka";
    }

    public String menutupTutup() {
        return merek + ": tutup ditutup";
    }

    public String mengisiMinuman() {
        return merek + ": minuman diisi";
    }

    public String mengeluarkanMinuman() {
        return merek + ": minuman dikeluarkan";
    }

    public String menjagaSuhu() {
        return merek + ": suhu minuman dijaga pada " + suhuMinuman;
    }

    public String getInfo() {
        String info = "";
        info += "Merek        : " + merek + "\n";
        info += "Warna        : " + warna + "\n";
        info += "Kapasitas    : " + kapasitas + "\n";
        info += "Bahan        : " + bahan + "\n";
        info += "Suhu Minuman : " + suhuMinuman;
        return info;
    }
}