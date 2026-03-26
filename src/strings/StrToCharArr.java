package strings;

import java.util.Scanner;

public class StrToCharArr {
    void main(){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int size = s1.length();
         char arr[] = new char[size];

        // Converting the string on to the array .
        for(int i=0;i<size;i++){
            arr[i] = s1.charAt(i);
        }

        //for  Printing the array .
        for(int j=size-1;j>=0;j--){
            IO.println(arr[j]);
        }
    }
}
