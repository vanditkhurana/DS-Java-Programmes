public class AverageOfALinkedList
{
    public class Node
    {
        int data;
        Node next;
        public Node(int d)
        {
            this.data=d;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void addNumber(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public void display()
    {
        Node current=head;
        int av=0;
        int len=0;
        if(head==null)
        {
            System.out.print("Empty");
        }
        else
        {
            while(current!=null)
            {
                len++;
                av+=current.data;
                current=current.next;
            }
            double p = av/len;
            System.out.print(p);
        }
    }
    public static void main(String[] args)
    {
        AverageOfALinkedList ob=new AverageOfALinkedList();
        ob.addNumber(4);
        ob.addNumber(5);
        ob.addNumber(6);
        ob.addNumber(7);
        ob.display();
    }
}