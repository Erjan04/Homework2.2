package com.company;

public class Magic extends Hero{
    int health;
    int mana;
    int magicDamage;
    String superPower;
    int healthTimmeit;
    String debility;

    public Magic(int health, int mana, int magicDamage, String superPower, int healthTimmeit, String debility) {
        this.health = health;
        this.mana = mana;
        this.magicDamage = magicDamage;
        this.superPower = superPower;
        this.healthTimmeit = healthTimmeit;
        this.debility = debility;
    }

    @Override
    public void print() {
        System.out.println("Здоровья мага:" + health + "\nОчко маны:" + mana +
                "\nМагический урон:" + magicDamage +
                "\nУльта:" + superPower + "\nЛечение:" + healthTimmeit + "\nСлабости:" + debility);
    }
}
