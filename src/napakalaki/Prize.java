/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author jcpulido97
 */
public class Prize {
    private int treasures;
    private int level;
    
    public Prize(int trs, int lvl)
    {
        treasures = trs;
        level = lvl;
    }
    public int getTreasures()
    {
        return treasures;
    }
    public int getlevel()
    {
        return level;
    }
    public String toString()
    {
        return "Treasures = " + Integer.toString(treasures) 
                + " levels = " + Integer.toString(level);
    }
}
