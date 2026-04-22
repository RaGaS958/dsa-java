public class CustomQueue {

    protected   int[] data;
    protected int size;
    private static final int Default_size=10;
    protected int end;
    public CustomQueue()
    {
        this(Default_size);

    }
    public CustomQueue(int size)
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
    public void insert(int item) throws CustomQueueException
    {
        if(!isFull())
        {

            end++;
            data[end]=item;
            System.out.println("Element Inserted");
        }
        else
        {
            throw new CustomQueueException("Queue is full!!!");
        }


    }

    public int pop() throws CustomQueueException
    {
        if(isEmpty())
        {
            throw  new CustomQueueException("Queue is empty");
        }
        int removed=data[0];
        for(int i=0;i<size;i++)
        {
            data[i]=data[i+1];
        }
        data[size-1]=0;
        end--;
        return removed;
    }
    public int front() throws CustomQueueException
    {
        if(isEmpty())
        {
            throw new CustomQueueException("Queue is empty");
        }
        return data[0];
    }

    public void display() throws CustomQueueException
    {
        if(isEmpty())
        {
            throw new CustomQueueException("Queue is empty");

        }
        System.out.print("START --> ");
        for(int i=0;i<=end;i++)
        {
            System.out.print(data[i]);
            System.out.print(" --> ");
        }
        System.out.println("END");

    }


}
