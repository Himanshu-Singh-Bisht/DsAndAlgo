public class Dog extends Animal
{
    // Animal is a parent class of Dog class (IS - A relationship)
    public Dog()
    {

    }
    public static void main(String[] args) 
    {
        Dog d = new Dog();    
        d.eat();
    }
}