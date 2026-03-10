class countNoOfDigits{
    public static void main(String[] args){
        int num=1234567;
        int digit=0;
        while(num>0)
        {
            digit++;
            num=num/10;
        }
        System.out.println("The number of digits in the given number is: "+digit);
    }
}