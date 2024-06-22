package Practice;
class Minimumchair{
    public static void main(String[] args) {
        String  str = "ELELEEL";
        int chairCount =0;
        int minimumChair =0;
        for(char c : str.toCharArray()){
            if(c == 'E'){
                chairCount +=1;
            }
            else if(c =='L'){
                chairCount -=1;
            }
            if(chairCount >= minimumChair){
                minimumChair = chairCount;
            }
        }
        System.out.println(minimumChair);
    }
}