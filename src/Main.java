import Models.Fighter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("\uD83E\uDDD4 Heracles", 20, 6, 100);
        Fighter fighter2 = new Fighter("\uD83E\uDD81 Nemean Lion", 11, 13, 100);
        System.out.println(fighter1.getName() + " " + fighter1.getLife() + " ❤\uFE0F");
        System.out.println(fighter2.getName() + " " + fighter2.getLife() + " ❤\uFE0F");

        while (fighter1.getLife() > 0 ||  fighter1.getLife() > 0) {
            fighter1.fight(fighter2);
            if (fighter2.getLife() <=0) {
                System.out.println(fighter2.getName() + " loses");
                System.out.println(fighter1.getName() + " wins");
                break;
            }
            fighter2.fight(fighter1);
            if (fighter1.getLife() <=0) {
                System.out.println(fighter1.getName() + " loses");
                System.out.println(fighter2.getName() + " wins");
                break;
            }

        }

    }
}