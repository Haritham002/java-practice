public class OccurenceOfChar2 {
    public static void main(String[] args){
        String str="Haritha";
        int count=0;
        for(char ch:str.toCharArray()){
            if(ch=='a')
                count++;
        }
        System.out.println(count);

    }
    
}
