package nl.novi.jp.methods.beginner;

/**
 * Hieronder is een lege klasse. Maak hierin een methode die start() heet. Deze methode print "Power on" uit.
 *
 * Zorg ervoor dat de methode wordt aangeroepen en dat de tekst uitgeprint wordt.
 */
public class BeginnerFive {
    public static void main(String[] args) {
        System.out.println("start");
        powerOn();
        PowerUit();
    }

    private static void PowerUit() {
        System.out.println("power uit");
    }

    private static void powerOn() {
        System.out.println("power on");
    }


}
