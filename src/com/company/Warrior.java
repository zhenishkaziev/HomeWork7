package com.company;

public class Warrior extends Hero {

    @Override
    public void applySuperAbilitya(String superAbilityType) {
        super.applySuperAbilitya(superAbilityType);
        System.out.println("Воин вонзил своим мечом противника и сразил его");
    }
}
