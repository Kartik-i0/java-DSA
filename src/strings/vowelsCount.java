//VowelCount in the String
int vowelsCount(String s1) {
    int vCount=0;
    for(int i=0;i<s1.length();i++){
        char ch = s1.charAt(i);
        List<Character> vowels = List.of('a','e','i','o','u');
        if(/*vowels.contains(ch)*/ s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'){
            vCount++;
        };
    }
    return vCount;
}

void main() {
    IO.println(vowelsCount("wefbveiwbivebepwivlnvipvweiiipwiuteihvndsalwqpqwijtwqirpoiuytrewqasdfghjklmnbvcxz"));
}
