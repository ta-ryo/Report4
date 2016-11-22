package jp.ac.uryukyu.ie.e165716;
public class LivingThing{
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead(){
            return dead;
        }
    public String getName(){
            return name;
        }
    public void attack(LivingThing opponent) {
        if (!dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！\n", name);
            opponent.wounded(damage);
        } else {
            System.out.printf("%sは死んでいる\n", name);

        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        System.out.printf("%sに%dのダメージを与えた！！", name, damage);
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}