import java.util.*;

public class Main {
    public static void main(String[] Args){
        System.out.println( "Krychle.\n" + "   e-------f\n" + "  /|      /|\n" + " / |     / |\n" + "a--|----b  |\n" + "|  g----|--h\n" + "| /     | /\n" + "c-------d\n\n\n");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int stran;
        for(int i = 0; i < 3; i++){
            System.out.println("Zadej hranu " + i + ". krychle.");
            stran = scanner.nextInt();
            System.out.println("Krychle o hrane " + stran + " ma objem " + Krychle.Volum(stran) + "³ a povrch " + Krychle.Surfes(stran) + "².");
        }
        System.out.println("Krychle, out.");

    }
}
