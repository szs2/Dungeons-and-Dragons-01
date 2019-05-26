import java.util.Scanner;

public class program03 {
    static int ConBonus,value,Str,Dex,Con,Int,Wis,Cha;

    public static int select(){
        int a = (int) (Math.random() * 1000 % 6 + 1);
        int b = (int) (Math.random() * 1000 % 6 + 1);
        int c = (int) (Math.random() * 1000 % 6 + 1);
        int d = (int) (Math.random() * 1000 % 6 + 1);

        if (a < b || a < c || a < d) {
            value = b + c + d;
        } else if (b < a || b < c || b < d) {
            value = a + c + d;
        } else if (c < a || c < b || c < d) {
            value = a + b + d;
        } else {
            value = a + b + c;
        }
        return value;
    }

    public static void bonus(String name, int value){
        int Bonus = 0;

        if (value == 10){
            System.out.println(name+" : ["+value+"] ["+Bonus+"]");
        } else if (value>10){

            for (int i = 11;i <= value;i++){
                if (i %2 ==0){
                    Bonus++;
                }
            }System.out.println(name+" : ["+value+"]+["+Bonus+"]");
        }else {
            for (int i= 9;i>=value;i--){
                if (i%2==1){
                    Bonus++;
                }
            }System.out.println(name+" : ["+value+"]-["+Bonus+"]");
        }
    }

    public static void conbonus(String name, int value){
        ConBonus = 0;

        if (value == 10){
            System.out.println(name+" : ["+value+"] ["+ConBonus+"]");
        } else if (value>10){

            for (int i = 11;i <= value;i++){
                if (i %2 ==0){
                    ConBonus++;
                }
            }System.out.println(name+" : ["+value+"]+["+ConBonus+"]");
        }else {
            for (int i= 9;i>=value;i--){
                if (i%2==1){
                    ConBonus++;
                }
            }System.out.println(name+" : ["+value+"]-["+ConBonus+"]");
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int Level;                                                                 //prompt Level
        System.out.println("Enter Level :");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Enter a number.");
            sc.next();
        }
        Level = sc.nextInt();
        while (Level <= 0) {                                            //check Level
            System.out.println("Invalid input ,Enter a positive number");    //to invalid input display "invalid input" & prompt it again
            Level = sc.nextInt();
        }

        System.out.println("Level: [" + Level + "]");               //display Level
        int input = 0;
        while (input != 1) {

            Str = select();
            Dex = select();                                    //get value for Dex
            Con = select();                                     //get value for Con
            Int = select();                                   //get value for Int
            Wis = select();                                      //get value for Wis
            Cha = select();                                    //get value for Cha

            System.out.println("Str : [" + Str + "]");
            System.out.println("Dex : [" + Dex + "]");
            System.out.println("Con : [" + Con + "]");
            System.out.println("Int : [" + Int + "]");
            System.out.println("Wis : [" + Wis + "]");
            System.out.println("Cha : [" + Cha + "]");

            System.out.println("If you agree with this values enter'1' & If you are not enter 'any key'.");
            input = sc.nextInt();
        }

        bonus("Str", Str);
        bonus("Dex", Dex);
        conbonus("Con", Con);
        bonus("Int", Int);
        bonus("Wis", Wis);
        bonus("Cha", Cha);

        int HP = 0;
        for (int a = 1; a != Level; a++) ;

        {
            HP = ((int) (Math.random() * 1000 % 6 + 1) + (ConBonus) + HP);              //calculate HintPoints
            System.out.println("HP: [" + HP + "]");                                  //display HintPoints

        }


    }
}