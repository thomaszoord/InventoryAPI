package br.com.thomaszoord.inventoryapi.Inventory;

import br.com.thomaszoord.inventoryapi.Inventory.sizes.ChestSizes;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class InventoryObject extends JavaPlugin {

    protected Plugin plugin;
    protected String name;
    protected int pages;
    protected ChestSizes size;

    public InventoryObject(Plugin plugin, String name, int pages, ChestSizes size){
        this.plugin = plugin;
        this.name = name;
        this.pages = pages;
        this.size = size;
    }




}
