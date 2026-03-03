class palindrome{
    public static void main(String[] args){
        String str="Malayalam";
        str=str.toLowerCase();
        String palindrome="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            palindrome=palindrome+ch;
        }
        if(str.equals(palindrome)){
            System.out.println("The given string is a palindrome");
        }
        else{
            System.out.println("The given string is not a palindrome");
        }
    }
}