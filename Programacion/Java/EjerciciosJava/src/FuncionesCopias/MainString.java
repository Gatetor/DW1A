package FuncionesCopias;

import java.util.Arrays;
import java.util.Scanner;

public class MainString {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);

        int[] a={4,7,2,9,11,6};
        
        Arrays.sort(a);
        
        System.out.println("sin ordenar");
        CalcArrays.printInt(a);

        for(int i=2;i<13;i++){
            System.out.print(i+" esta?");
            if (CalcArrays.buscarInt(a, i)) {
                System.out.println(" si");
            }else{
                System.out.println(" no");
            }
        }

        teclado.close();
    }
}
