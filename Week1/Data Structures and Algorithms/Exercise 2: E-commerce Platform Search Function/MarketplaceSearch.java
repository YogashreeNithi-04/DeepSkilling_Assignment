import java.util.*;

class Item {
    int id;
    String name;
    String category;

    Item(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + name + " <" + category + ">";
    }
}

class SearchEngine {

    
    public static Item searchByNameLinear(Item[] items, String keyword) {
        for (Item item : items) {
            if (item.name.equalsIgnoreCase(keyword)) {
                return item;
            }
        }
        return null;
    }

    
    public static void sortByName(Item[] items) {
        Arrays.sort(items, Comparator.comparing(i -> i.name.toLowerCase()));
    }

    
    public static Item searchByNameBinary(Item[] items, String keyword) {
        int start = 0;
        int end = items.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int cmp = items[mid].name.compareToIgnoreCase(keyword);

            if (cmp == 0) return items[mid];
            if (cmp < 0) start = mid + 1;
            else end = mid - 1;
        }

        return null;
    }
}

public class MarketplaceSearch {
    public static void main(String[] args) {
        Item[] inventory = {
            new Item(201, "Tablet", "Electronics"),
            new Item(202, "Notebook", "Stationery"),
            new Item(203, "Sneakers", "Footwear"),
            new Item(204, "Monitor", "Electronics"),
            new Item(205, "Headphones", "Audio")
        };

        
        System.out.println("SLinear Search:");
        Item foundLinear = SearchEngine.searchByNameLinear(inventory, "Tablet");
        System.out.println(foundLinear != null ? foundLinear : "Item not found using linear search.");

        
        SearchEngine.sortByName(inventory);
        System.out.println("\n Binary Search:");
        Item foundBinary = SearchEngine.searchByNameBinary(inventory, "Tablet");
        System.out.println(foundBinary != null ? foundBinary : "Item not found using binary search.");
    }
}
