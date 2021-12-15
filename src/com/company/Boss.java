package com.company;

public class Boss {
    private int bossHealth;
    private int bossDamage;
    private int bossDefenseType;

public int getBossHealth(){return bossHealth;}
    public int getBossDamage(){return bossDamage;}

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getBossDefenseType(){return bossDefenseType;}

    public void setBossDefenseType(int bossDefenseType) {
        this.bossDefenseType = bossDefenseType;
}

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }
    public void bossChangeDefense(){
        System.out.println(bossDefenseType+20);
    }
}
