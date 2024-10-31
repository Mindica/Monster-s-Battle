public class Monster {
    String name;
    int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println("Monster " + name + " the Zombie was created");
    }

    public void growl() {
        System.out.println(name + " the Zombie growled");
    }

    public void attack() {
        System.out.println("Monster " + name + " the Zombie attacked with damage " + damage);
    }
}
