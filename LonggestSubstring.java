package Practice;


import java.util.ArrayList;
import java.util.List;

public class LonggestSubstring {
    public static void main(String[] args) {
        String s = "aab";
        char[] c = s.toCharArray();
        int finalcount = 0;
        int temp =0;
        List<Character> charList = new ArrayList<>();
        for(int i=0 ; i<c.length ; i++){
            char ch = c[i];
            if(charList.contains(ch) == false){
                charList.add(ch);
                temp +=1;
                System.out.println(ch+" "+temp);
            }
            else if(charList.contains(ch)){
                if(temp > finalcount){
                    finalcount = temp;
                    temp =0;
                    charList.clear();
                    i = i-1;

                }
                else{
                    continue;
                }
            }
        }
        if(temp >finalcount) finalcount = temp;
        System.out.println(finalcount);
    }
}
