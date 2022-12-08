public class Main {
    public static void main(String[] args) {
        
        PersegiP persegipanjang = new PersegiP(4,4);
        Segitiga segitiga = new Segitiga(6, 3);    
        System.out.println("Luas persegi panjang: " + persegipanjang.luas());
        System.out.println("Luas segitiga: " + segitiga.luas());
        
    }
}