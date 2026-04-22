public class CustomStack {

    protected   int[] data;
    protected int size;
    private static final int Default_size=10;
    protected int end;
    public CustomStack()
    {
        this(Default_size);

    }
    public CustomStack(int size)
    {
        this.size=size;
        this.data=new int[size];
        this.end=-1;
    }
    protected  boolean isEmpty()
    {
        return end==-1;
    }
    protected boolean isFull()
    {
        return end==size-1;
    }
    public void insert(int item) throws StackCustomException
    {
     if(!isFull())
     {

         end++;
         data[end]=item;
         System.out.println("Element Inserted");
     }
     else
     {
         throw new StackCustomException("Stack is full!!!");
     }


    }

    public int pop() throws  StackCustomException
    {
        if(isEmpty())
        {
            throw new StackCustomException("Stack is Empty");
        }
        return data[end--];
    }
    public int peek() throws StackCustomException
    {
        if(isEmpty())
        {
            throw new StackCustomException("Stack is Empty");

        }
        return data[end];
    }
    public void display() throws StackCustomException
    {
        if(isEmpty())
        {
            throw new StackCustomException("Stack is empty");

        }
        System.out.print("TOP");
        for(int i=end;i>-1;i--)
        {
            System.out.print("-->");
            System.out.print(data[i]);
        }
    }


}
