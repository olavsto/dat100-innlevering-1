import java.util.Scanner;

public class OppgaveO1{
    
    public static double prosent(int tall, double prosent){
        // Beregner prosent av tallet og returnerer det
        return tall /100 * prosent;
    }
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Skriv inn brutto inntekt:");
        System.out.print(">");
        // Leser inn bruttoinntekt fra bruker
        int bruttoLonn = input.nextInt();
        
        input.close();
        // Deklarerer prosentvariabel
        double prosent;
        
        if(bruttoLonn <= 217400){
            prosent = 0;
            System.out.println("Din trinnskatt er: " + prosent(bruttoLonn,prosent));
        }
        else if(bruttoLonn <= 306050){
            prosent = 1.7;
            System.out.println("Din trinnskatt er: " + prosent(bruttoLonn,prosent));
        }
        else if(bruttoLonn <= 697150){
            prosent = 4.0;
            System.out.println("Din trinnskatt er: " + prosent(bruttoLonn,prosent));
        }
        else if(bruttoLonn <= 942400){
            prosent = 13.7;
            System.out.println("Din trinnskatt er: " + prosent(bruttoLonn,prosent));
        }
        else if(bruttoLonn <= 1410750){
            prosent = 16.7;
            System.out.println("Din trinnskatt er: " + prosent(bruttoLonn,prosent));
        }
        else{
            prosent = 17.7;
            System.out.println("Din trinnskatt er: " + prosent(bruttoLonn,prosent));
        }
    }
}