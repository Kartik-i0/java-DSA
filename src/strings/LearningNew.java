package strings;

public class LearningNew {
    boolean equals(String a, String b) {
        if(a.length() != b.length())
            return false;
        for (int i = 0; i <a.length() ; i++) {
            if(a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    void main(){
        IO.println(equals("kartik","kartik"));
//        String s1 = "kartik";
//        String s2 = new String("kartik");
//        IO.println(s1==s2);
//        IO.println(s2);
//
//        IO.println(s1.equals(s2));

    }
}

