import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Collections;

public class HeapComparableAndComparator
{
    public static void main(String[] args)
    {

        // PRIORITY QUEUE FOR INTEGERS __________________________________
        int[] arr = {22 ,93, 3 , 111 , 11 , 1, 40 , 7 , 90};
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr)
        {
            p1.add(ele);
            p2.add(ele);
        }

        while(p1.size() != 0)
        {
            System.out.print(p1.remove() + " ");
        }
        System.out.println();
        while(p2.size() != 0)
        {
            System.out.print(p2.remove() + " ");
        }
        System.out.println();



        // PRIORITY QUEUE FOR STRING VALUES _______________________________________________________
        String[] strArr = {"Ram" , "Mohan" , "Neha" , "Anuj" , "Kirti" , "Rani" , "Akash"};
        PriorityQueue<String> q1 = new PriorityQueue<>();
        PriorityQueue<String> q2 = new PriorityQueue<>(Collections.reverseOrder());
        for(String ele : strArr)
        {
            q1.add(ele);
            q2.add(ele);
        }

        while(q1.size() != 0)
        {
            System.out.print(q1.remove() + " ");
        }
        System.out.println();
        while(q2.size() != 0)
        {
            System.out.print(q2.remove() + " ");
        }
        System.out.println();





        // THIS GET SORTED ACCORDING TO THE RNO. AS COMPARABLE IS WRITTEN FOR THE RNO.
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student(10 , 180 , 80));
        pq.add(new Student(8, 170 , 67));
        pq.add(new Student(11 , 190 , 80));
        pq.add(new Student(5 , 180 , 95));
        pq.add(new Student(15 , 185 , 70));

        while(pq.size() != 0)
        {
            System.out.println(pq.remove());
        }

        System.out.println();


        
        // HERE , WE HAVE IMPLEMENTED THE COMPARATOR FOR SORTING IN HT BASIS
        PriorityQueue<Student> pq2 = new PriorityQueue<>(new Comparator<Student>()
        {
            public int compare(Student s1 , Student s2)   // ANONYMOUS CLASS USED FOR THE COMPARATOR
            {
                if(s1.ht == s2.ht)
                {
                    return s1.wt - s2.wt;       // when height is equal then sort according to wt ,
                                                // otherwise , it was working according to comparable
                }
                // return s1.ht - s2.ht;            // INCEARSING ORDER
                return s2.ht - s1.ht;               // DECREASING ORDER
            }   
        });

        pq2.add(new Student(10 , 180 , 80));
        pq2.add(new Student(8, 170 , 67));
        pq2.add(new Student(11 , 190 , 80));
        pq2.add(new Student(5 , 180 , 95));
        pq2.add(new Student(15 , 185 , 70));

        while(pq2.size() != 0)
        {
            System.out.println(pq2.remove());
        }
        
        System.out.println();




        // using lamda function _________________________
        PriorityQueue<Student> pq3 = new PriorityQueue<>( (s1 , s2) -> {
                if(s1.wt == s2.wt)
                {
                    return s1.ht - s2.ht;       // when weight is equal then sort according to ht ,
                                                // otherwise , it was working according to comparable
                }
                // return s1.wt - s2.wt;            // INCEARSING ORDER
                return s2.wt - s1.wt;               // DECREASING ORDER
            });

        pq3.add(new Student(10 , 180 , 80));
        pq3.add(new Student(8, 170 , 67));
        pq3.add(new Student(11 , 190 , 80));
        pq3.add(new Student(5 , 180 , 95));
        pq3.add(new Student(15 , 185 , 80));

        while(pq3.size() != 0)
        {
            System.out.println(pq3.remove());
        }

        System.out.println();




        // Person Class containing String

        // COMPARABLE ON BASIS OF AGE
        PriorityQueue<Person> pq4 = new PriorityQueue<>();
        pq4.add(new Person(56 , "Ram"));
        pq4.add(new Person(15 , "Mohan"));
        pq4.add(new Person(40 , "Virat"));
        pq4.add(new Person(56 , "Rohan"));
        pq4.add(new Person(20 , "Akash"));

        while(pq4.size() != 0)
        {
            System.out.println(pq4.remove());
        }

        System.out.println();



        // COMPARATOR USING ANONYMOUS CLASS 
        PriorityQueue<Person> pq5 = new PriorityQueue<>(new Comparator<Person>()
        {
            public int compare(Person p1 , Person p2)
            {
                if(p1.name.equals(p2.name))
                {
                    return p2.age - p1.age;         // otherwise it will follow comparable
                }
                return p1.name.compareTo(p2.name);
            }
        });
        pq5.add(new Person(56 , "Ram"));
        pq5.add(new Person(15 , "Mohan"));
        pq5.add(new Person(40 , "Virat"));
        pq5.add(new Person(56 , "Rohan"));
        pq5.add(new Person(20 , "Ram"));

        while(pq5.size() != 0)
        {
            System.out.println(pq5.remove());
        }


    }

    public static class Student implements Comparable<Student>
    {
        int rno;
        int ht;
        int wt;

        public Student(int rno , int ht , int wt)
        {
            this.rno = rno;
            this.ht = ht;
            this.wt = wt;
        }


        public int compareTo(Student o)         // FOR COMPARABLE USAGE
        {
            return this.rno - o.rno;           // INCREASING ORDER
            // return o.rno - this.rno;        // DECREASING ORDER
        }


        @Override 
        public String toString()
        {
            return ("rno - " + rno  + ", ht - " + ht + ", wt - " + wt);
        }
    }



    // Person Class
    public static class Person implements Comparable<Person>
    {
        int age;
        String name;

        public Person(int age , String name)
        {
            this.age = age;
            this.name = name;
        }

        public int compareTo(Person o)
        {
            return this.age - o.age;        // increasing
            // return o.age - this.age;         // decreasing
        }

        @Override
        public String toString()
        {
            return ("age - " + age + ", name - " + name);
        }
    }
}