package com.company;

public class Main {

    public static void main(String[] args) {
        Hero batyr = new Hero();
        batyr.heroHealth = 300;
        batyr.heroDamage = 40;
        batyr.superPower = 150;
        System.out.println("Здоровья Батыра:" + batyr.heroHealth);
        System.out.println("Урон Батыра:" + batyr.heroDamage);
        System.out.println("Урон от суперспособности Батыра:" + batyr.superPower);


        Boss boss = new Boss();
        boss.setBossHealth(300);
        boss.setBossDamage(70);
        boss.setBossDefenseType(60);


        System.out.println("");

        System.out.println("Здоровья Босса" + boss.getBossHealth());
        System.out.println("Урон Босса" + boss.getBossDamage());
        System.out.println("Защита Босса" + boss.getBossDefenseType());

        System.out.println("Тип защиты");
        boss.bossChangeDefense();


    }
}
