class PersegiPanjang {
    double panjang;
    double lebar;
}
    
class Pointer {
    public static void main(String args[]) {
        PersegiPanjang p1 = new PersegiPanjang();
        p1.panjang = 10;
        System.out.println("Nilai p1 panjang : " + p1.panjang);
        PersegiPanjang l1 = new PersegiPanjang();
        l1.lebar = 2;
        System.out.println("Nilai l1 lebar : " + l1.lebar);
        System.out.println("Luas : " + (p1.panjang*l1.lebar));
        System.out.println("Address of an object : " + l1.hashCode());
    }
}