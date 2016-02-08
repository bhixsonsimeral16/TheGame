package com.example.brian.thegame;

/**
 * Created by Brian on 2/7/2016.
 */
public class Unit {
    private boolean mPC;
    private boolean mAlive;
    private int mMaxHP;
    private int mHP;
    private int mATK;
    private int mDEF;
    private int mMOV;
    private int mDMG;
    private int mDMGDice;
    private int mUnitID;


    public Unit(int unitID, int hp, int atk, int dmg, int dmgDice, int def, int mov, boolean pc, boolean alive){
        mUnitID = unitID;
        mAlive = alive;
        mPC = pc;
        mMaxHP = hp;
        mHP = hp;
        mATK = atk;
        mDMG = dmg;
        mDMGDice = dmgDice;
        mDEF = def;
        mMOV = mov;

    }

    public int getDMGDice() {
        return mDMGDice;
    }

    public void setDMGDice(int DMGDice) {
        mDMGDice = DMGDice;
    }

    public boolean isAlive() {
        return mAlive;
    }

    public void setAlive(boolean alive) {
        mAlive = alive;
    }

    public int getMaxHP() {
        return mMaxHP;
    }

    public void setMaxHP(int maxHP) {
        mMaxHP = maxHP;
    }


    public int getDMG() {
        return mDMG;
    }

    public void setDMG(int DMG) {
        mDMG = DMG;
    }

    public int getUnitID() {
        return mUnitID;
    }

    public void setUnitID(int unitID) {
        mUnitID = unitID;
    }

    public boolean isPC() {
        return mPC;
    }

    public void setPC(boolean PC) {
        mPC = PC;
    }

    public int getHP() {
        return mHP;
    }

    public void setHP(int HP) {
        mHP = HP;
    }

    public int getATK() {
        return mATK;
    }

    public void setATK(int ATK) {
        mATK = ATK;
    }

    public int getDEF() {
        return mDEF;
    }

    public void setDEF(int DEF) {
        mDEF = DEF;
    }

    public int getMOV() {
        return mMOV;
    }

    public void setMOV(int MOV) {
        mMOV = MOV;
    }

}
