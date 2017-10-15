package thom9521;

//Denne java class indeholder objekter som af genereret ud fra Studerende.java.

public class DatHoldet {

    DatHoldet() { //Constructor

        Studerende s1 = new Studerende("Thomas"); //Kører constructor som sætter navn
        s1.setAlderDreng(21); //Sætter alderen
        s1.programmerer(); //Kører en metode

        System.out.println();

        Studerende s2 = new Studerende(); //Kører no-arg constructor
        s2.setNavn("Michael"); //Sætter navn
        s2.setAlderDreng(24); //Sætter alder
        s2.forstyrer(); // Kører metode

        System.out.println();

        Studerende s3 = new Studerende("Niels"); //Kører constructor som sætter navn
        s3.læser(); //Kører metode

        System.out.println();

        Studerende s4 = new Studerende(); //Kører no-arg constructor
        s4.setNavn("Liselotte"); // Sætter navn
        s4.setAlderPige(25); // Sætter alder
        s4.lærer(); // Kører metode
    }

}
