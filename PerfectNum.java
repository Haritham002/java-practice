class perfectNum{
    public static void main(String [] args)
    {
        int num=6;
        int sum=0;
        int a=1;
        while(a<=num/2)
        {
            if(num%a==0)
            {
                sum=sum+a;
            }
            a++;
        }
        if(sum==num)
        {
            System.out.println("Prefect Number");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }
    }
}