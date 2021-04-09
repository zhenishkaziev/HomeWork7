package com.company;

public class Medic extends Hero {

    @Override
    public void applySuperAbilitya(String superAbilityType) {
        super.applySuperAbilitya(superAbilityType);
        System.out.println("Медик спас партнера излечив его");
    }
}
