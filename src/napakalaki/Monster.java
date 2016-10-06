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
public class Monster {
    private String name;
    private int combatLevel;
    private Prize prize;
    private BadConsequence malrollo;
    
    public Monster(String nme, int lvl, BadConsequence bc, Prize prz)
    {
        name = nme;
        combatLevel = lvl;
        malrollo = bc;
        prize = prz;
    }
    public String getName()
    {
        return name;
    }
    public int getCombatLevel()
    {
        return combatLevel;
    }
    public Prize getPrize()
    {
        return prize;
    }
    public BadConsequence getMalRollo()
    {
        return malrollo;
    }
    public String toString()
    {
        return  "Name = " + name +
                " Combat Level = " + Integer.toString(combatLevel) +
                " Prize = " + prize.toString() +
                " Mal Rollo = " + malrollo.toString();
    }
}
