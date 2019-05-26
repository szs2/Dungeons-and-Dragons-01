import java.util.Scanner;

class character{
    static Scanner sc = new Scanner(System.in);

    static int value,Level,hitdice,ConBonus;
    static String Class;
    public static String user;

    static int[] dicefaces={12,8,8,8,8,8,10,10,10,6,6};
    private static String[] stats={"Str","Dex","Con","Int","Wis","Cha"};

    private static int Str;
    private static int Dex;
    private static int Con;
    private static int Int;
    private static int Wis;
    private static int Cha;
    private static int[] valueofstats={Str,Dex,Con,Int,Wis,Cha};


    public static void level(){
        System.out.println("Enter user's name : ");
        user = sc.next();
        System.out.println("Enter Level : ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Enter a number.");
            sc.next();
        }
        Level = sc.nextInt();
        while(Level <=0){
            System.out.println("Invalid input ,Enter a positive number");
            Level = sc.nextInt();
        }
    }

    public static int Class(){
        String[] characterclass={"Barberian","Bard","Druid","Monk","Rogue","Warlock","Fighter","Ranger","Paladin","Sorcerer","wizard"};
        for(int i=0;i<characterclass.length;i++){
            switch (i) {
                case 11:
                    System.out.println(characterclass[i] + " . ");
                    break;
                default:
                    System.out.print(characterclass[i] + " , ");
            }
        }

        System.out.println("Enter Character.class from above characters : ");
        Class= sc.next();

        int a =0;

        switch(Class){
            case "Barberian" : hitdice=dicefaces[0];
                break;
            case "Bard" : hitdice=dicefaces[1];
                break;
            case "Druid" : hitdice=dicefaces[2];
                break;
            case "Monk" : hitdice=dicefaces[3];
                break;
            case "Rogue" : hitdice=dicefaces[4];
                break;
            case "Warlock" : hitdice=dicefaces[5];
                break;
            case "Fighter" : hitdice=dicefaces[6];
                break;
            case "Ranger" : hitdice=dicefaces[7];
                break;
            case "Paladin" : hitdice=dicefaces[8];
                break;
            case "Sorcerer" : hitdice=dicefaces[9];
                break;
            case "Wizard" : hitdice=dicefaces[10];
                break;
            default: System.err.println("invalid Character.class");

        }
        return hitdice;

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

    public static int select(){
        int a = (int) (Math.random() * 1000 % hitdice + 1);
        int b = (int) (Math.random() * 1000 % hitdice + 1);
        int c = (int) (Math.random() * 1000 % hitdice + 1);
        int d = (int) (Math.random() * 1000 % hitdice + 1);

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

    public static void getvalues(){
        int input = 0;
        while (input != 1) {
            System.out.println("Level : ["+Level+"]");
            for (int a = 0; a < stats.length; a++) {
                valueofstats[a] = select();
                System.out.println(stats[a] + " : [" + valueofstats[a] + "]");
            }
            System.out.println("If you agree with this values enter'1' & If you are not enter any other number.");
            input = sc.nextInt();
        }
        System.out.println("User's name : "+ user);
        System.out.println("Level : ["+Level+"]");
        System.out.println("Character.class : "+ Class);
        for(int b= 0;b<stats.length;b++){
            bonus(stats[b],valueofstats[b]);
        }
    }
}


