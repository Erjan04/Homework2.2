package com.company;

public class Warrior extends Hero {
        int health;
        int damage;
        String superPower;
        String debility;

    public Warrior(int health, int damage, String superPower, String debility) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
        this.debility = debility;
    }

    @Override
    public void print() {
        System.out.println("Здоровья бойца:" + health + "\nУрон бойца:" + damage +
                "\nУльта:" + superPower + "\nСлабости:" + debility);
    }
}
