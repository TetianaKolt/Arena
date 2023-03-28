public class ArenaManager {

  public static void main(String[] args) {

    Arena a = new Arena();
    a.addGladiatorToArena(new Gladiator("Thor", 15, 50, 15, 500));
    a.addGladiatorToArena(new Gladiator("Rex", 10, 40, 20, 400));
    a.addGladiatorToArena(new Gladiator("Kel", 9, 45, 25, 400));
    a.addGladiatorToArena(new Gladiator("Graut", 15, 45, 25, 500));
    a.addGladiatorToArena(new Gladiator("Affius", 5, 30, 30, 300));

    while (a.getAliveGladiatorsCount() > 1) {
      a.round();
    }

    if (a.getAliveGladiatorsCount() == 1) {
      System.out.println("Гладіатор " + a.getGlName(0) + " переміг!");
    } else {
      System.out.println("Пфф! Червʼяки!");
    }
  }
}
