class removeVowels{
    public static void main(String[]args){
        String str="Haritha";
        str=str.toLowerCase();
        String consonants="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
            continue;
             }
            else{
                consonants=consonants+ch;
                } 
        }
        System.out.println(consonants);
    }
}