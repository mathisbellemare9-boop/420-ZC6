public class Question712 {

    public static void main(String[] args) {
        int iCpt1 = 1;
        int iCpt2 = 99;

    do {
        for (iCpt2 = 1; iCpt2 < 3; iCpt2++) {
            System.out.println( iCpt2 * iCpt1 );
            
        }
        iCpt1++;
    } while (iCpt1 != 4);
        
    }
}
