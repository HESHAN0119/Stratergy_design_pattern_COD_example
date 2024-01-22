public class Main {
    public static void main(String[] args) {

        Player tera= new Player("terra");
        Player counter = new Player("counter");

        System.out.println("Before bomb plant........................");

        Istratergy aggresive=new AggresiveStratergy();
        Istratergy defencive= new DefensiveStratergy();

        tera.setStratergy(aggresive);
        counter.setStratergy(defencive);

        tera.action();
        counter.action();

        System.out.println("After bomb plant..............................");

        tera.setStratergy(defencive);
        counter.setStratergy(aggresive);
        tera.action();
        counter.action();

    }
}