
/**
 * Write a description of class Part1 here.
 * 
 * @author (Diana C. Colunga) 
 * @version (2018)
 */
public class Part1 {
    public String findSimpleGene(String dna){
        String result = "";
        int startIndex = dna.indexOf("ATG");
        String true_result = "";
        if(startIndex == -1)
        {
            result = "There is no a codon";
            return result;
        }
        int finalIndex= dna.indexOf("TAA", startIndex+3); 
        if(finalIndex == -1)
        {
            result = "There is no a codon";
            return result;
        }
        result = dna.substring(startIndex, finalIndex+3);      
        int substring_length = result.length();
        if(substring_length % 3 == 0)
        {
        true_result = result;
    }
    else if (substring_length % 3 != 0)
        {
            return true_result;
        }
    return true_result;
    }
    public void testSimpleGene(){
        String dna = "AATGCGTAATATGGT";
        System.out.println("DNA strand is: " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is: " + gene);
        dna = "AATTGCAT";
        System.out.println("DNA strand is: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is: " + gene);
    }
    public static void main (String[] args)
    {
        Part1 genes = new Part1();
        genes.testSimpleGene();
    }
}
