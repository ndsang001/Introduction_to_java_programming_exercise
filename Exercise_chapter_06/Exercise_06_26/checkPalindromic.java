package Exercise_chapter_06.Exercise_06_26;

public class checkPalindromic {
    //Check number is palindromic number or not
    public static boolean isPalindromic(int i){
        String number = i + "";
        String reverseNumber = "";

        for(int j = number.length() - 1; j >= 0 ; --j){
            reverseNumber += number.charAt(j);
        }
        
        if(number.equals(reverseNumber)){
            return true;
        }

        return false;
    }
}
