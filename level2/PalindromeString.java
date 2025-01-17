// creating a class PalindromeCheck contain attribute text.
class PalindromeCheck{
    String text;

public PalindromeCheck(String text){
    this.text=text;
}
// method
public static boolean CheckPalindrome(String text){
int left=0;
int right=text.length()-1;
while(left<right){
    if(text.charAt(left)!=text.charAt(right)){
        return false;
    }
    left++;
    right--;
}
    return true;
}
// method to display the result.
void displayPalindrome(){
// check text is palindrom or not.
    if(CheckPalindrome(text)){
        System.out.println(" text is palindrome");
    }
    else
    System.out.println(" text is not palindrome");
}
}
public class PalindromeString {
    public static void main(String[] args) {
// create objects obj,obj1 for access method of PalindromCheck class.
    PalindromeCheck obj=new PalindromeCheck("madam");
    obj.displayPalindrome();
    PalindromeCheck obj1=new PalindromeCheck("aman");
    obj1.displayPalindrome();
    }
}
