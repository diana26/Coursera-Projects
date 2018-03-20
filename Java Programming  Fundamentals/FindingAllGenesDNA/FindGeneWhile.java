
/**
 * Write a description of class FindGeneWhile here.
 * 
 * @author (Diana C. Colunga) 
 * @version (a version number or a date)
 */
public class FindGeneWhile {
    public String findGene(String dna){
    //Find first ocurrence of "ATG"
    int startIndex = dna.indexOf("ATG");
    int currentIndex = dna.indexOf("TAA", startIndex + 3);
    //As long as currIndex is different to -1
    while(currentIndex != -1){
        //Check if currentIndex - startIndex is multiple of 3
        if((currentIndex - startIndex ) % 3 == 0){
            return dna.substring(startIndex, currentIndex + 3);
        }
        else{
            currentIndex = dna.indexOf("TAA", currentIndex + 1);
        }
    }
    return "";
    }
}
