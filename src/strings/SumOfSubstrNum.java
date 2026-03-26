package strings;

public class SumOfSubstrNum {
    void main(){
        String str = "12";
        int i=0;
        String x="";
        int sum=0;
        while(i < str.length()){
            for(int j=i;j<str.length();j++){
                x +=str.charAt(j);
                sum += Integer.parseInt(x);
            }
            x="";
            ++i;
        }
        IO.println(sum);
        IO.println("hiii");
    }
}
