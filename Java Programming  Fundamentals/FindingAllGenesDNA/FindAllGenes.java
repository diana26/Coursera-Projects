
/**
 * Write a description of class FindAllGenes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindAllGenes {
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
        FindAllGenes object = new FindAllGenes();
        object.TestGene();
    }
}
