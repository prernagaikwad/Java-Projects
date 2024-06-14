public class StackExample
{
        int arr[] = new int[5];        // array declaration
        int top;                      //variable declaration

        public int push(int x)       // Method
        {

            arr[top] =x ;               //top value of array assign to x variable
            top = top + 1;              //incrementing top value for inserting new value
            System.out.println("Element insert into the stack :"+x); // print inserted value
            return x;                    //return value x
        }



      public void pop()
        {   int x;
            top = top -1;                   // decrement top value
            x = arr[top];                   //assign top value to x
            System.out.println("Element remove from stack "+ x); // print removed value
            System.out.println("After removing element top value is : "+arr[top-1]);

        }




        public void peek()
        {

            System.out.println("Top element of stack : "+arr[top]);     // print top value
        }


        public void show()
        {
            for(int n :arr) {
                System.out.print( n + " " );                 // for loop for display values
            }
        }




    public static void main(String[] args)
    {
        StackExample stack = new StackExample();   // object creation
        stack.push(8);         //Method calling
        stack.push(16);
        stack.push(24);
        stack.push(32);
        stack.push(40);

        stack.pop();
        stack.peek();
        stack.show();


    }


}
