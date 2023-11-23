/*
package de.ait.homework36;

import java.util.ArrayList;
import java.util.List;

public class SuperHeroManager {
    List <SuperHero> superheroes = new ArrayList<>();
    public void addSuperHero (SuperHero superhero){
        if (checkSuperhero(superhero.getName()) == false && checkPower(superhero)){
            superheroes.add(superhero);
        }

    }
    public void removeSuperHero (String name){

    }
    public void getSuperHero (String name){

    }
    public List<SuperHero> getSuperheroes(){

    }
    private boolean checkSuperhero(String superheroName){
        for (SuperHero superhero: superheroes){
            if (superheroName.equals(superhero.getName())){
                return true;
            }
        }
        return false;
    }
    private boolean checkPower (SuperHero superhero){
        if (superhero.getPower() >= 1 && superhero.getPower() <= 10) {
            return true;
        }
        else return false;
    }

}
*/
