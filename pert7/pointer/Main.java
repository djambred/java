class PersegiPanjang {
  double panjang;
  double lebar;
}
  
class Main {
  public static void main(String args[]) {
    PersegiPanjang p1 = new PersegiPanjang();
    //PersegiPanjang p2 = p1;  
    p1.panjang = 10;
    //p2.panjang = 10;
    System.out.println("Nilai p1 panjang : " + p1.panjang);
    //System.out.println("Nilai p2 panjang : " + p2.panjang);
    PersegiPanjang l1 = new PersegiPanjang();
    //PersegiPanjang l2 = l1;
    l1.lebar = 2;
    //l2.lebar = 2;
    System.out.println("Nilai l1 lebar : " + l1.lebar);
    //System.out.println("Nilai l2 lebar : " + l2.lebar);
    System.out.println("Luas : " + (p1.panjang*l1.lebar));
    System.out.println("Address of an object : " + l1.hashCode());
    }
}