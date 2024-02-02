package br.com.thomaszoord.inventoryapi.Inventory;

import br.com.thomaszoord.inventoryapi.Inventory.sizes.ChestSizes;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class PagesInventory extends JavaPlugin implements Listener {

    protected Plugin plugin;
    protected String name;
    protected int pages;
    protected Inventory[] inventories;
    protected int currentPage;

    public PagesInventory(Plugin plugin, String name, int pages) {
        this.plugin = plugin;
        this.name = name;
        this.pages = pages;
        this.inventories = new Inventory[pages];
        this.currentPage = 0;

        for (int i = 0; i < pages; i++) {
            inventories[i] = Bukkit.createInventory(null, ChestSizes.BIG_GUI.getSize(), name + " - Página " + (i + 1));

        }

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    public void openInventory(Player p, int currentPage) {
        p.openInventory(inventories[currentPage]);
    }

    protected interface ClickFunction {
        void onClick(InventoryClickEvent event);
    }
}