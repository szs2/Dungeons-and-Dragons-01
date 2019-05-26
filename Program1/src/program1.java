import java.util.Scanner;

public class program1 {
    static  int Level,Str,Dex,Con,Int,Wis,Cha;      // declaring Level,Str,Dex,Con,Int,Wis,Cha as static variables

    public static int validate(int value){
        Scanner sc = new Scanner(System.in); //declare variable for each value

        while (!sc.hasNextInt()) {      // check value is a integer
            System.out.println("Invalid input. Enter a number.");

            sc.next();
        }
        value = sc.nextInt();
        while(value <=0){       // check value is a positive number
            System.out.println("Invalid input ,Enter a positive number");
            value = sc.nextInt();
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

    public static void main(String[] args) {

        System.out.println("Enter Level : ");   //ask value for Level
        Level= validate(Level);     //

        System.out.println("Enter Str : ");     //ask value for Str
        Str= validate(Str);

        System.out.println("Enter Dex : ");     //ask value for Dex
        Dex= validate(Dex);

        System.out.println("Enter Con : ");     //ask value for Con
        Con= validate(Con);

        System.out.println("Enter Int : ");     //ask value for Int
        Int= validate(Int);

        System.out.println("Enter Wis : ");     //ask value for Wis
        Wis= validate(Wis);

        System.out.println("Enter Cha : ");     //ask value for Cha
        Cha= validate(Cha);

        System.out.println("[Level] ["+Level +"]"); //Display Level
        bonus("Str",Str);   //run bonus method to calculate and display Bonus
        bonus("Dex",Dex);   //run bonus method to calculate and display Bonus
        bonus("Con",Con);   //run bonus method to calculate and display Bonus
        bonus("Int",Int);   //run bonus method to calculate and display Bonus
        bonus("Wis",Wis);   //run bonus method to calculate and display Bonus
        bonus("Cha",Cha);   //run bonus method to calculate and display Bonus

        int HP = Level*((int)(Math.random()*1000%6+1));     //calculating the hitpoints
        System.out.println("HP : ["+HP+"]");        //display HP
    }
}
