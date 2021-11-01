class Hewan {
   void sound() {
      System.out.println("Jenis Suara Hewan");
   }
}

class Kucing extends Hewan {
   void sound() {
      System.out.println("Kucing Meong");
   }
}

class Anjing extends Hewan {
   void sound() {
      System.out.println("Anjing GukGuk");
   }

}
class Sapi extends Hewan {
   void sound() {
      System.out.println("Sapi Moo");
   }
}

public class Main {
   public static void main(String[] args) {
      Hewan a;
      a = new Kucing();
      a.sound();
      a = new Anjing();
      a.sound();
      a = new Sapi();
      a.sound();
   }
}