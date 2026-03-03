class removeConsonants{
    public static void main(String[]args){
        String str="Haritha";
        str=str.toLowerCase();
        String vowels="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
               vowels=vowels+ch;
                }
            else{
                continue;
                } 
        }
        System.out.println(vowels);
    }
} 