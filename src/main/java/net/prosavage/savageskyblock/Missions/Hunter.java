package net.prosavage.savageskyblock.Missions;

import net.prosavage.savageskyblock.SavageSkyBlock;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class Hunter {
    private int reward;
    private int current;
    private boolean completed;

    public Hunter() {
        this.reward = 20;
        this.current = 0;
        this.completed = false;
    }

    public ItemStack getItem() {
        ArrayList<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Complete island missions to gain crystals"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7that can be spent on Boosters and Upgrades."));
        lore.add("");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&b&lInformation:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&b&l * &7Objective: &bKill 7,500 Mobs"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&b&l * &7Current Status: &b" + current + "/7500"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&b&l * &7Reward: &b" + reward));
        lore.add("");
        lore.add(ChatColor.translateAlternateColorCodes('&', "&b&l[!] &bComplete this mission for rewards."));
        return SavageSkyBlock.getSkyblock.makeItem(Material.BLAZE_POWDER, 1, 0, "&b&lHunter", lore);
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
