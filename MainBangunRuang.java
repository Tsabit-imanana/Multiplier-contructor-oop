public class Main {
    public static void main(String[] args){
        System.out.println("========================== KUBUS ============================");
        
        // Membuat objek Kubus pertama dengan setter
        Kubus cube1 = new Kubus();
        cube1.setSisi(8.5);
        double volumeCube1 = cube1.hitungVolume();  // Menghitung volume
        System.out.println("Volume kubus 1 adalah: " + volumeCube1);

        // Membuat objek Kubus kedua menggunakan constructor
        Kubus cube2 = new Kubus(2.2);
        double volumeCube2 = cube2.hitungVolume();  // Menghitung volume
        System.out.println("Volume kubus 2 (constructor) adalah: " + volumeCube2);

        System.out.println("-------------------------------------------------------------");

        System.out.println("========================== BALOK ============================");
        
        // Membuat objek Balok pertama dengan setter
        Balok block1 = new Balok();
        block1.setPanjang(6);
        block1.setLebar(3.8);
        block1.setTinggi(2);
        double volumeBlock1 = block1.hitungVolume();  // Menghitung volume
        System.out.println("Volume balok 1 adalah: " + volumeBlock1);

        // Membuat objek Balok kedua menggunakan constructor
        Balok block2 = new Balok(7, 2.2, 8);
        double volumeBlock2 = block2.hitungVolume();  // Menghitung volume
        System.out.println("Volume balok 2 (constructor) adalah: " + volumeBlock2);

        System.out.println("-------------------------------------------------------------");

        System.out.println("========================== BOLA ============================");
        
        // Membuat objek Bola pertama dengan setter
        Bola ball1 = new Bola();
        ball1.setRadius(2);
        double volumeBall1 = ball1.hitungVolume();  // Menghitung volume
        System.out.println("Volume bola 1 adalah: " + volumeBall1);

        // Membuat objek Bola kedua menggunakan constructor
        Bola ball2 = new Bola(3);
        double volumeBall2 = ball2.hitungVolume();  // Menghitung volume
        System.out.println("Volume bola 2 (constructor) adalah: " + volumeBall2);

        System.out.println("-------------------------------------------------------------");

        System.out.println("========================== LIMAS PERSEGI ============================");
        
        // Membuat objek Limas Persegi pertama dengan setter
        LimasPersegi pyramid1 = new LimasPersegi();
        pyramid1.setSisi(6);
        pyramid1.setTinggi(8);

                double volumePyramid1 = pyramid1.hitungVolume();  // Menghitung volume
        System.out.println("Volume Limas Persegi 1 adalah: " + volumePyramid1);

        // Membuat objek Limas Persegi kedua menggunakan constructor
        LimasPersegi pyramid2 = new LimasPersegi(4, 6);
        double volumePyramid2 = pyramid2.hitungVolume();  // Menghitung volume
        System.out.println("Volume Limas Persegi 2 (constructor) adalah: " + volumePyramid2);

        System.out.println("-------------------------------------------------------------");

        System.out.println("========================== TABUNG ============================");
        
        // Membuat objek Tabung pertama dengan setter
        Tabung tube1 = new Tabung();
        tube1.setRadius(4);
        tube1.setTinggi(6);
        double volumeTube1 = tube1.hitungVolume();  // Menghitung volume
        System.out.println("Volume Tabung 1 adalah: " + volumeTube1);

        // Membuat objek Tabung kedua menggunakan constructor
        Tabung tube2 = new Tabung(4, 6);
        double volumeTube2 = tube2.hitungVolume();  // Menghitung volume
        System.out.println("Volume Tabung 2 (constructor) adalah: " + volumeTube2);
    }
}
