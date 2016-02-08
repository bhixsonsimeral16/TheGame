package com.example.brian.thegame;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Brian on 2/7/2016.
 */
public class Controller {

    private ArrayList<Unit> mGameBoard = new ArrayList<>(144);

    public GameBoard(){
        mGameBoard = new ArrayList<>(144);
    }

    /**
     * Helper method for controller MainActivity to easily
     * get the Unit at a specific spot on the board
     * @param position is the spot of the checker on the board
     * @return the Unit on that spot
     */
    public Unit getUnit(int position){
        return mGameBoard.get(position);
    }

    /**
     * Sets up the gameboard with the starting game state, i.e.
     * creating a blank slate and setting terrain
     * for now this will also set the units as we won't allow the user to place them
     */
    public void startGameState() {
        //within the asList call, add either only spaces that can be moved on or all spaces
        ArrayList<Integer> boardSquares =  new ArrayList<Integer>(Arrays.asList());
    }

    //roll a d20 and add the ATK stat for the chance to hit
    public int rollAttack(Unit unit){
        int roll = rollDie(20)+unit.getATK();
        return roll;
    }

    //A unit's AC is 10 + it's DEF stat
    public int callAC(Unit unit){
        int AC = 10 + unit.getDEF();
        return AC;
    }

    //An attack lands if the attack roll is equal to or larger than the other unit's AC
    public boolean atkHit(int atk, int ac){
        return(ac <= atk);
    }

    //takes a unit's DMG and DMGDice
    //DMG is the die type that is rolled while DMGDice is the number of times it is rolled
    public int rollDmg(Unit unit){
        int dmg = 0;
        for (int i = 0; i < unit.getDMGDice(); i++){
            dmg+=rollDie(unit.getDMG());
        }
        return dmg;
    }

    //Subtract the damage roll from the unit's HP
    //If the unit drops to 0 or less, set status to dead
    public void updateHP(Unit unit, int dmg){
        if((unit.getHP()-dmg) <= 0){
            unit.setHP(0);
            unit.setAlive(false);
        }
        else {
            unit.setHP(unit.getHP() - dmg);
        }
    }

    //Method to roll dice of different types
    public int rollDie(int dieType){
        int roll = (int) Math.ceil(Math.random()*dieType);
        return roll;
    }
}
