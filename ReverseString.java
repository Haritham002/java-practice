class ReverseString{
    public static void main(String[] args) {
        String string = "Haritha";
        String reverse="";
        for(int i=string.length()-1;i>=0;i--){
            char ch= string.charAt(i);
            reverse=reverse+ch;
        }
        System.out.println(reverse);
       
    }
}