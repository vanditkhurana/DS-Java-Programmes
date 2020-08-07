public class ReverseALinkedList
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
    public void addNumber(int data) 
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node emp = head;
            while(emp.next!=null)
            {
                emp = emp.next;
            }
            emp.next = newnode; 
        }
    }
    public void reverse()
    {
        Node prev = null; 
        Node temp = head; 
        Node next = null; 
        while (temp != null) { 
            next = temp.next; 
            temp.next = prev; 
            prev = temp; 
            temp = next; 
        } 
        head=prev;
    }
    public void display()
    {
        Node current=head;
        if(head==null)
        {
            System.out.print("Empty");
        }
        else
        {
            while(current!=null)
            {
                System.out.print(current.data+"-");
                current=current.next;
            }
        }
    }
    public static void main(String[] args)
    {
        ReverseALinkedList ob=new ReverseALinkedList();
        ob.addNumber(5);
        ob.addNumber(6);
        ob.addNumber(7);
        ob.addNumber(4);
        ob.reverse();
        ob.display();
    }
}