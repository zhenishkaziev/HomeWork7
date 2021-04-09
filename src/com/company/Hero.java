package com.company;

public abstract class Hero implements HavingSuperAbility{
    private int health;
    private int damage;
    private String typeSuper;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeSuper() {
        return typeSuper;
    }

    public void setTypeSuper(String typeSuper) {
        this.typeSuper = typeSuper;
    }

    @Override
    public void applySuperAbilitya(String superAbilityType) {

    }
}
