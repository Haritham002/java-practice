class PrimeNo {
    public static void main(String[]args){
        int num=25;
        int a=2;
        while(a<=num/2){
            if(num%a==0){
                break;
            }
            a++;
        }
        if(a>num/2){
            System.out.println("prime no");
        }
        else{
            System.out.println("not prime");
        }

    }
}
