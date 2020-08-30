public class client
{
    public static void main(String[] args)
    {
        // Stack__________________________________________
        myStack st = new myStack(3);
        st.pushData(3);
        st.pushData(4);
        st.pushData(1);

        // st.pushData(10);
        // System.out.println(st.topData());
        // System.out.println(st.popData());

        // st.display();


        // Queue__________________________________________________
        myQueue que = new myQueue(3);
        que.push(9);
        que.push(8);
        que.push(7);

        System.out.println(que.pop());
        que.push(6);
        que.display();



        // dynamicStack _______________________________________________
        dynamicStack dst = new dynamicStack(3);

        dst.pushData(1);
        dst.pushData(2);
        dst.pushData(3);
        dst.pushData(4);

        dst.display();


        // dynamicQueue ____________________________________________
        dynamicQueue dque = new dynamicQueue(3);

        dque.push(1);
        dque.push(2);
        dque.push(3);
        dque.push(4);

        dque.display();


        // SOME OOPS CONCEPTS
        solve();
    }

    public static void solve()
    {
        dynamicStack dst1 = new dynamicStack(4);

        dst1.fun();     // calls the function already present in the dynamicStack class (not of myStack)
        dst1.fun1();
        dst1.fun2();


        myStack st1 = new myStack(5);
        st1.fun();      // calls the function present in the myStack
        st1.fun1();
        // st1.fun2();          // not present in the myStack class


        // dynamicStack dst2 = new myStack(5);  // NOT POSSIBLE AS myStack CANNOT BE CONVERTED TO dynamicStack
        // dst2.fun();
        // // dst2.fun1();
        // // dst2.fun2();


        myStack st2 = new dynamicStack(5);
        st2.fun();          // calls the fuction present in dynamicStack 
                                // (because the object points to dynamicStack class on heap)
        st2.fun1();
        // st2.fun2();   // will be a error because the object st2 can't point to fun2 function 
    }
}