public class Gladiator {

  public String name;
  private final int minDamage;
  private final int maxDamage;
  private final int block;
  public int hp;

  public Gladiator(String name, int minDamage, int maxDamage, int block, int hp) {
    this.name = name;
    this.minDamage = minDamage;
    this.maxDamage = maxDamage;
    this.block = block;
    this.hp = hp;

    System.out.println("Гладіатор " + name + " готовий до бою!");

  }

  public void attack(Gladiator otherGl) {
    int damage = (int) (Math.random() * (this.maxDamage - this.minDamage + 1) + this.minDamage);
    System.out.println(
        "Гладіатор " + this.name + " наносить " + damage + " урон(а) по " + otherGl.name);
    otherGl.receiveDamage(damage);

  }

  public void receiveDamage(int damage) {
    damage = damage - blocking();
    hp -= damage;
    System.out.println("Гладіатор " + name + " отримав " + damage + " урону");
  }

  public int blocking() {
    return block;
  }


}
