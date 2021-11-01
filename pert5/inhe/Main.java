abstract class Hewan {
    protected String nama;
    protected int jumKaki;
    protected boolean bisaTerbang = false;
    public Hewan(String nama, int kaki, boolean terbang) {
        this.nama = nama;
        jumKaki = kaki;
        bisaTerbang = terbang;
    }
    
    public abstract void bersuara();
    public void lihatHewan() {
        System.out.println("");
        System.out.println("nama : "+nama);
        System.out.println("jumlah kaki : "+jumKaki);
        System.out.println("bisa terbang : "+bisaTerbang);
    }
}

class Sapi extends Hewan {
    public Sapi() {
        super("sapi", 4, false);
    }

    public void bersuara() {
        System.out.println("\nmooo,moooo");
    }

}

class Perkutut extends Hewan {
    public Perkutut(){
        super("perkutut",2,true);
    }
    public void bersuara() {
        System.out.println("\ncuit, cuit, cuit");
    }
}

class Main {
    public static void main(String[] args) {
        Sapi s = new Sapi();
        Perkutut p = new Perkutut();
        s.lihatHewan();
        s.bersuara();

        p.lihatHewan();
        p.bersuara();
    }
}