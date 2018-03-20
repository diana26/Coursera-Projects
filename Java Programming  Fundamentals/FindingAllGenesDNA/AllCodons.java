
/**
 * Write a description of class AllCodons here.
 * 
 * @author (Diana C. Colunga) 
 * @version (a version number or a date)
 */
public class AllCodons {
    public int findStopCodon(String dnaStr, int startIndex, String stopCodon){
        int currIndex = dnaStr.indexOf(stopCodon, startIndex + 3);
        while (currIndex != -1){
            if((currIndex - startIndex) %3 == 0){
                return currIndex;
            }
            currIndex = dnaStr.indexOf(stopCodon, currIndex + 1);
        }
        return dnaStr.length();
    }
    
    public void test(){
        String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxx";
        int ans = findStopCodon(dna,0,"TAA");
        if(ans != 10)
            System.out.println("error on 9");
        ans = findStopCodon(dna,9,"TAA");
        if(ans != 21)
            System.out.println("error on 21");
        ans = findStopCodon(dna,1,"TAA");
        if(ans != 26)
            System.out.println("error on 26");
        ans = findStopCodon(dna,0,"TAG");
        if(ans != 26)
            System.out.println("error on 26 TAG");    
            System.out.println("test finished");
    }
}
