package linkedlist;

public class browserHistory {

    private Node head;
    private Node pointer;
    private int size;

    public browserHistory(String url)
    {
        Node node=new Node(url);
        node.nextUrl=head;
        head=node;
        pointer=node;
        size=1;
    }
    public void visits(String url)
    {
        Node node=new Node(url);
        head.prevurl=node;
        node.nextUrl=head;
        head=node;
        pointer=node;
        size++;
        System.out.println("Current url:-"+url);
    }
    public void back(int steps)
    {
        Node temp=pointer;
        for(int i=0;i<steps && temp!=null;i++)
        {
            temp=temp.nextUrl;
        }
        if(temp==null)
        {
            System.out.println("Out of bound");
        }
        else
        {
            System.out.println("Current url :-"+pointer.url);
            pointer=temp;
        }
    }public void forward(int steps)
    {
        Node temp=pointer;
        for(int i=0;i<steps && temp!=null;i++)
        {
            temp=temp.prevurl;
        }
        if(temp==null)
        {
            System.out.println("Out of bound");
        }
        else
        {
            System.out.println("Current url :-"+pointer.url);
            pointer=temp;
        }

    }
    public void currentUrl()
    {
        System.out.println(pointer.url);
    }

    class Node
    {
        private String url;
        private Node nextUrl;
        private Node prevurl;
        public Node(String url)
        {
            this.url=url;
        }
        public Node(String url,Node nextUrl,Node prevurl)
        {
            this.url=url;
            this.nextUrl=nextUrl;
            this.prevurl=prevurl;
        }
    }



}
