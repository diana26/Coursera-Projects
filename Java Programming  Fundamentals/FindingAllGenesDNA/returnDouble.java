
/**
 * Write a description of class returnDouble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class returnDouble {
    public static double Doublee(int x, String str){
       double answer = (x/str.length());
       return answer;
    }
    public void test(){
        int countcg = 10;
        String dna = "fernanda";
        double answer = Doublee(countcg, dna);
        System.out.println(answer);
    }
}
