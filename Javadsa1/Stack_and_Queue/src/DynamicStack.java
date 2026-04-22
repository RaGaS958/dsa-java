public class DynamicStack extends CustomStack {

    public DynamicStack()
    {
        super();
    }
    public DynamicStack(int size)
    {
        super(size);
    }

    @Override
    public void insert(int item)
    {
        if(this.isFull())
        {
            int[] temp =new int[size*2];
            for(int i=0;i<size;i++)
            {
                temp[i]=data[i];
            }
            data=temp;

        }
        end ++;
        data[end]=item;
        System.out.println("Inserted :- "+item);
    }

    

}
