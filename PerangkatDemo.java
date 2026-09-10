public class PerangkatDemo {
    public static void main(String[] args) {
        // Instansiasi objek Tumbler
        Tumbler tumbler = new Tumbler("Stanley", "Hitam", "1.2 L", "Stainless Steel", "Panas");

        // Instansiasi objek Mouse
        Mouse mouse = new Mouse("Logitech", "Hitam", "Wireless", "1600 DPI", 6);

        // Instansiasi objek Keyboard
        Keyboard keyboard = new Keyboard("Royal Kludge", "Putih", "Mechanical", 87, "Wired");

        // Instansiasi objek Komputer
        Komputer komputer = new Komputer("Asus ROG", "Intel Core i7", "16 GB", "1 TB SSD", "Windows 11");

        // Instansiasi objek Handphone
        Handphone handphone = new Handphone("Asus ROG Phone", "Putih", "256 GB", "6000 mAh", "6.78 inch");

        // Menghubungkan Handphone dengan objek-objek lain (relasi asosiasi)
        handphone.setTumbler(tumbler);
        handphone.setMouse(mouse);
        handphone.setKeyboard(keyboard);
        handphone.setKomputer(komputer);

        // Menampilkan info lengkap Handphone beserta relasinya
        System.out.println(handphone.getInfo());

        // Contoh pemanggilan behavior/method
        System.out.println(handphone.menyalakan());
        System.out.println(handphone.membukaAplikasi("Kamera"));
        System.out.println(mouse.klikKiri());
        System.out.println(keyboard.mengetik("Hello World"));
        System.out.println(komputer.menjalankanProgram("Visual Studio Code"));
        System.out.println(tumbler.membukaTutup());
    }
}