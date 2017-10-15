package thom9521;

//Denne java class indeholder constructors og metoder, som beskriver datamatikerstuderende på mit hold

public class Studerende {

    //Datafields:
    private String navn = ""; //Declarer og initialiserer variablen
    private int alder = 0; //Declarer og initialiserer variablen

    Studerende() { // No-arg constructor
        System.out.println("Der er tilføjet en ny studerende til klasen!"); //Udskriver tekst

    }

    Studerende (String elevensNavn){ //Constructor som sætter navnet
        navn = elevensNavn;
        System.out.println("Navnet på den studerende er " + navn + "."); //Udskriver en tekst
    }

    Studerende (String elevensNavn, int elevensAlder){ //Constructor som både sætter navn og alder
        navn = elevensNavn;
        alder = elevensAlder;
        System.out.println("Navnet på den studerende er " + navn + ", som har alderen " + alder + ".");
    }

    public void setNavn(String elevensNavn){ //Metode som tilføjer navn
        navn = elevensNavn;
        System.out.println("Den studerendes navn er " + navn + ".");
    }

    public void setAlderDreng(int elevensAlderDreng){ //Metode til at sætte drengens alder
        alder = elevensAlderDreng;
        System.out.println("Og han er " + elevensAlderDreng + " år gammel.");
    }

    public void setAlderPige (int elevensAlderPige){ //Metode til at sætte pigens alder
        alder = elevensAlderPige;
        System.out.println("Og hun er " + elevensAlderPige + " år gammel.");
    }

    public void læser() { //Metode
        System.out.println(navn + " læser på lektien, inden timen begynder.");
    }

    public void forstyrer(){ //Metode
            System.out.println(navn + " forstyrer de andre studerende midt i undervisningen.");
    }

    public void programmerer() { //Metode
        System.out.println(navn + " er i fuld gang med at programmere et nyt program til Microsoft.");
    }

    public void lærer() { //Metode
        System.out.println(navn + " lærer en helt masse i Ándrás' timer!");
    }
}
