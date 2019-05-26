import java.util.Scanner;

public class program2 {
    static int ConBonus,Str,Dex,Con,Int,Wis,Cha;

    public static int roll() {
        int value = (int) (Math.random() * 1000 % 6 + 1) + (int) (Math.random() * 1000 % 6 + 1) + (int) (Math.random() * 1000 % 6 + 1); //calculate values for variables
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Level;                                                                 //prompt Level
        System.out.println("Enter Level :");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Enter a number.");
            sc.next();
        }
        Level = sc.nextInt();
        while (Level <= 0){                                            //check Level
            System.out.println("Invalid input ,Enter a positive number");    //to invalid input display "invalid input" & prompt it again
            Level=sc.nextInt();
            }

        System.out.println("Level: [" + Level + "]");               //display Level
        int input = 0;
        while (input != 1) {
            Str = roll();                                       //get value for Str
            Dex = roll();                                       //get value for Dex
            Con = roll();                                       //get value for Con
            Int = roll();                                       //get value for Int
            Wis = roll();                                       //get value for Wis
            Cha = roll();                                       //get value for Cha

            System.out.println("Str : [" + Str + "]");
            System.out.println("Dex : [" + Dex + "]");
            System.out.println("Con : [" + Con + "]");
            System.out.println("Int : [" + Int + "]");
            System.out.println("Wis : [" + Wis + "]");
            System.out.println("Cha : [" + Cha + "]");

            System.out.println("If you agree with this values enter'1' & If you are not enter 'any key'.");
            input = sc.nextInt();
        }
            bonus("Str",Str);
            bonus("Dex",Dex);
            conbonus("Con",Con);
            bonus("Int",Int);
            bonus("Wis",Wis);
            bonus("Cha",Cha);

            int HP = 0;
            for (int a = 1; a != Level; a++);
            {
                HP = ((int) (Math.random() * 1000 % 6 + 1) + (ConBonus) + HP);              //calculate HintPoints
                System.out.println("HP: [" + HP + "]");                                  //display HintPoints

            }
    }
}

