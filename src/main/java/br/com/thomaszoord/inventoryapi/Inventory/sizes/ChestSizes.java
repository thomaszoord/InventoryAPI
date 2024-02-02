package br.com.thomaszoord.inventoryapi.Inventory.sizes;

public enum ChestSizes {
    BIG_GUI(54), MEDIUM_GUI(27), SMALL_GUI(9);

    final int size;

    ChestSizes(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
