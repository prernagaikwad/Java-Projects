
public class QueueExample
{

    int queue[] = new int[7];
    int size ;
    int front ;
    int rear;


    public void enQueue(int data)
    {
        queue[rear]= data;
        rear = rear + 1;
        size = size + 1;
        System.out.println("Elements inserted into the queue  " +data);
    }

    public int dequeue()
    {
        int data = queue[front];
        size = size-1;
        front++;
        System.out.println("Elements deleted from queue "+data);
        return data;


    }

    public void show()
    {
        System.out.println("Elements :");

        for (int n : queue)
        {
            System.out.println(n + " ");
        }

    }

    public int getSize()
        {
            return size;
        }



    public static void main(String[] args)
    {
        QueueExample queue = new QueueExample();
        queue.enQueue(50);
        queue.enQueue(60);
        queue.enQueue(70);
        queue.enQueue(80);
        queue.enQueue(90);
        queue.enQueue(100);

        queue.dequeue();

        System.out.println("Size " + queue.getSize());
        queue.show();
        queue.dequeue();

    }
}
