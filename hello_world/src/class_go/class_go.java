package class_go;


class Tree {
  int height;
  Tree() {
    prt("Planting a seedling");
    height = 0;
  }
  Tree(int i) {
    prt("Creating new Tree that is "
        + i + " feet tall");
    height = i;
  }
  void info() {
    prt("Tree is " + height
        + " feet tall");
  }
  void info(String s) {
    prt(s + ": Tree is "
        + height + " feet tall");
  }
  static void prt(String s) {
    System.out.println(s);
  }
}



class animal {
	
	int age;
	animal()
	{
		prt("animal is borned");
		age = 0;
	}
	
	animal(int a)
	{
		prt("catch animal age is " + a);
		age = a++;
	}
	
	void info()
	{
		prt("animal age is " + age);
		
	}
	
	void info(String s)
	{
		prt(s + "animal age is " + age);
		
	}
	
	static void prt(String s) {
	    System.out.println(s);
	  }
}
class Bush {
Bush(int i) {}
Bush(double d) {}
}

public class class_go {
	  private int i = 0;
	  class_go increment() {
	    i++;
	    System.out.println(this.i);
	    return this;
	  }
	  void print() {
	    System.out.println("i = " + i);
	  }
	  public static void main(String[] args) {
		class_go x = new class_go();
	    x.increment().increment().increment().print();
	  }
	} ///:~


public class class_go1 {
  public static void main(String[] args) {
    for(int i = 0; i < 5; i++) {
      Tree t = new Tree(i);
      t.info();
      t.info("overloaded method");
    }
    // Overloaded constructor:
    new Tree();
    new Bush(1);
    new animal();
    for(int j = 0; j<3; j++)
    {
    	animal o = new animal(j);
    	o.info();
    	o.info("this is duzi");
    	
    }
  }
  
  
} ///:~
