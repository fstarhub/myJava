package com.star;

public class Master {
    String name="";
    private boolean marry = false;
    private boolean sex = false;
    public void Master(String param1) {
        this.name=name;
    }
    public void setSex(boolean itemSex) {
        sex = itemSex;
    }
    public boolean getSex() {
        return  sex;
    }
    public void feed(Pet pet) {
        pet.eat();
        pet.jump();
    }
}
