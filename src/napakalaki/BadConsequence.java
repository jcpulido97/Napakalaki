/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author jcpulido97
 */
public class BadConsequence {
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    
    public BadConsequence(String txt, int lvls, int nVisible, int nHidden)
    {
        text = txt;
        levels = lvls;
        nVisibleTreasures = nVisible;
        nHiddenTreasures = nHidden;
    }
    public BadConsequence(String txt, boolean dth)
    {
        text = txt;
        death = dth;
    }
    public BadConsequence(String txt,
                          int levl, 
                          ArrayList<TreasureKind> tVisible,
                          ArrayList<TreasureKind> tHidden)
    {
        text = txt;
        levels = levl;
        specificHiddenTreasures = tHidden;
        specificVisibleTreasures = tVisible;
    }
    public int getLevels()
    {
        return levels;
    }
    public String getText()
    {
        return text;
    }
    public int getnVisibleTreasures()
    {  
        return nVisibleTreasures;
    }
    public int getnHiddenTreasures()
    {  
        return nHiddenTreasures;
    }
    public boolean getDeathState()
    {
        return death;
    }
    public ArrayList<TreasureKind> getSpecificHiddenTreasures()
    {
        return specificHiddenTreasures;
    }
    public ArrayList<TreasureKind> getSpecificVisibleTreasures()
    {
        return specificVisibleTreasures;
    }
    public String toString()
    {
        return  "Text = " + text +
                " Levels = " + Integer.toString(levels)+
                " Visible Treasures = " + Integer.toString(nVisibleTreasures) +
                " Hidden Treasures = " + Integer.toString(nHiddenTreasures) +
                " Death State = " + Boolean.toString(death) +
                " Specific Hidden Treasures = " + specificHiddenTreasures.toString() +
                " Specific Visible Treasures = " + specificVisibleTreasures.toString();
    }
}