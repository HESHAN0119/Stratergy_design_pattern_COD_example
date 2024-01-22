public class Player {

    Istratergy behaviour;
    String type;

    public Player(String type) {
        this.type = type;
    }

    public void setStratergy(Istratergy behaviour){
        this.behaviour=behaviour;
    }

    public void action(){
        System.out.println("Player : "+type);
        behaviour.actionCommand();
    }
}
