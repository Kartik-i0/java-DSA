package strings;

// To print all the subStrings of the strings .
public class SubstringsOfString {
    void main(){
        String str = "Ramkishan";

        String ans= "";
        int i=0;
        while(i<str.length()) {
           for (int k = i; k < str.length(); k++) {
               ans += str.charAt(k);
               IO.println(ans);
           }
           ans ="";
            i=i+1;
       }
    }

}
