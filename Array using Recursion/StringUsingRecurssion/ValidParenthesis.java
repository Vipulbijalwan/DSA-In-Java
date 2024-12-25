package StringUsingRecurssion;

public class Parenthesis {
    public static void main(String[] args) {
        String up = ")())";
        String p = "";

        System.out.println(isEmptyOrNot(up, p));
    }

    static boolean isEmptyOrNot(String up, String p) {
if(up.isEmpty() && !p.isEmpty())
{
    return false;
}
        if (up.isEmpty() && p.isEmpty()) {
            return true;
        }
        if (up.charAt(0) == ']' && p.isEmpty() || up.charAt(0) == '}' && p.isEmpty() || up.charAt(0) == ')' && p.isEmpty()) {
            return false;
        }
        int num=p.length()-1;
        if (up.charAt(0) == ']' && p.charAt(num)=='[' || up.charAt(0) == '}' && p.charAt(num)=='{'  || up.charAt(0) == ')' && p.charAt(num)=='(' ) {
            return isEmptyOrNot(up.substring(1),p.substring(0,num));
        }
        char ch=up.charAt(0);
        return isEmptyOrNot(up.substring(1),p+ch);

    }
}
