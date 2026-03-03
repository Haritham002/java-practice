class CountVowelsConsonants2 {
    public static void main(String[] args){
        String str="Haritha";
        str=str.toLowerCase();
        int vowels=0;
        int consonants=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            switch(ch){
                case'a':
                case'e':
                case'i':
                case'o':
                case'u':
                    vowels++;
                    break;
                default:
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    
}
