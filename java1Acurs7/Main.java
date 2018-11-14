import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        String line;
        
        String [] input;
        
        while (true) {
            line = scanner.nextLine(); // pas 1 : preluam inputul de la tastatura
            input = line.split("\\s+"); // pas 2 : spargerea inputtului
            
            switch (input[0].toUpperCase()) {
                case "JOACA" : 
                    int sir[] = new int[]{
                        Integer.parseInt(input[1]),
                        Integer.parseInt(input[2]),
                        Integer.parseInt(input[3]),
                        Integer.parseInt(input[4]),
                        Integer.parseInt(input[5]),
                        Integer.parseInt(input[6])
                    };
                    int[] randSir = Loterie.getInstance().genereaza();
                    int punctaj = Loterie.getInstance().calculeaza(sir, randSir);
                    
                    System.out.println("Ai castigat " + punctaj + " puncte");
                    Loterie.getInstance().afiseaza(randSir);
                    break;
                case "EXIT" : 
                    System.exit(0);
                    break;
                default : System.err.println("Comanda invalida");
            }
            
            
            
        }
    }
}