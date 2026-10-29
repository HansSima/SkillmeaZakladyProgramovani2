import java.util.Random;
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
        /*Scanner mujScanner = new Scanner(System.in);
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
        }*/

        //Vypocet BMI
        /*float vyska;
        float hmotnost;
        float bmi = -1;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej vysku v metrech:");
        vyska = mujScanner.nextFloat();

        System.out.println("Zadej hmotnost v kilogramech:");
        hmotnost = mujScanner.nextFloat();

        bmi = hmotnost / (vyska * vyska);
        System.out.println(bmi);

        if(bmi < 18.5f && bmi >= 0){
            System.out.println("Uzivatel ma podvahu");
        }
        else if(bmi >= 18.5f && bmi < 25f){
            System.out.println("Uzivatel ma normalni hmotnost");
        }
        else if(bmi >= 25f){
            System.out.println("Uzivatel ma nadvahu");
        }
        else {
            System.out.println("Nelze zadat zapornou hmotnost");
        }*/

        //Hod kostkou suda vyhravas, licha prohravas
        /*Random nahodnyGenerator = new Random();
        int hodKostkou;
        hodKostkou = nahodnyGenerator.nextInt(1, 7);
        System.out.println("Hozene cislo: " + hodKostkou);

        if(hodKostkou % 2 == 0){
            System.out.println("Cislo je sude, vyhravas");
        } else {
            System.out.println("Cislo je liche, prohravas");
        }*/

        //switch - Vyber dne
        /*Scanner mujScanner = new Scanner(System.in);
        int cisloDne;

        System.out.println("Zadej cislo dne:");
        cisloDne = mujScanner.nextInt();

        switch(cisloDne){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Je pracovni den");
            break;
            case 6:
            case 7:
                System.out.println("Je vikend");
            break;
            default:
                System.out.println("Toto neni cislo dne");
        }*/

        //Pole
        /*int[] znamky = new int[5];
        znamky[0] = 3;
        znamky[1] = 5;
        znamky[2] = 1;
        znamky[3] = 4;
        znamky[4] = 1;

        //int[] znamky2 = new int[] {3, 5, 1, 4, 1};

        System.out.println(znamky[0]);*/

        /*String[] jmenaStudentu = new String[] {"Honza", "Lenka", "Petra", "Petr", "Jolana"};
        System.out.println(jmenaStudentu[4]);*/

        /*int[][] viceDimPole = new int[2][2];
        viceDimPole[0][0] = 83;*/

        //Smycka
        /*for(int i = 0; i < 8; i++) {
            System.out.println(i + ". Ahoj svete");
        }*/

        /*String[] jmenaStudentu = new String[] {"Honza", "Lenka", "Petra", "Petr"};

        for(int i = 0; i < jmenaStudentu.length; i++) {
            System.out.println(jmenaStudentu[i]);
        }

        for(String jmeno: jmenaStudentu){
            System.out.println(jmeno);
        }*/

        /*int[] nasobky = new int[10];

        //Naplnim pole
        for(int i = 0; i < 10; i++){
            nasobky[i] = i * 10;
        }
        //Vypisu pole
        for(int jedenNasobek: nasobky){
            System.out.println(jedenNasobek);
        }*/

        //while
        //int ridiciPromenna = 0;

        /*while(true){
            System.out.println(ridiciPromenna);
            ridiciPromenna++;
            if(ridiciPromenna == 5){
                break;
            }
        }*/

        /*do {
            System.out.println(ridiciPromenna);
        } while(ridiciPromenna != 0);*/

        //Blackjack
        int skoreHrace = 0;
        int skoreKrupiera = 0;
        int tazenakarta = 0;
        String uzivatelskyVstup;
        Random nahGen = new Random();
        Scanner mujScanner = new Scanner(System.in);

        do{
            tazenakarta = nahGen.nextInt(1, 14);
            System.out.println("Tazena karta byla: " + tazenakarta);
            skoreHrace = skoreHrace + tazenakarta;
            System.out.println("Skore hrace je: " + skoreHrace);

            if(skoreHrace > 21){
                System.out.println("Prohral jsi, prekrocil jsi 21");
                break;
            }

            System.out.println("Pro dalsi kartu stiskni y");
            System.out.println("Pokud nechces dalsi kartu stiskni n");
            uzivatelskyVstup = mujScanner.nextLine();

            if(uzivatelskyVstup.equals("y")){
                continue;
            }
            else if(uzivatelskyVstup.equals("n")){
                while(skoreKrupiera < skoreHrace){
                    tazenakarta = nahGen.nextInt(1, 14);
                    skoreKrupiera = skoreKrupiera + tazenakarta;
                }
                break;
            }


        } while(true);


    }
}