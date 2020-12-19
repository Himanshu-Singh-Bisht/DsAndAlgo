class Scooter extends Vehicle
{
    public void start()
    {
        System.out.println("Starts With Kick");
    }

    public static void main(String[] args) {
        // Vehicle v = new Vehicle();      // abstract class can't be instiated

        Car c = new Car();
        c.start();

        Scooter s = new Scooter();
        s.start();
    }
}