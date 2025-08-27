import java.util.Scanner;

public class OppgaveO2{
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i<10; i++){
            
            System.out.println("Skriv inn poengsum:");
            System.out.print(">");
            // Leser inn poengsum fra bruker
            int poeng = input.nextInt();
        
        
            // Initialiserer karakter variabel med U for ugyldig
            char karakter = 'U';
        
            if(poeng < 0 || poeng >100 ){
                System.out.println("Poengsummen er utenfor gyldig område! Prøv på nytt");
                // Trekker fra igjen på teller for å ta inn poengsummen på nytt
                i--;
                // Hopper til neste runde i løkken
                continue;
            }
            else if(poeng < 40){
                karakter = 'F';
            }
            else if(poeng < 50){
                karakter = 'E';
            }
            else if(poeng < 60){
                karakter = 'D';
            }
            else if(poeng < 80){
                karakter = 'C';
            }
            else if(poeng < 90){
                karakter = 'B';
            }
            else{
                karakter = 'A';
            }
        
            // printer karakteren på skjermen om den har gyldig verdi
            if(karakter != 'U'){
                System.out.println("Karakteren er: " + karakter);
            }
        }
        
        input.close();
    }
}