
public class QueueExample {

    int queue[] = new int[7];
    int size;
    int front;
    int rear;

    int capacity = size;


    public void enQueue(int data) {

        queue[rear] = data;
        rear = rear + 1;
        size = size + 1;
        System.out.println("Elements inserted into the queue  " + data);
    }

    public int dequeue() {
       /* if(isEmpty())
        {
            System.out.println("Underflow .. no more element to delete");
            System.exit(-1);
        }

        */

        int data = queue[front];
        size = size - 1;
        front++;
        System.out.println("Elements deleted from queue  " + data);
        return data;


    }

    public void show() {
        System.out.println("Elements are as :");

        for (int n : queue) {
            System.out.print(n + " ");
        }

    }

    public int getSize() {
        return size;
    }

    public int peek() {

        return queue[front];
    }

    public boolean isEmpty() {
        return (getSize() == 0);
    }

        /*public boolean isFull()
        {
           return(getSize()==capacity) ;

        }

         */


    public static void main(String[] args) {
        QueueExample queue = new QueueExample();
        queue.enQueue(50);
        queue.enQueue(60);
        queue.enQueue(70);
        queue.enQueue(80);
        queue.enQueue(90);
        queue.enQueue(100);
        //queue.enQueue(101);

        queue.dequeue();

        System.out.println("Size " + queue.getSize());
        queue.show();
        System.out.println("\n Top element of queue is " + queue.peek());
        queue.dequeue();
        System.out.println("After deleting element Size " + queue.getSize());


    }
}
