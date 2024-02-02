package br.com.thomaszoord.inventoryapi.Inventory;

import br.com.thomaszoord.inventoryapi.Inventory.sizes.ChestSizes;
import br.com.thomaszoord.inventoryapi.Inventory.sizes.ChestType;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.Plugin;

public abstract class InventoryObject implements Listener {

    protected Plugin plugin;
    protected String name;
    protected int pages;
    protected ChestSizes size;
    protected ChestType type;

    public InventoryObject(Plugin plugin, String name, int pages, ChestSizes size, ChestType type){
        this.plugin = plugin;
        this.name = name;
        this.pages = pages;
        this.size = size;
        this.type = type;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    public InventoryObject(Plugin plugin, String name, ChestType type){
        this.plugin = plugin;
        this.name = name;
        this.type = type;

    }


    protected interface ClickFunction {
        void onClick(InventoryClickEvent event);
    }


}
