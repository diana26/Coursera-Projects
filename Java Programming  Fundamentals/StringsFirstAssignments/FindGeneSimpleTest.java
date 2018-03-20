
/**
 * Write a description of class FindGeneSimpleTest here.
 * 
 * @author (Diana C. Colunga) 
 * @version (second change march 2018)
 */
public class FindGeneSimpleTest {
    public String findGeneSimpleTest(String dna){
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if(startIndex == -1){ //No ATG
           return "";
        }
        int stopIndex = dna.indexOf("TAA");
        if(stopIndex == -1){ //No TAA
            return "";
        }
        if((stopIndex - startIndex) % 3 != 0)
        {
            return "";
        }
        result = dna.substring(startIndex, stopIndex + 3);
        return result;
    }
    public void TestGene(){
        String dna = "AATGCGTAATATGGT";
        String answer = findGeneSimpleTest(dna);
        System.out.println("Gene is:");
        System.out.println(answer);
        dna = "AATGCTAGGGTAATATGGT";
        answer = findGeneSimpleTest(dna);
        System.out.println("Gene is:");
        System.out.println(answer);
        dna ="TTATAA";
        answer = findGeneSimpleTest(dna);
        System.out.println("Gene is:");
        System.out.println(answer);
        dna ="TTATGGAT";
        answer = findGeneSimpleTest(dna);
        System.out.println("Gene is:");
        System.out.println(answer);
        dna = "ATGTACTAAACAT";
        answer = findGeneSimpleTest(dna);
        System.out.println("Gene is:");
        System.out.println(answer);
    }
    public static void main (String[] args){
        FindGeneSimpleTest object = new FindGeneSimpleTest();
        object.TestGene();
    }
    
}
