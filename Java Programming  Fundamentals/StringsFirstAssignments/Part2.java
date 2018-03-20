
/**
 * Write a description of class Part2 here.
 * 
 * @author (Diana C. Colunga) 
 * @version (january 2018)
 */
public class Part2 {
    
public String findSimpleGene(String dna, String startCodon, String stopCodon){
        String result = "";
        int startIndex = dna.indexOf(startCodon);
        String true_result = "";
        
        if(startIndex == -1)
        {
            result = "There is no a codon";
            return result;
        }
        int finalIndex= dna.indexOf(stopCodon, startIndex+3); 
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
        String gene = findSimpleGene(dna, "ATG", "TAA");
        System.out.println("Gene is: " + gene);
        dna = "AATTGCAT";
        System.out.println("DNA strand is: " + dna);
        gene = findSimpleGene(dna, "ATG", "TAA");
        System.out.println("Gene is: " + gene);
    }
    
}
