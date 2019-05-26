import java.io.File;


public class skill {
    private String name;
    private String optional;
    private String short_desc;
    private int stat_affinity;
    private int ranks;
    private skill next_skill;
    public skill(String athletics, String s) {
        super();
        this.name = name;
        this.optional = optional;
        this.short_desc = short_desc;
        this.stat_affinity = stat_affinity;
        this.ranks = ranks;
        this.next_skill = next_skill;
    }
        public String getName(){
            return name;
        }

        public String getOptional(){
            return optional;
        }

        public String getshort_desc(){
            return short_desc;
        }

        public void setOptional(String optional){
        this.optional = optional;
        }

        public void setShort_desc(String short_desc){
        this.short_desc =short_desc;
        }

        public int getstat_affinity(){
            return stat_affinity;
        }

        public void setStat_affinity(int stat_affinit){
        this.stat_affinity = stat_affinity;
        }

        public int getRabk(){
            return ranks;
        }

        public void setRanks(int ranks){
        this.ranks = ranks;
        }

        public skill getNext_Skill(){
            return next_skill;
        }

        public void setNext_skill(skill next_Skill){
        this.next_skill = next_Skill;
        }


        public void print() {
            System.out.println("The name : "+name);
            System.out.println("The oprional : "+optional);
            System.out.println("The shart_desc : "+short_desc);
            System.out.println("The stat_affinity : "+stat_affinity);
            System.out.println("The rank : "+ranks);
            System.out.println("The next_skill  : "+next_skill);
        }


}
