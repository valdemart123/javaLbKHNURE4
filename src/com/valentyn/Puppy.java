package com.valentyn;

public class Puppy extends Dog {

    public Puppy(String name) {
        super(name);
    }

    @Override
    public void bite () {
        System.out.println("Я тебя Кусь чуть-чуть!");
    }
    @Override
    public void voice () {
        System.out.println("Я на тебя Тяв!");
    }

    public String toString()
    {
        return getClass().getName()+'#'+Integer.toHexString(hashCode());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Puppy comparePuppy = (Puppy) obj;
        return getName() == comparePuppy.getName();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }
}
