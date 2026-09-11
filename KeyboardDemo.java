public class KeyboardDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("           DEMO CLASS KEYBOARD           ");
        System.out.println("=========================================");

        // Instansiasi Objek 1
        Keyboard k1 = new Keyboard();
        k1.merek = "Logitech";
        k1.warna = "Hitam";
        k1.jenisKeyboard = "Mechanical";
        k1.jumlahTombol = 87;
        k1.jenisKoneksi = "Wireless Bluetooth";

        System.out.println("--- OBJEK KEYBOARD 1 ---");
        k1.displayInfo();
        k1.Mengetik();
        k1.menekanTombol();
        k1.mengirimInputKeKomputer();
        System.out.println("-----------------------------------------");

        // Instansiasi Objek 2
        Keyboard k2 = new Keyboard();
        k2.merek = "Razer";
        k2.warna = "Putih";
        k2.jenisKeyboard = "Membrane";
        k2.jumlahTombol = 104;
        k2.jenisKoneksi = "Kabel USB";

        System.out.println("--- OBJEK KEYBOARD 2 (SEBELUM UPDATE) ---");
        k2.displayInfo();
        System.out.println();

        // Update nilai atribut & Eksekusi method pada Objek 2
        System.out.println("--- OBJEK KEYBOARD 2 (SETELAH UPDATE ATRIBUT) ---");
        k2.warna = "Hitam-Merah"; // Update warna
        k2.jenisKoneksi = "Wireless 2.4GHz"; // Update koneksi
        k2.displayInfo();
        k2.menggunakanShortcut();
        k2.menghapusTeks();
        k2.mengirimInputKeKomputer();
        System.out.println("=========================================");
    }
}