class animal{
  private String name;   //encapsulation 
  private double weight;

  animal(){

  }
  animal(String name , double weigth){
    this.name=name;
    this.weight=weigth;
  }

  public void setName(String name){  //encapsulation 
    this.name=name;
  }

  public void setWeight(double weight){  //encapsulation 
    this.weight=weight;
  }

  public String getName(){  //encapsulation 
    return name;
  }

  public double getweight(){  //encapsulation 
    return weight;
  }

  public void about(){
    System.out.println("---------This is Animal----------");
  }


}

class dog extends animal{          //inheritance
      @Override
      public  void about(){        //method overriding  polymorphism
        System.out.println("Dog is barking !!!");
      }
}

class cat extends animal{        //inheritance
      @Override
      public void about(){       //method overriding  polymorphism
      System.out.println("Cat is meow meow !!!");
      }
}

public class Main {
    public static void main(String[] args) {
        
      dog d = new dog();    // class and object
      cat c = new cat();

      d.setName("pop");
      d.setWeight(11.11);

      c.setName("bob");
      c.setWeight(12.5);

      System.out.println(d.getName());
      System.out.println(d.getweight());

      System.out.println(c.getName());
      System.out.println(c.getweight());

      animal a = new animal();
      animal a1 = new dog();   // truly polymorphism
      animal a2 = new cat();  // truly polymorphism

      a.about();
      a1.about();
      a2.about();

      }
}
