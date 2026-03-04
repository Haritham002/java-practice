class palindromeNum{
    public static void main(String[] args){
        int num=222;
        int rev=0;
        int temp=num;
        while(num>0){
            int t=num%10;
            rev=rev*10+t;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("The given number is a palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
    }
}