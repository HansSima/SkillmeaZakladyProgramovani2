import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        //Toto je promenna
        String pozdrav = "Ahoj svete";
        String jmeno = " od Honzy";
        jmeno = " od Jana";

        //Toto mi vypise do konzole Hello World
        System.out.println(pozdrav + jmeno);
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        */

        /*
        //Kalkulacka
        int prvniCislo = 20;
        int druheCislo = 5;

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);

        boolean pravdaNepravda = false;

        //Konstanta
        final double desCislo1 = 0.1;
        double desCislo2 = 0.2;

        System.out.println(desCislo1 + desCislo2);
        */

        //Vylepsena kalkulacka
        /*Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej prvni cislo:");
        int prvniCislo = mujScanner.nextInt();
        System.out.println("Zadej druhe cislo:");
        int druheCislo = mujScanner.nextInt();

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo / druheCislo);*/

        //String metody
        /*String mujText = "";
        System.out.println(mujText.isEmpty());*/

        //Prevadeni mezi typy
        /*String textoveCislo = "5";
        int prevedeneCislo = Integer.parseInt(textoveCislo);*/

        /*
        //Matematicke operace
        int prvCislo = 17;
        int druCislo = 17;

        System.out.println(--prvCislo);*/

        //Podminky a vetveni
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej vek:");
        int vek = mujScanner.nextInt();

        if(vek >= 18){
            System.out.println("Uzivatel je dospely");
            if(vek >= 65){
                System.out.println("Uzivatel je senior");
            }
        }
        else if(vek < 18 && vek >= 0){
            System.out.println("Uzivatel je nezletily");
        }
        else {
            System.out.println("Nelze zadat zaporne cislo");
        }


    }
}