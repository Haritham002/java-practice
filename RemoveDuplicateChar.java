class RemoveDuplicateChar {
    public static void main(String[] args){
        String str="Haritha";
        str=str.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(sb.toString().contains(Character.toString(ch))){
                continue;
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
    
}
