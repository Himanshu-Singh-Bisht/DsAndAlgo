class Employee
{
    int emp_id;
    String name;

    static String company = "HealthyWeathy";        // as the company name would be same for each empolyee 
                                                    // so it is made static sucha that it can be used by each 
                                                    // employee without giving it extra space each time 
                                                    // while creation of object.

    public Employee(int emp_id , String name)
    {
        this.emp_id = emp_id;
        this.name = name;
    }

    public void display()
    {
        System.out.println(this.emp_id + " - " + this.name  + " - " + company);
    }
    public static void main(String[] args) 
    {
        Employee e1 = new Employee(1 , "him");
        e1.display();

        Employee e2 = new Employee(2, "kim");
        e2.display();
    }
}