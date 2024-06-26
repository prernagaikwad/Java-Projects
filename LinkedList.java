public class LinkedList
{

    Node head;

    public LinkedList()
    {
        this.head = null;

    }

    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data)
    {
        LinkedList.Node newNode = new LinkedList.Node(data);
        if (head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data)
    {
        LinkedList.Node newNode = new LinkedList.Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        LinkedList.Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList()
    {
        if (head == null)
        {
            System.out.println("list is empty");
            return;
        }


        LinkedList.Node currNode = head;
        while (currNode != null)
        {
            System.out.print(currNode.data + " ->");
            currNode = currNode.next;

        }
        System.out.println("NULL");

    }

    public void deleteFirst()
    {
        if (head == null)
        {
            System.out.println("The  list is empty");
            return;
        }

        head = head.next;
    }


    public void deleteLast()
    {
        if (head == null)
        {
            System.out.println("The list is empty");
            return;
        }

        if (head.next == null)
        {
            head = null;
            return;
        }
        LinkedList.Node secondlast = head;
        LinkedList.Node lastNode = head.next;
        while (lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public boolean contains(int data)
    {
        Node currNode = head ;
        while(currNode != null)
        {
            if(currNode.data == data)
            {
              return true;
            }
            currNode = currNode.next;
        }
        return false;
    }




    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst( 80);
        list.addFirst( 60);
        list.addFirst(40);
        list.printList();
        list.addLast(100);
        list.printList();
        list.addFirst(20);
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.contains(40));
        System.out.println(list.contains(100));





    }
}





