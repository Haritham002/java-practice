class armstrong{
    public static void main(String[] args)
    {
        int num=153;
        int sum=0;
        int copy=num;
        while(num>0){
            int t=num%10;
            sum=sum+(t*t*t);
            num=num/10;
        }
        System.out.println(sum);
        if(sum==copy){
            System.out.println("The given number is an armstrong number");
        }
        else{
            System.out.println("The given number is not an armstrong number");
        }
        
    }
}