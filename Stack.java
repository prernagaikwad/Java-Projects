public class Stack
{
   int maxsize;
   int stackarray[];
   int top;

   public void initialize(int size)
   {
       maxsize =size;
       stackarray = new int[maxsize];
       top = -1;
   }


   public void push(int value)
   {
     if(top <maxsize -1) {
         stackarray[++top] = value;
         System.out.println("Elements inserted into the stackarray :"+value);
     }
     else
       {
         System.out.println("Stack overflow : Unable to push" + value);
       }
   }

   public int pop()
   {

     if (top >= 0)
       {
       return  stackarray[top--];

       }
     else
       {
         System.out.println("Stack underflow : unbale to pop");
         return -1;
       }
   }

   public int peek() {
       if (top >= 0) {
           return stackarray[top];
       } else {
           System.out.println("Stack is empty: Unable to peek");
           return -1;
       }

   }
   public boolean isEmpty()
   {
       return top == -1;
   }

   public boolean isFull()
   {
       return top == maxsize - 1;
   }




    public static void main(String[] args)
    {
      Stack stak = new Stack();

      stak.initialize((5));
      stak.push(10);
      stak.push(20);
      stak.push(30);
      stak.push(40);

      System.out.println("Top element is :" + stak.peek());
      System.out.println("Popped element is:"+stak.pop());
      System.out.println("Is stack empty?" +stak.isEmpty());




    }


}
