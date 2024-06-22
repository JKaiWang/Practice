package Practice;
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A";
        boolean check = false;
        s = s.toLowerCase().replaceAll("[^a-z^0-9]", "");
        if(s.length() == 1){
            check = true;
        }
        if(s.length() %2 ==0){
            for(int i=0 ; i< s.length()/2 ; i++){
                int length = s.length()-1;
                char[] ch = s.toCharArray();
                if(ch[i] == ch[length-i]){
                    //System.out.println(" "+ch[0]+" "+ch[length-1]+" "+(length-i));
                    check = true;
                    //System.out.println(check);
                }
                else{
                    check = false;
                    break;
                }
            }
            //System.out.println(check);
        }
        else{
            int count = s.length()+1;
            for(int i=0 ; i<count/2 ; i++){
                char[]  ch = s.toCharArray();
                int length = s.length()-1;
                if(ch[i] == ch[length-i]){
                    check = true;
                }
                else{
                    check = false;
                    break;
                }
            }
            //System.out.println(check);
        }
        System.out.println(check);
    }
}
