public class target_sum {
    public static void main(String[] args) {
        int arr[]={1};
        int count=count(arr,1,0,0);
        System.out.println(count);
    }
    static int count(int arr[],int tar,int i ,int sum)
    {
        if(i ==arr.length)
        {
            if(tar==sum)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        int count1=count(arr,tar,i+1,sum+arr[i]);
        int count2=count(arr,tar,i+1,sum-arr[i]);
        return count1+count2;
    }
}
