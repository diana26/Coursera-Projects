
/**
 * Write a description of class findAbc here.
 * 
 * @author (Diana C. Colunga) 
 * @version (march 2018)
 */
public class findAbc {
    public void findAbc(String s){
        int index = s.indexOf("abc");
        System.out.println("index " + index);
        while(true){
            if(index == -1 || index >= s.length()-3){
                break;
            }
            String answer = s.substring(index+1, index + 4);
            System.out.println(answer);
            index = s.indexOf("abc", index+3);
        }
        System.out.println("index after updating " + index);
    }
    public void tester(){
        /*String str = "abcd";
        findAbc(str);
        str = "abcdabc";
        findAbc(str);
        str = "abcbbbabcdddabc";
        findAbc(str);*/
        findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
        findAbc("abcabcabcabca");
    }
}
