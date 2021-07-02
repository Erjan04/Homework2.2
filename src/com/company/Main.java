package com.company;

public class Main {

    public static void main(String[] args) {


        Warrior warrior = new Warrior(200,30,"Шквал быстрых ударов","Магия");
        //  warrior.print();
        Magic magic = new Magic(120,100,30,"Огненный шар",15,"Медленная атака");
        //  magic.print();
        Killer killer = new Killer(150,25,"Тайм-стоп","Скрытность","Танки и бойцы");
        //  killer.print();

        Printable[] printables = {warrior, magic, killer};
        for (Printable printable:printables) {
            System.out.println(printable.getClass().getSimpleName() + ": " );

            printable.print();
        }
    }


    public static Printable createObject(String className){
        Printable printable = null;
        switch (className){
            case "Боец":
                printable = new Warrior(202,30,"Крит.урон","Магия");
                break;
            case "Маг":
                printable = new Magic(120,120,
                        20,"Огненный шар",20,"Крысы");
                break;
            case "Убийца" :
                printable = new Killer(160,25,"Тень","Перемещение","Нет");
                break;

        }


        return printable; //Как-то так
    }
}

