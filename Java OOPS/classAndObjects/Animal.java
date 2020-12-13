public class Animal
{

    String color;
    int age; 


    public void run()
    {
        System.out.println("I am running");
    }

    public void eat()
    {
        System.out.println("I am Eating");
    }

    public static void bark()
    {
        System.out.println("I am barking");
    }

    public void display()
    {
        System.out.println(color + " " + age);
    }

    public void initObj(String c , int a)
    {
        color = c;
        age = a;
    }
    public static void main(String[] args)
    {
        Animal obj1 = new Animal();
        obj1.run();


        // eat(); // this won't run as the method isn't static so it can't be run without the object of the class
        obj1.eat();

        bark();     // this method can run without calling via object bcoz it's static

        Birds obj2  = new Birds();
        obj2.fly();


        // Intializing object by reference variable
        Animal obj3 = new Animal();
        obj3.color = "Black";
        obj3.age = 10;
        obj3.display();


        // Initializing object by method
        Animal obj4 = new Animal();
        obj4.initObj("Black" , 10);
        obj4.display();
    }
}

