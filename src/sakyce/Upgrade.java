/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sakyce;

/**
 *
 * @author y.dupont
 */
public class Upgrade {
    public int cost;
    public int value;
    public String description = "";
    public String name = "";
    public UpgradeType type;
    public Upgrade(int cost, int value, UpgradeType type) {
        this.cost = cost;
        this.value = value;
        this.type = type;
    }
    public Upgrade describe(String name, String desc) {
        this.name = name;
        this.description = desc;
        return this;
    }
}
