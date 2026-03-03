class RemoveVowels2 {
    public static void main(String[] args){
        String str="Haritha";
        str=str.toLowerCase();
        String s1="";
        s1=str.replaceAll("[aeiou]","");
        System.out.println(s1);
    } 
}
