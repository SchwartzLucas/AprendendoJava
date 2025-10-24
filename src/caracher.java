public class caracher {

    String name;
    int level;

    caracher(){
        level = 1;
    }


    caracher(String pname, int plevel){
        this.name = pname;
        this.level = plevel;
    }

    void attack(){
        System.out.println(name + "Attack");
    }
}
