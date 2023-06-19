package codecademy_projects;

public class dnaChecker {
    /*determines whether there is a protein in a strand of DNA.
    A protein has the following qualities:
    It begins with a “start codon”: ATG.
    It ends with a “stop codon”: TGA.
    In between, each additional codon is a sequence of three nucleotides.*/
        public static void main(String[] args) {
            //  -. .-.   .-. .-.   .
            //    \   \ /   \   \ / 
            //   / \   \   / \   \  
            //  ~   `-~ `-`   `-~ `-
            String dna1 = "ATGCGATACGCTTGA";
            String dna2 = "ATGCGATACGTGA";
            String dna3 = "ATTAATATGTACTGA";

            String dna = dna3;
            
            int start = dna.indexOf("ATG");
            System.out.println("Start: " + start);
            int stop = dna.indexOf("TGA");
            System.out.println("Stop: " + stop);
            if ((start != -1 && stop != -1) && 
            ((stop - start) % 3 == 0)) {
            String protein = dna.substring(start, stop+3); 
            System.out.println("Protein: " + protein);
            } else {
            System.out.println("No protein");
            }

        }
}
