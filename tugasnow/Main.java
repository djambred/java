public class Main {
    public static void main(String[] args) {
        
        //Tugas tugas = new Tugas();
        PersegiP persegipanjang = new PersegiP(4,4);
        Segitiga segitiga = new Segitiga(6, 3);
        
        // memanggil method luas dan keliling
        //tugas.luas();        
        System.out.println("Luas persegi panjang: " + persegipanjang.luas());
        
        System.out.println("Luas segitiga: " + segitiga.luas());
        
    }
}