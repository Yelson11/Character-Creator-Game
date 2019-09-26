package controller;

import java.util.ArrayList;
import java.util.HashMap;
import library.IPrototype;
import library.Weapon;
import library.WeaponFactory;
import library.Character;
import library.CharacterFactory;


/*
MÉTODOS DEL CONTROLADOR

+getCharacters(): ArrayList<IPrototype<Character>>
+getWeapons(): ArrayList<Weapon>
+getCharacter(String pName): IPrototype<Character>
+getWeapon(String pCharacter, int pWeapon): Weapon
+startPrototypes: void
+createCharacter(String pName, int pLife, int pLevel,
        int pSpace, int pCost, ArrayList<String> images,
        ArrayList<String> weapons): void



*/

public class Controller {
    
    private  HashMap<String,IPrototype<Character>> CharacterList = new HashMap<>();
    
    //inicia los prototipos
    public void startPrototypes(){
        createWeapons();
        createCharacters();
    }
    
    //Entradas: nombre del personaje:String
    //Salidas : personaje solicitado: IPrototype<Character>
    public IPrototype<Character> getCharacter(String pName){
        return CharacterList.get(pName);
    }
    
    //Entradas: nombre del personaje:String, indice del arma: int
    //Salidas : arma solicitada:Weapon
    public Weapon getWeapon(String pCharacter, int pWeapon){
        Character current=  (Character) CharacterList.get(pCharacter);
        return current.getUsedWeapons().get(pWeapon);
    }
    
    //Salidas : lista con todos los personajes precreados
    public ArrayList<IPrototype<Character>> getCharacters(){
        return CharacterFactory.getValues();
    }
    
    //Salidas : lista con todos las armas precreados
    public ArrayList<Weapon> getWeapons(){
        return WeaponFactory.getValues();
    } 
    
    //Entradas: atributos del personaje a crear
    //Crea un nuevo personaje
    public void createCharacter(String pName, int pLife, int pLevel,
        int pSpace, int pCost, String image, ArrayList<String> weapons){
        
        IPrototype<Character> character= new Character.CharacterBuilder()
                .addName(pName)
                .addLife(pLife)
                .addLevel(pLevel)
                .addSpace(pSpace)
                .addCost(pCost)
                .addImage(image)
                .build();
    }
    
    //Crea los prototipos de armas predefinidos en el juego
    private void createWeapons(){
        Weapon assault = new Weapon.WeaponBuilder()
                .addName("assault")
                .addScope(5)
                .addLevel(1)
                .addDamage(3)
                .addCost(200)
                .addLevelRequired(1)
                .addImage("src/images/weapons/assault.png")
                .build();
        
        Weapon axe = new Weapon.WeaponBuilder()
                .addName("axe")
                .addScope(2)
                .addLevel(1)
                .addDamage(3)
                .addCost(100)
                .addLevelRequired(1)
                .addImage("src/images/weapons/axe.png")
                .build();
        
        Weapon ball = new Weapon.WeaponBuilder()
                .addName("ball")
                .addScope(1)
                .addLevel(1)
                .addDamage(1)
                .addCost(50)
                .addLevelRequired(1)
                .addImage("src/images/weapons/ball.png")
                .build();
        
        Weapon basketball = new Weapon.WeaponBuilder()
                .addName("basketball")
                .addScope(1)
                .addLevel(1)
                .addDamage(1)
                .addCost(50)
                .addLevelRequired(1)
                .addImage("src/images/weapons/basketball.png")
                .build();
        
        Weapon blackhole = new Weapon.WeaponBuilder()
                .addName("blackhole")
                .addScope(7)
                .addLevel(1)
                .addDamage(2)
                .addCost(100)
                .addLevelRequired(1)
                .addImage("src/images/weapons/blackhole.png")
                .build();
        
        Weapon fire = new Weapon.WeaponBuilder()
                .addName("fire")
                .addScope(3)
                .addLevel(1)
                .addDamage(2)
                .addCost(90)
                .addLevelRequired(1)
                .addImage("src/images/weapons/fire.png")
                .build();
        
        Weapon freeze = new Weapon.WeaponBuilder()
                .addName("freeze")
                .addScope(3)
                .addLevel(1)
                .addDamage(1)
                .addCost(90)
                .addLevelRequired(1)
                .addImage("src/images/weapons/freeze.png")
                .build();
        
        Weapon gas = new Weapon.WeaponBuilder()
                .addName("gas")
                .addScope(3)
                .addLevel(1)
                .addDamage(2)
                .addCost(50)
                .addLevelRequired(1)
                .addImage("src/images/weapons/gas.png")
                .build();
        
        Weapon grenade = new Weapon.WeaponBuilder()
                .addName("grenade")
                .addScope(6)
                .addLevel(1)
                .addDamage(4)
                .addCost(150)
                .addLevelRequired(1)
                .addImage("src/images/weapons/grenade.png")
                .build();
        
        Weapon grenadelauncher = new Weapon.WeaponBuilder()
                .addName("grenadelauncher")
                .addScope(10)
                .addLevel(1)
                .addDamage(7)
                .addCost(500)
                .addLevelRequired(1)
                .addImage("src/images/weapons/grenadelauncher.png")
                .build();
        
        Weapon gun = new Weapon.WeaponBuilder()
                .addName("gun")
                .addScope(2)
                .addLevel(1)
                .addDamage(1)
                .addCost(100)
                .addLevelRequired(1)
                .addImage("src/images/weapons/gun.png")
                .build();
        
        Weapon heal = new Weapon.WeaponBuilder()
                .addName("heal")
                .addScope(1)
                .addLevel(1)
                .addDamage(20)
                .addCost(100)
                .addLevelRequired(1)
                .addImage("src/images/weapons/heal.png")
                .build();
        
        Weapon hypex = new Weapon.WeaponBuilder()
                .addName("hypex")
                .addScope(2)
                .addLevel(1)
                .addDamage(8)
                .addCost(150)
                .addLevelRequired(1)
                .addImage("src/images/weapons/hypex.png")
                .build();
        
        Weapon kamahameha = new Weapon.WeaponBuilder()
                .addName("kamahameha")
                .addScope(5)
                .addLevel(1)
                .addDamage(6)
                .addCost(100)
                .addLevelRequired(1)
                .addImage("src/images/weapons/kamahameha.png")
                .build();
        
        Weapon lightning = new Weapon.WeaponBuilder()
                .addName("lightning")
                .addScope(5)
                .addLevel(1)
                .addDamage(5)
                .addCost(90)
                .addLevelRequired(1)
                .addImage("src/images/weapons/lightning.png")
                .build();
        
        Weapon lostvayne = new Weapon.WeaponBuilder()
                .addName("lostvayne")
                .addScope(1)
                .addLevel(1)
                .addDamage(10)
                .addCost(250)
                .addLevelRequired(1)
                .addImage("src/images/weapons/lostvayne.png")
                .build();
        
        Weapon perfectcube = new Weapon.WeaponBuilder()
                .addName("perfectcube")
                .addScope(10)
                .addLevel(1)
                .addDamage(10)
                .addCost(350)
                .addLevelRequired(1)
                .addImage("src/images/weapons/perfectcube.png")
                .build();
        
        Weapon punch = new Weapon.WeaponBuilder()
                .addName("punch")
                .addScope(1)
                .addLevel(1)
                .addDamage(1)
                .addCost(0)
                .addLevelRequired(1)
                .addImage("src/images/weapons/punch.png")
                .build();
        
        Weapon rasengan = new Weapon.WeaponBuilder()
                .addName("rasengan")
                .addScope(1)
                .addLevel(1)
                .addDamage(8)
                .addCost(90)
                .addLevelRequired(1)
                .addImage("src/images/weapons/rasengan.png")
                .build();
        
        Weapon raygun = new Weapon.WeaponBuilder()
                .addName("raygun")
                .addScope(5)
                .addLevel(1)
                .addDamage(5)
                .addCost(150)
                .addLevelRequired(1)
                .addImage("src/images/weapons/raygun.png")
                .build();
        
        Weapon run = new Weapon.WeaponBuilder()
                .addName("run")
                .addScope(5)
                .addLevel(1)
                .addDamage(0)
                .addCost(50)
                .addLevelRequired(1)
                .addImage("src/images/weapons/run.png")
                .build();
        
        Weapon shield = new Weapon.WeaponBuilder()
                .addName("shield")
                .addScope(1)
                .addLevel(1)
                .addDamage(4)
                .addCost(200)
                .addLevelRequired(1)
                .addImage("src/images/weapons/shield.png")
                .build();
        
        Weapon sword = new Weapon.WeaponBuilder()
                .addName("sword")
                .addScope(2)
                .addLevel(1)
                .addDamage(6)
                .addCost(100)
                .addLevelRequired(1)
                .addImage("src/images/weapons/sword.png")
                .build();
        
        Weapon thundergun = new Weapon.WeaponBuilder()
                .addName("thundergun")
                .addScope(10)
                .addLevel(1)
                .addDamage(20)
                .addCost(1000)
                .addLevelRequired(1)
                .addImage("src/images/weapons/thundergun.png")
                .build();
        
        WeaponFactory.addPrototype("assault", assault);
        WeaponFactory.addPrototype("axe", axe);
        WeaponFactory.addPrototype("ball", ball);
        WeaponFactory.addPrototype("basketball", basketball);
        WeaponFactory.addPrototype("blackhole", blackhole);
        WeaponFactory.addPrototype("fire", fire);
        WeaponFactory.addPrototype("freeze", freeze);
        WeaponFactory.addPrototype("gas", gas);
        WeaponFactory.addPrototype("grenade", grenade);
        WeaponFactory.addPrototype("grenadelauncher", grenadelauncher);
        WeaponFactory.addPrototype("gun", gun);
        WeaponFactory.addPrototype("heal", heal);
        WeaponFactory.addPrototype("hypex", hypex);
        WeaponFactory.addPrototype("kamahameha", kamahameha);
        WeaponFactory.addPrototype("lightning", lightning);
        WeaponFactory.addPrototype("lostvayne", lostvayne);        
        WeaponFactory.addPrototype("perfectcube", perfectcube);
        WeaponFactory.addPrototype("punch", punch);
        WeaponFactory.addPrototype("rasengan", rasengan);
        WeaponFactory.addPrototype("raygun", raygun);
        WeaponFactory.addPrototype("run", run);
        WeaponFactory.addPrototype("shield", shield);
        WeaponFactory.addPrototype("sword", sword);
        WeaponFactory.addPrototype("thundergun", thundergun);
    }
    
    //Crea los prototipos de personajes predefinidos en el juego
    private void createCharacters(){
        Character amaterasu = new Character.CharacterBuilder()
                .addName("amaterasu")
                .addSpace(1)
                .addLevel(1)
                .addCost(200)
                .addLife(80)
                .addImage("src/images/characters/amaterasu.png")
                .addLevelRequired(1)
                .addUsedWeapon(WeaponFactory.getPrototype("punch"))
                .addUsedWeapon(WeaponFactory.getPrototype("fire"))
                .addUsedWeapon(WeaponFactory.getPrototype("blackhole"))
                .build();
        
        Character escanor = new Character.CharacterBuilder()
                .addName("escanor")
                .addSpace(1)
                .addLevel(1)
                .addCost(1000)
                .addLife(1500)
                .addImage("src/images/characters/escanor.png")
                .addLevelRequired(1)
                .addUsedWeapon(WeaponFactory.getPrototype("punch"))
                .addUsedWeapon(WeaponFactory.getPrototype("axe"))
                .addUsedWeapon(WeaponFactory.getPrototype("fire"))
                .build();
        
        Character estarossa = new Character.CharacterBuilder()
                .addName("estarossa")
                .addSpace(1)
                .addLevel(1)
                .addCost(600)
                .addLife(500)
                .addImage("src/images/characters/estarossa.png")
                .addLevelRequired(1)
                .addUsedWeapon(WeaponFactory.getPrototype("punch"))
                .addUsedWeapon(WeaponFactory.getPrototype("blackhole"))
                .build();
        
        Character fox = new Character.CharacterBuilder()
                .addName("fox")
                .addSpace(1)
                .addLevel(1)
                .addCost(50)
                .addLife(40)
                .addImage("src/images/characters/fox.png")
                .addLevelRequired(1)
                .addUsedWeapon(WeaponFactory.getPrototype("punch"))
                .addUsedWeapon(WeaponFactory.getPrototype("run"))
                .addUsedWeapon(WeaponFactory.getPrototype("gun"))
                .addUsedWeapon(WeaponFactory.getPrototype("assault"))
                .build();
        
        Character goku = new Character.CharacterBuilder()
                .addName("goku")
                .addSpace(1)
                .addLevel(1)
                .addCost(900)
                .addLife(800)
                .addImage("src/images/characters/goku_1.png")
                .addImage("src/images/characters/goku_2.png")
                .addImage("src/images/characters/goku_3.png")
                .addImage("src/images/characters/goku_4.png")
                .addImage("src/images/characters/goku_5.png")
                .addLevelRequired(1)
                .addUsedWeapon(WeaponFactory.getPrototype("punch"))
                .addUsedWeapon(WeaponFactory.getPrototype("kamahameha"))
                .addUsedWeapon(WeaponFactory.getPrototype("lightning"))
                .build();
        
        Character healer = new Character.CharacterBuilder()
                .addName("healer")
                .addSpace(1)
                .addLevel(1)
                .addCost(900)
                .addLife(1700)
                .addImage("src/images/characters/healer_1.png")
                .addImage("src/images/characters/healer_2.pnh")
                .addLevelRequired(1)
                .addUsedWeapon(WeaponFactory.getPrototype("punch"))
                .addUsedWeapon(WeaponFactory.getPrototype("heal"))
                .build();
        
        Character lebron = new Character.CharacterBuilder()
                .addName("lebron")
                .addSpace(1)
                .addLevel(1)
                .addCost(30)
                .addLife(20)
                .addImage("src/images/characters/lebron.png")
                .addLevelRequired(1)
                .addUsedWeapon(WeaponFactory.getPrototype("punch"))
                .addUsedWeapon(WeaponFactory.getPrototype("basketball"))
                .build();
        
        Character link = new Character.CharacterBuilder()
                .addName("link")
                .addSpace(1)
                .addLevel(1)
                .addCost(400)
                .addLife(500)
                .addImage("src/images/characters/link_1.png")
                .addImage("src/images/characters/link_2.png")
                .addImage("src/images/characters/link_3.png")
                .addLevelRequired(1)
                .addUsedWeapon(WeaponFactory.getPrototype("punch"))
                .addUsedWeapon(WeaponFactory.getPrototype("shield"))
                .addUsedWeapon(WeaponFactory.getPrototype("sword"))
                .build();
        
        Character meliodas = new Character.CharacterBuilder()
                .addName("meliodas")
                .addSpace(1)
                .addLevel(1)
                .addCost(1000)
                .addLife(1100)
                .addImage("src/images/characters/meliodas.png")
                .addLevelRequired(1)
                .addUsedWeapon(WeaponFactory.getPrototype("punch"))
                .addUsedWeapon(WeaponFactory.getPrototype("lostvayne"))
                .addUsedWeapon(WeaponFactory.getPrototype("run"))
                .build();
        
        Character messi = new Character.CharacterBuilder()
                .addName("messi")
                .addSpace(1)
                .addLevel(1)
                .addCost(80)
                .addLife(40)
                .addImage("src/images/characters/messi.png")
                .addLevelRequired(1)
                .addUsedWeapon(WeaponFactory.getPrototype("punch"))
                .addUsedWeapon(WeaponFactory.getPrototype("ball"))
                .build();
        
        Character naruto = new Character.CharacterBuilder()
                .addName("naruto")
                .addSpace(1)
                .addLevel(1)
                .addCost(200)
                .addLife(80)
                .addImage("src/images/characters/naruto_1.png")
                .addImage("src/images/characters/naruto_2.png")
                .addImage("src/images/characters/naruto_3.png")
                .addLevelRequired(1)
                .addUsedWeapon(WeaponFactory.getPrototype("punch"))
                .addUsedWeapon(WeaponFactory.getPrototype("rasengan"))
                .addUsedWeapon(WeaponFactory.getPrototype("run"))
                .build();
        
        Character raptor = new Character.CharacterBuilder()
                .addName("raptor")
                .addSpace(1)
                .addLevel(1)
                .addCost(1000)
                .addLife(400)
                .addImage("src/images/characters/raptor.png")
                .addLevelRequired(1)
                .addUsedWeapon(WeaponFactory.getPrototype("punch"))
                .addUsedWeapon(WeaponFactory.getPrototype("assault"))
                .addUsedWeapon(WeaponFactory.getPrototype("grenade"))
                .addUsedWeapon(WeaponFactory.getPrototype("grenadelauncher"))
                .addUsedWeapon(WeaponFactory.getPrototype("raygun"))
                .addUsedWeapon(WeaponFactory.getPrototype("thundergun"))
                .addUsedWeapon(WeaponFactory.getPrototype("gas"))
                .build();
        
        Character scarlett = new Character.CharacterBuilder()
                .addName("scarlett")
                .addSpace(1)
                .addLevel(1)
                .addCost(600)
                .addLife(500)
                .addImage("src/images/characters/scarlett.png")
                .addLevelRequired(1)
                .addUsedWeapon(WeaponFactory.getPrototype("punch"))
                .addUsedWeapon(WeaponFactory.getPrototype("fire"))
                .addUsedWeapon(WeaponFactory.getPrototype("lightning"))
                .build();
        
        Character zelda = new Character.CharacterBuilder()
                .addName("zelda")
                .addSpace(1)
                .addLevel(1)
                .addCost(100)
                .addLife(60)
                .addImage("src/images/characters/zelda.png")
                .addLevelRequired(1)
                .addUsedWeapon(WeaponFactory.getPrototype("punch"))
                .addUsedWeapon(WeaponFactory.getPrototype("freeze"))
                .build();
        
        CharacterFactory.addPrototype("fox"      , fox);
        CharacterFactory.addPrototype("goku"     , goku);
        CharacterFactory.addPrototype("link"     , link);
        CharacterFactory.addPrototype("messi"    , messi);
        CharacterFactory.addPrototype("zelda"    , zelda);
        CharacterFactory.addPrototype("lebron"   , lebron);
        CharacterFactory.addPrototype("raptor"   , raptor);
        CharacterFactory.addPrototype("healer"   , healer);
        CharacterFactory.addPrototype("naruto"   , naruto);
        CharacterFactory.addPrototype("escanor"  , escanor);
        CharacterFactory.addPrototype("meliodas" , meliodas);
        CharacterFactory.addPrototype("scarlett" , scarlett);
        CharacterFactory.addPrototype("amaterasu", amaterasu);
        CharacterFactory.addPrototype("estarossa", estarossa);  
    }
    
}
