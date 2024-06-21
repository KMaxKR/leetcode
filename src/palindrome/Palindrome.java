package palindrome;

public class Palindrome {
    public boolean isPalindrome(int x) {
        StringBuilder aux = new StringBuilder();
        String val = String.valueOf(x);
        char[] list = val.toCharArray();
        for (int i = list.length; i > 0; i--){
            aux.append(list[i - 1]);
        }
        return (String.valueOf(aux).equals(val));
    }
}
