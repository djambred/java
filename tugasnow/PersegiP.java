public class PersegiP{
    int panjang;
    int lebar;
    
    public PersegiP(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public float luas() {
        return this.panjang * this.lebar;
    }
    
}