
/**
 * Write a description of class AllCodons here.
 * 
 * @author (Diana C. Colunga) 
 * @version (a version number or a date)
 */
public class AllCodons 
{

       public int findStopCodon(String dnaStr, int startIndex, String stopCodon){
           // find StopCodon starting from (startIndex ´+ 3), currIndex
           int currIndex = dnaStr.indexOf(stopCodon, startIndex + 3);
           while(currIndex != -1)
           {
               int diff = currIndex - startIndex;
               if(diff % 3 == 0)
               {
                   return currIndex;
               }
               else 
               {
                   currIndex = dnaStr.indexOf(stopCodon, currIndex + 1);
               }
           }
           return -1;
        }
        public String findGene (String dna, int where){
            int startIndex = dna.indexOf("ATG", where);
            if(startIndex == -1)
            {
                return "";
            }
            int taaIndex = findStopCodon(dna, startIndex, "TAA");
            int tagIndex = findStopCodon(dna, startIndex, "TAG");
            int tgaIndex = findStopCodon(dna, startIndex, "TGA");
            int temp = Math.min(taaIndex, tagIndex);
            //int minIndex = Math.min(temp, tgaIndex);
            int minIndex = 0;
            if(taaIndex == -1 || (tgaIndex != -1 && tgaIndex < taaIndex))
            {
                minIndex = tgaIndex;
            }
            else{
                minIndex = taaIndex;
            }
            if(minIndex == 1 || (tgaIndex != -1 && tagIndex < minIndex)){
                minIndex = tagIndex;
            }
            if(minIndex == -1){
                return "";
            }
            //if(minIndex == dna.length())
            //
              //  return "";
            //}
                return dna.substring(startIndex, minIndex + 3);
    }
    
    
        public void printAllGenes(String dna){
            //Set startIndex at 0
            int startIndex = 0;
            //Repeat the following steps
            while(true){
                //Find the next gene after startIndex
                String currentGene = findGene(dna, startIndex);
                //IF no gene was found, leave the loop
                if(currentGene.isEmpty()){
                    break;
                }
                System.out.println(currentGene);
                startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length();
            }
           
        }
        
        public void testOn(String dna){
            System.out.println("Testing Genes on" + dna);
            printAllGenes(dna);
        }
        public void test(){
            testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
            
        }
        /*public void testFindStop(){
            String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxx";
            String gene = findGene(dna);
            System.out.println(gene);
            int dex = findStopCodon(dna,0,"TAA");
            if(dex != 9) System.out.println("error on 9");
            dex = findStopCodon(dna,9,"TAA");
            if(dex != 21) System.out.println("error on 21");
            dex = findStopCodon(dna,1,"TAA");
            if(dex != -1) System.out.println("error on 26");
            dex = findStopCodon(dna,0,"TAG");
            if(dex != -1) System.out.println("error on 26");
            System.out.println("tests finished");
        }
        public void testFindGene(){
            String dna = "ATGCCCGGGAAACCC";
            String gene = findGene(dna);
            if(! gene.equals("ATGCCCGGGAAATAA")){
                System.out.println("error");
            }
            System.out.println("tests finished");
        }*/
}
