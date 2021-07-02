package com.company;

public class Killer extends Hero{
    int health;
    int damage;
    String superPower;
    String talent;
    String debility;

    public Killer(int health, int damage, String superPower, String talent, String debility) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
        this.talent = talent;
        this.debility = debility;
    }

    @Override
    public void print() {
        System.out.println("Здоровья убийцы:" + health +
                "\nУрон убийцы:" + damage + "\nУльта:" + superPower + "\nТалант:" + talent + "\nСлабости:" + debility );
    }
}
