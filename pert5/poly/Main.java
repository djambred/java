class Persegi {
    private int panjang;
    private int lebar;

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }


    public Persegi(){
        int p = 0;
        int l = 0;
    }

    public int luas(int p, int l){
        return p * l;
    }

    public int getLuas(){
        return luas(panjang, lebar);
    }

}

public class Main {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        p.setPanjang(12);
        p.setLebar(6);
 
        System.out.println("Panjang: " + p.getPanjang());
        System.out.println("Lebar: " + p.getLebar());
        System.out.println("Luas persegi: " + p.getLuas());
    }
 
}