package controller;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import library.Character.*;
import library.Character;
import library.CharacterFactory;
import library.IPrototype;
import library.Weapon;
import library.Weapon.WeaponBuilder;
import library.WeaponFactory;
import view.SelectCharacterWindow;
import view.SelectCharacterWindow;

public class Main {
    public static void main(String args[]) throws IOException{
        
        IPrototype c1 = new CharacterBuilder().addName("C1").addImage("amaterasu").build();
        IPrototype c2 = new CharacterBuilder().addName("C2").addImage("amaterasu").build();
        IPrototype c3 = new CharacterBuilder().addName("C3").addImage("amaterasu").build();
        CharacterFactory.addPrototype("x", c1);
        CharacterFactory.addPrototype("y", c2);
        CharacterFactory.addPrototype("z", c3);
        Character c4 = (Character) CharacterFactory.getValues().get(0);
        System.out.println(c4.getName());
        
        SelectCharacterWindow ui = new SelectCharacterWindow();
        ui.show();
        
    }
}
