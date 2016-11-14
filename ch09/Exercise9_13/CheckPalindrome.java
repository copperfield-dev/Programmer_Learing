public class CheckPalindrome {
    public static void main(String[] args) {
        if (isPalindrome(args[0]))
            System.out.println(args[0] + " is a palindrome");
        else 
            System.out.println(args[0] + " not a palindrome");
    }
    
    public static boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            if (s.charAt(low) != s.charAt(high))
                return false;
  
            low++;
            high--;
        }

    return true;
    }
}