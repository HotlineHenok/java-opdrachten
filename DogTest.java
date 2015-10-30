class Flea {
   
   // Properties of the class...
   public String name;
   
   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
   public String name;
   private int    age;
   public Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
      name     = aName;
      age      = anAge;
      dogsFlea = aFlea;
   }

   // Methods of the class...
   public String toString() {
      return "I am a dog called " + name +
             ", I am " + age + 
             "years old, and I have a flea named " + dogsFlea.name;
   }

}

class DogOwner {

   // Properties of the class...
   private String name;
   private int salary;
   public Dog ownersDog;

   // Constructor of the class...
   public DogOwner(String aName, int aSalary, Dog aDog) {
      name = aName;
      salary = aSalary;
      ownersDog = aDog; 
   }

   // Methods of the class...
   public String toString() {
      return "My name is " + name +
             ", I make " + salary +
             "and my dog's name is " + ownersDog.name;
   }
   
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      Flea p = new Flea("Pop");
      Flea s = new Flea("Squeak");
      Flea z = new Flea("Zip");

      Dog r = new Dog("Rex", 10, p);
      Dog j = new Dog("Jimbo", 10, s);
      Dog f = new Dog("Fido", 10, z);

      DogOwner a = new DogOwner("Angus", 1500, r);
      DogOwner b = new DogOwner("Brian", 1650, j);
      DogOwner c = new DogOwner("Charles", 1700, f);

      //System.out.print(r.toString());
      //System.out.print(j.toString());
      //System.out.print(f.toString());

      //System.out.print(a.toString());
      //System.out.print(b.toString());
      //System.out.print(c.toString());
   
      System.out.print(a.ownersDog.dogsFlea.toString());
   }  
}

