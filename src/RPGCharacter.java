import javax.swing.*;

public class RPGCharacter {

    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.

     1. get name of player
     2. get strength of player
     3. get dexterity of player
     4. get spirit of player

     5. calculate damage = strength * dexterity
     6. calculate armor = strength * 100
     7. calculate mana capacity =  dexterity * spirit
     8. calculate spell strength = dexterity * manaCapacity + spirit

     */


    public static void main(String[] args) {

        String playerName = JOptionPane.showInputDialog("What is the name of your player?");
        double strength = Double.parseDouble(JOptionPane.showInputDialog("How strong is your player(1.00 - 10.00)?"));
        double dexterity = Double.parseDouble(JOptionPane.showInputDialog("What is the dexterity of your player(1.00 - 10.00)?"));
        double spirit = Double.parseDouble(JOptionPane.showInputDialog("How much spirit does your player have(1.00 - 10.00)?"));

        double damage = strength * dexterity;
        double armor = strength * 100;
        double manaCapacity = dexterity * spirit;
        double spellStrength = dexterity * manaCapacity + spirit;

        JOptionPane.showMessageDialog(null, playerName + ": " +
                " Damage: " + damage + " Armor: " + armor + " Mana Capacity" + manaCapacity + " Spell Strength " + spellStrength);






    }

}
