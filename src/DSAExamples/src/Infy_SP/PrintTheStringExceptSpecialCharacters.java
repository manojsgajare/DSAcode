package DSAExamples.src.Infy_SP;

public class PrintTheStringExceptSpecialCharacters {
    public static void main(String[] args) {
        String s = "alkcnadlvnsd@njb#kbj$kjbj%u";
        String str = " ";
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) &&
                    !Character.isWhitespace(s.charAt(i))){
                count++;
            }
            else {
                str = str + s.charAt(i);
            }

        }
        if(count == 0){
            System.out.println("There is no special character in string");
        }
        else{
            System.out.println(count);
        }
        System.out.println("Special characters removed : " + str);
    }
}
