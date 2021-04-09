package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Magic magic = new Magic();
        magic.setTypeSuper("Become invisible");
        Medic medic = new Medic();
        medic.setTypeSuper("Treat two at once");
        Warrior warrior = new Warrior();
        warrior.setTypeSuper("Cleaving blade");

      Hero [] myKod = {magic, medic, warrior };
        for (int i = 0; i < myKod.length; i++) {
             myKod[i].applySuperAbilitya("");




        }
    }
}
