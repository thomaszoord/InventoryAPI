package br.com.thomaszoord.inventoryapi.Inventory;

import br.com.thomaszoord.inventoryapi.Inventory.sizes.ChestSizes;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;

public class GUIInventory implements Listener {

    protected Plugin plugin;
    protected String name;
    protected Inventory inventory;

    protected ChestSizes size;

    public GUIInventory(Plugin plugin, String name, Inventory inventory, ChestSizes size) {
        this.plugin = plugin;
        this.name = name;
        this.inventory = inventory;
        this.size = size;
    }

    protected interface ClickFunction {
        void onClick(InventoryClickEvent event);
    }
}
