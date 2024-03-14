/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sakyce;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author y.dupont
 */
public class CookieClicker {

    private static final CookieClickerFrame cookieClickerFrame = new CookieClickerFrame();
    private static final ShopFrame shopFrame = new ShopFrame();
    public static int score = 0;

    public static ArrayList<Upgrade> shopUpgrades = new ArrayList<>();
    public static HashMap<String, Upgrade> shopUpgradesMap = new HashMap<>();

    public static ArrayList<Upgrade> autoclickers = new ArrayList<>();
    public static ArrayList<Upgrade> multipliers = new ArrayList<>();
    

    public static void clickForMoreScore() {
        score += 1 * multipliers.stream().mapToInt(upgrade -> upgrade.value).sum() + 1;
        cookieClickerFrame.updateScore();
    }

    public static void buyUpgrade(String upgradeName) {
        var upgrade = shopUpgradesMap.get(upgradeName);
        var targetArray = upgrade.type == UpgradeType.Multiplier ? multipliers : autoclickers;
        targetArray.add(upgrade);
        shopUpgrades.remove(upgrade);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        shopUpgrades.add(new Upgrade(15, 1, UpgradeType.Autoclicker).describe("Rat Eric Zemmour", "Un rat qui aime pas trop les draumadaires."));

        shopUpgrades.add(new Upgrade(15, 1, UpgradeType.Multiplier).describe("Cuillère en plastique", "Y a un gars qui s'est échappé de taule avec ça."));
        shopUpgrades.add(new Upgrade(1000, 10, UpgradeType.Multiplier).describe("Kalashnikov", "Référence à CSGO."));

        shopUpgrades.forEach(upgrade -> shopUpgradesMap.put(upgrade.name, upgrade));

        cookieClickerFrame.setVisible(true);
        shopFrame.setVisible(true);
        cookieClickerFrame.updateScore();
        shopFrame.updateShop();
    }

}
