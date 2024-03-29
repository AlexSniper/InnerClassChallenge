package alex.leaernprogramming;


import java.util.ArrayList;
import java.util.List;

public class Players implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Players(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon ="Sword";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {// parameters will be saved in array list
        List<String>values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1," "+this.hitPoints);//converting to string
        values.add(2,""+this.strength);//converting to string
        values.add(3,""+this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {//generic list
        if(savedValues!=null && savedValues.size()>0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));//converting to string
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon =savedValues.get(3);
        }

    }
}

