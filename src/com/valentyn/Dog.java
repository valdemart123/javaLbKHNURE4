package com.valentyn;

public abstract class Dog implements Animal {
    private String name;
    public Dog (String name) {
        this.name=name;
    }
   @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void run (){
       System.out.println("Я бегаю!");
    };
    public void jump () {
        System.out.println("Я прыгаю!");
    }
    public void bite () {
        System.out.println("Я тебя Кусь сильно!");
    }

    public void voice () {
        System.out.println("Я на тебя ГАВ!");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Dog compareDog = (Dog) obj;
        return getName() == compareDog.getName();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}
