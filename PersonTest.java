class Person {

   // Properties of the class...
   private String name;
   public int    age;
   private double height;
   private int years;
    
   // Constructor of the class...
   //public Person(String aName, int anAge, double aHeight) {
     // name = aName;
      //age  = anAge;
      //height = aHeight;
   //}

   // Methods of the class...
   public void growOlder() {
      age = age + 1;
   }
   public void growOlderBy(int aYear) {
      years = aYear;
      age = age + years;
   }
   public void giveKnighthood() {
      name = "Sir " + name; 
   }
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("my age is " + age);
      System.out.println("and my height is " + height);
      System.out.println();
      commentAboutAge();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
      if (age >= 60) {
         System.out.println("old person");
      }
   }
   

}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Person ls = new Person();
      Person wp = new Person();

      wp.growOlder();
      wp.giveKnighthood();

      ls.growOlderBy(10);

      ls.talk();
      System.out.println("my age is " + ls.age);
      System.out.println();
      
      wp.talk();
   }

}

