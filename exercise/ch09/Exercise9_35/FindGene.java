public class FindGene {
	public static void main(String[] args) {
	    java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a genome string: ");
        String gene = input.nextLine();
        StringBuilder geneString = new StringBuilder();
        geneString.append(gene);

        int indexStart = geneString.toString().indexOf("ATG");
        if (indexStart == -1) 
        	System.out.print("no gene is found");
        else {
        	do {
            	int indexEnd = 999;
            	if (geneString.toString().indexOf("TAG") != -1)
            		indexEnd = geneString.toString().indexOf("TAG");
            	if (geneString.toString().indexOf("TAA") != -1) {
            		if (geneString.toString().indexOf("TAA") < indexEnd)
            			indexEnd = geneString.toString().indexOf("TAA");
            	}
            	if (geneString.toString().indexOf("TGA") != -1) {
            		if (geneString.toString().indexOf("TGA") < indexEnd)
            			indexEnd = geneString.toString().indexOf("TGA");
            	}
     
            	for (int i = indexStart + 3; i < indexEnd; i++) {
            		System.out.print(geneString.toString().charAt(i));
            	}
            	System.out.println();
            	geneString.delete(0, indexEnd + 3);
            	indexStart = geneString.toString().indexOf("ATG");
        	} while(indexStart != -1); 
        }
	}
}