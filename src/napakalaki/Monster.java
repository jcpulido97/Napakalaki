/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

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
	byte[] array = new byte[7];
	new Random().nextBytes(array);
	String randomstring = new String(array, Charset.forName("UTF-8"));

        name = nme + randomstring;
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
