import java.util.Scanner;

public class OppgaveO3{
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Skriv inn tallet du vil ha fakultet av:");
        System.out.print(">");
        // Leser inn fakultetstall fra bruker
        int n = input.nextInt();
        
        input.close();
        
        // setter startvedi for fakultet
        int fakultet = n;
        
        // starter med n-1 fordi fakultet variabelen allerede har n
        for(int i = n-1; i > 0; i--){
            
            fakultet = fakultet*i;
            
        }
        // skriver ut resultatet
        System.out.println("Fakultet av "+n+ " er: " + fakultet);
		
    }
}