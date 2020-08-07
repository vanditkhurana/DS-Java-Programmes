public class InsertingNodeInBetweenLinkedList
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
    public void insertAt(int value, int pos)
    {
        Node toInsert=new Node(value);
        Node random=head;
        int p=0;
        while(p<pos-1)
        {
            random=random.next;
            p++;
        }
        Node nextNode=random.next;
        random.next=toInsert;
        toInsert.next=nextNode;
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
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }
    public static void main(String[] args)
    {
        InsertingNodeInBetweenLinkedList ob=new InsertingNodeInBetweenLinkedList();
        ob.addNumber(4);
        ob.addNumber(5);
        ob.addNumber(6);
        ob.addNumber(7);
        ob.insertAt(2, 2);
        ob.display();
    }
}