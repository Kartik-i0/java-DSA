
void main() {
    String s1="kak";
    IO.println(s1);
    IO.println(isPalindrome(s1));

}

//check if string is palindrome or not.
boolean isPalindrome(String str) {
    for(int i=0;i<str.length()/2;i++){
       if(str.charAt(i)!=str.charAt(str.length()-1)){
           return false;
       }
    }
    return true;
}