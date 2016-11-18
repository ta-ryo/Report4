package jp.ac.uryukyu.ie.e165716;

import org.junit.Test;

import static org.junit.Assert.*;
public class EnemyTest {
    @Test
    public void attack() throws Exception {
        int heroHP = 10;
        Hero hero = new Hero("ヨシヒコ", heroHP, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);
        enemy.dead = true;

        for(int i=0; i<10; i++){
            hero.attack(enemy);
            enemy.attack(hero);
        }
        assertEquals(heroHP, hero.hitPoint);

    }

}