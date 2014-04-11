/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eledian.entities;

/**
 *
 * @author James
 */
public abstract class Entity {
    /* Character Constants */
    private int health;
    private int maxHealth;
    private String name;
    private String entityClass;
    private int level;
    
    /* External Constants */
    private int gold;
    private int strength;
    private int dexterity;
    private int intelligence;
    
    /* Empty constructor */
    public Entity() {
        this.maxHealth = 100;
        this.health = this.maxHealth;
        this.name = "default";
        this.gold = 0;
    }
    
    /* Fully intitialized */
    public Entity(int maxHealth, int health, String name, int gold){
        this.maxHealth = maxHealth;
        this.health = health;
        this.name = name;
        this.gold = gold;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the maxHealth
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
     * @param maxHealth the maxHealth to set
     */
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the entityClass
     */
    public String getEntityClass() {
        return entityClass;
    }

    /**
     * @param entityClass the entityClass to set
     */
    public void setEntityClass(String entityClass) {
        this.entityClass = entityClass;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the goldAmount
     */
    public int getGold() {
        return gold;
    }

    /**
     * @param gold the goldAmount to set
     */
    public void setGoldAmount(int gold) {
        this.gold = gold;
    }

    /**
     * @return the strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * @param strength the strength to set
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * @return the dexterity
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * @param dexterity the dexterity to set
     */
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    /**
     * @return the intelligence
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * @param intelligence the intelligence to set
     */
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }        
}
