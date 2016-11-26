package jp.ac.uryukyu.ie.e165716;

import sun.font.TrueTypeFont;

public class LivingThing{
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

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
    public String getName(){
        return this.name;
    }
    public int getHitpoint(){
        return this.hitPoint;
    }
    public void setDead(boolean dead){
        this.dead=dead;
    }

}
