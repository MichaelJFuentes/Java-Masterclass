package NamingingConventions.ChallengeOne;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Savable {
    private String name;
    private int hitPoints;
    private int attackDamage;

    public Monster(String name, int hitPoints, int attackDamage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.attackDamage = attackDamage;
    }

    public Monster() {
        this("default", 0,0);
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

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    @Override
    public List<String> write() {
        ArrayList<String> returnData = new ArrayList<String>();

        returnData.add(this.name);
        returnData.add("" + this.hitPoints);
        returnData.add(String.valueOf(this.attackDamage));

        return returnData;
    }

    @Override
    public void read(List<String> arrayList) {
        if (arrayList.size() > 0 && arrayList != null) {
            this.name = arrayList.get(0);
            this.hitPoints = Integer.parseInt(arrayList.get(1));
            this.attackDamage = Integer.parseInt(arrayList.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", attackDamage=" + attackDamage +
                '}';
    }
}
