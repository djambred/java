//parent
class Animal {
    public void animalSound() {
      System.out.println("Sound");
    }
  }

  //children
  class Dog extends Animal {
    @Override
    public void animalSound() {
      System.out.println("DOG");
    }
  }

  //children
  class Cat extends Animal {
    @Override
    public void animalSound() {
      System.out.println("CAT");
    }
  }

//main
public class Main {
    public static void main(String[] args) {
      Animal myAnimal = new Animal();  
      Animal myDog = new Dog(); 
      Animal myCat = new Cat(); 
      myAnimal.animalSound();
      myDog.animalSound();
      myCat.animalSound();
    }
}

//berdasarkan soal tugas latihan modul praktikum PBO