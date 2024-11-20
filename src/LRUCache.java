import java.util.LinkedHashMap;
import java.util.Map;


/*
LRU Cache takes the array of characters stored in a string array which will contain characters ranging from A to Z in some arbitrary order and determine what elements still remain in virtual cache that can hold up to 5 elements with an LRU Cache algorithm implemented in Jawa.

To implement an LRU (Least Recently Used) Cache in Java that takes an array of characters (stored in a string array) and determines which elements remain in a virtual cache that can hold up to 5 elements, you can use the LinkedHashMap with access order enabled.

Here’s how you can do it:

	1.	LinkedHashMap will be used as the underlying data structure because it maintains the insertion order (or access order, when enabled).
	2.	Remove the least recently used element: When the cache size exceeds 5, the oldest entry (least recently used) will be removed.

 */
public class LRUCache {
    private static final int CACHE_SIZE = 5; // Maximum size of cache
    private final LinkedHashMap<Character, Integer> cache;

    public LRUCache() {
        // Initializing LinkedHashMap with accessOrder set to true to maintain access order
        this.cache = new LinkedHashMap<Character, Integer>(CACHE_SIZE, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Character, Integer> eldest) {
                // Remove the oldest entry if the cache size exceeds the limit
                System.out.println(size() > CACHE_SIZE);
                return size() > CACHE_SIZE;
            }
        };
    }

    public void refer(Character c) {
        // Put the character in the cache; this will reorder the cache based on access
        cache.put(c, cache.getOrDefault(c, 0) + 1);
        System.out.println("cache"+cache);
    }

    public void display() {
        // Display elements in cache
        for (Character c : cache.keySet()) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example input array of characters
        String[] input = {"A", "B", "A", "D", "E", "F",
                "G", "B", "A", "E", "C"};

        // Create an LRU Cache
        LRUCache lruCache = new LRUCache();

        // Process each character in the input array
        for (String s : input) {
            lruCache.refer(s.charAt(0));
        }

        // Display the final state of the cache
        System.out.print("Elements remaining in the cache: ");
        lruCache.display();
    }
}

/*
can solve it using queue or Node class having variable as int key,value,Node pre,Node post
 */