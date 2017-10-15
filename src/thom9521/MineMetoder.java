package thom9521;

/*Denne java class indeholder i forskellige koder, som illustrerer noget af det som jeg har lært i løbet af
min tid som datamatiker-studerende. */

import java.util.Scanner;

public class MineMetoder {

    MineMetoder() { //Constructor

        //Her genererer jeg et tal mellem 1 og 100. Jeg plusser med en så 0 ikke kan trækkes.
        int randomNumber = (int) (Math.random() * 99 + 1);
        System.out.println("Tag chancen og vind i lotto! Du vinder hvis dit tal er over 80."); //Udskriver en tekst

        System.out.println("Du trak tallet: " +randomNumber); //Udskriver tekst med det genererede nummer.


        if (randomNumber >= 80){ //En if som bliver udskrivet hvis randomNumber er 80 eller større.
            System.out.println("Du har vundet i lotto!!!");
        }
        else { // Hvis tallet ikke er 80 eller større, så bliver dette udskrevet:
            System.out.println("Dit tal er desværre mindre end 80, så du har tabt i lotto.");
        }
        System.out.println();

        System.out.println("Indtast længden på kvadrat, så regner jeg arealer for dig! \nIndtast længde:" ); //Tekst
        Scanner input = new Scanner(System.in); //Importerer scanner klassen
        double længde = input.nextDouble(); //Sørger for jeg kan skrive et input ind når programmet køres
        double areal = længde * længde; //Regner arealet ud
        //Udskriver tekst + udregningen
        System.out.println("Arealet af dit kvadrat som har sidernes længde " + længde + " er = " + areal);

        System.out.println();

        int rigtigeSvar = 2; //Deklarer og initialiserer variablen
        System.out.println("Hvad er kvadratrodden af 8?"); //Tekst
        double svar = input.nextDouble(); //Input så man kan indtaste et svar

        if(svar == rigtigeSvar){ //If svar er = det rigtige svar bliver nedenfor udskrevet
            System.out.println("Du har svaret rigtigt!");
        }
        else { //Hvis svaret var forkert udskrives nedenfor
            System.out.println("Du har svaret forkert, prøv igen!");
        }

        //Et loop, som får linje 34-42 til at gå igen, hvis input svaret ikke er = det rigtige svar
        while(svar != rigtigeSvar) {
            System.out.println("Hvad er kvadratrodden af 8?");
            svar = input.nextDouble();

            if(svar == rigtigeSvar){
                System.out.println("Du har svaret rigtigt!");
            }
            else {
                System.out.println("Du har svaret forkert, prøv igen!");
            }



        }
    }
}
