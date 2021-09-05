package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setBossAttackType(200);
        boss.setBossDamage(10);
        boss.setBossHealth(500);

        System.out.println("BossAttackType " + boss.getBossAttackType());
        System.out.println("BossDamage "+ boss.getBossDamage());
        System.out.println("BossHealth "+ boss.getBossHealth());
        Hero[] hero = createHeroes();
        for (int i = 0; i < hero.length; i++) {
            System.out.println("HeroAttackType " + hero[i].getHeroAttackType());
            System.out.println("HeroDamage " + hero[i].getHeroDamage());
            System.out.println("HeroHealth " + hero[i].getHeroHealth());
        }


    }

    public static Hero[] createHeroes(){
        Hero hero1= new Hero(15,120,125);
        Hero hero2= new Hero();
        Hero hero3= new Hero(15,120);

        Hero[] heroes = {hero1, hero2,hero3};

        return heroes;
    }

}
