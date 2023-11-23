package de.ait.homework36;

public class SuperHero {
    private String name;
    private int power;
    private int age;

    public SuperHero(String name, int power, int age) {
        this.name = name;
        this.power = power;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power >=1 && power <= 10){
            this.power = power;
        }
        else {
            System.err.println("Wrong power" + power);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "name '" + name + '\'' +
                ", power " + power +
                ", age " + age;
    }
}
