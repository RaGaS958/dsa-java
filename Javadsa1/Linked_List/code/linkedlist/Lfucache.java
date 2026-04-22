package linkedlist;

public class Lfucache
{
    private Node head;
    private int size;
    private int capacity;

    public Lfucache(int capacity)
    {
        this.capacity=capacity;
        this.size=0;
    }

    public void put(int key ,int val)
    {
        if(head!=null)
        {
            Node temp=head;
            while(temp!=null)
            {
                if(temp.key==key)
                {
                    System.out.println("Invalid input");
                    return;
                }
                temp=temp.next;
            }
        }


        Node node=new Node(val,key);
        if(size<capacity)
        {
            node.next=head;
            head=node;
            size++;
            return;
        }
        else
        {
            Node temp=head;
            int minCount=99999;
            while(temp!=null)
            {
                if(temp.count<minCount)
                {
                    minCount=temp.count;
                }
                temp=temp.next;
            }
            int counter=0;
            temp=head;
            while(temp!=null)
            {
                if(temp.count==minCount)
                {
                    counter++;
                }
                temp=temp.next;
            }
          Node pres=head;
            Node prev=null;
            while( pres!=null &&  pres.count!=minCount)
            {
                prev=pres;
                pres=pres.next;
            }
            if(counter ==1)
            {
                if(prev!=null)
                {
                    prev.next=node;
                    node.next=pres.next;
                }
                else
                {
                    node.next=pres.next;
                    head=node;
                    pres.next=null;
                }
            }
            else
            {
                while(pres.next!=null && pres.next.count==minCount)
                {
                    prev=pres;
                  pres=  pres.next;
                }
                prev.next=node;
                node.next=pres.next;
            }

        }


    }

    public int get(int key)
    {
        if(head==null)
        {
            return -1;
        }
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                if(temp.key==key)
                {
                    temp.count+=1;
                    return temp.val;
                }
                temp=temp.next;
            }
        }
        return -1;
    }

    public void displays() {
        Node temp = head;
        if (head == null) {
            System.out.println("EMPTY LINKED LIST");
            return;
        }
        System.out.print("HEAD");
        while (temp != null) {
            System.out.print("-> ");
            System.out.print("{[ val:- "+temp.val+"][key:-"+ temp.key+"][ count:-"+temp.count +"]}  " );
            temp = temp.next;
        }
        System.out.println();
    }


    private  class Node
    {
        private int val;
        private int key;
        private int count;
        private Node next;

        public Node(int val,int key)
        {
            this.val=val;
            this.key=key;
            this.count=1;
        }

        public Node(int val,Node next)
        {
            this.val=val;
            this.next=next;
        }

    }

}
