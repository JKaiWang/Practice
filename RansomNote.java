package Practice;
public class RansomNote {
    public static void main(String[] args) {
        boolean check = false;
        String ransomNote = "fihjjjjei";
        String magazine = "hjibagacbhadfaefdjaeaebgi";
        char[] ransomArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();
        int ransomLength =  ransomArray.length;
        int magazineLength = magazineArray.length;
        for(char c : ransomArray){
            if(c == 'j'){
                System.out.println("mama");
            }
            for(int i =0 ; i<magazineLength ; i++){
                if(c== magazineArray[i]){
                    if(magazineArray[i] == 'j'){
                        System.out.println("haha");
                    }
                    magazineArray[i] = '.';
                    check = true;
                    //System.out.println(true);
                    break;
                }
                else{
                    //System.out.println(false);
                    check = false;
                    continue;
                }
            }
            if(check == false){
                System.out.println(false);
            }
        }
        System.out.println(check);
    }
}
