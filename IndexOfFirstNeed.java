package Practice;

public class IndexOfFirstNeed {
    public static void main(String[] args) {
        String haystack ="a";
        String needle = "a";

        int index = -1 ;
        if(haystack.length() < needle.length()) index = -1;
        if(haystack == needle) index =0;
        for(int i=0 ; i<haystack.length()-needle.length() ; i++){
            char  c = haystack.toCharArray()[i];
            boolean check = false;
            //System.out.println(c);
            if(c == needle.toCharArray()[0]){
                index = i;
                for(int j=0 ; j<needle.length() ; j++){
                    //System.out.println("i:"+i+" j: "+j);
                    if(haystack.toCharArray()[i+j] == needle.toCharArray()[j]){
                        check = true;
                    }
                    else{
                        check = false;
                        index = -1;
                    }
                }
                if(check == true) break;
            }
        }
        System.out.println(index);
    }
    
}