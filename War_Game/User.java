package Upcasting.War_Game;

import Upcasting.War_Game.Game_Component.Game;
import Upcasting.War_Game.Game_Component.Weapon;

public class User {
    public static void main(String[] args) {
        Game war=new Game();
        Weapon weapon=war.equipWeapon();
        weapon.use();

    }
}
