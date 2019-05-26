public class program4{

    public static void main(String[] args){
        int HP;
        character.level();
        character.Class();
        character.getvalues();

        HP=(character.Level*((int)((Math.random()*1000% character.hitdice)+1)+character.ConBonus));
        System.out.println("HP: [" + HP + "]");                                  //display HintPoints
    }
}