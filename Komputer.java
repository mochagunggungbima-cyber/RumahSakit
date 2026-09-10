public class Komputer {
    private String merek;
    private String processor;
    private String ram;
    private String kapasitasPenyimpanan;
    private String sistemOperasi;

    public Komputer(String merek, String processor, String ram, String kapasitasPenyimpanan, String sistemOperasi) {
        this.merek = merek;
        this.processor = processor;
        this.ram = ram;
        this.kapasitasPenyimpanan = kapasitasPenyimpanan;
        this.sistemOperasi = sistemOperasi;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getKapasitasPenyimpanan() {
        return kapasitasPenyimpanan;
    }

    public void setKapasitasPenyimpanan(String kapasitasPenyimpanan) {
        this.kapasitasPenyimpanan = kapasitasPenyimpanan;
    }

    public String getSistemOperasi() {
        return sistemOperasi;
    }

    public void setSistemOperasi(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
    }

    public String menyalakan() {
        return merek + ": komputer dinyalakan";
    }

    public String mematikan() {
        return merek + ": komputer dimatikan";
    }

    public String menjalankanProgram(String namaProgram) {
        return merek + ": menjalankan program " + namaProgram;
    }

    public String menyimpanData() {
        return merek + ": data disimpan";
    }

    public String mengolahData() {
        return merek + ": data diolah";
    }

    public String getInfo() {
        String info = "";
        info += "Merek                  : " + merek + "\n";
        info += "Processor              : " + processor + "\n";
        info += "RAM                    : " + ram + "\n";
        info += "Kapasitas Penyimpanan  : " + kapasitasPenyimpanan + "\n";
        info += "Sistem Operasi         : " + sistemOperasi;
        return info;
    }
}