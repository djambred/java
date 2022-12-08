public class Segitiga {
    int alas;
    int tinggi;
 
    public Segitiga(int alas, int tinggi) {
         this.alas = alas;
         this.tinggi = tinggi;
     }
    public float luas(){
        return this.alas * this.tinggi;
    }
}