package com.company;

public class Hero {
    private int heroHealth;
    private int heroDamage;
    private int heroAttackType;

    public Hero(int heroHealth, int heroDamage, int heroAttackType)
    {
        this.heroHealth = heroHealth;
        this.heroDamage= heroDamage;
        this.heroAttackType = heroAttackType;
    }

    public Hero(int heroHealth, int heroDamage)
    {
        this.heroHealth= heroHealth;
        this.heroDamage= heroDamage;
        //this.heroAttackType = 0;
    }

    public Hero()
    {
        heroHealth = 20;
        heroDamage = 200;
        heroAttackType = 200;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public int getHeroAttackType() {
        return heroAttackType;
    }

    public void setHeroAttackType(int heroAttackType) {
        this.heroAttackType = heroAttackType;
    }
}
