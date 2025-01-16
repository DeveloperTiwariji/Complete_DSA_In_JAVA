import java.util.*;

/**
 * Main class to demonstrate the usage of a generic heap with Cars objects
 */
public class GenericHeap {
    public static void main(String[] args) {
        Head<Cars> hp = new Head<>();
        // Adding different car objects to the heap
        hp.add(new Cars(2000, 45, "White")); 
        hp.add(new Cars(5000, 87, "Yellow")); 
        hp.add(new Cars(8000, 367, "Black")); 
        hp.add(new Cars(1000, 98, "Green")); 
        hp.add(new Cars(7000, 524, "Red"));
        hp.Display();
    }
}

/**
 * Generic Heap implementation that can work with any comparable type
 * @param <T> Type parameter that must implement Comparable interface
 */
class Head<T extends Comparable<T>> {
    // ArrayList to store heap elements
    ArrayList<T> h = new ArrayList<>();

    /**
     * Adds a new item to the heap and maintains heap property
     * @param item The element to be added
     */
    public void add(T item) {
        h.add(item);
        Upheapify(h.size()-1);
    }

    /**
     * Maintains heap property by comparing child with parent and swapping if necessary
     * @param ci Index of current child node
     */
    private void Upheapify(int ci) {
        int pi = (ci - 1)/2;  // Calculate parent index
        // Compare current node with parent and swap if needed
        if(islarger(h.get(ci), h.get(pi)) > 0) {
            Swap(pi, ci);
            Upheapify(pi);
        }
    }

    /**
     * Swaps two elements in the heap
     * @param i Index of first element
     * @param j Index of second element
     */
    public void Swap(int i, int j) {
        T ithe = h.get(i);
        T jthe = h.get(j);
        h.set(i, jthe);
        h.set(j, ithe);
    }

    /**
     * Removes and returns the root element of the heap
     * @return The root element
     */
    public T remove() {
        Swap(0, h.size()-1);
        T rv = h.remove(h.size()-1);
        Downheapify(0);
        return rv;
    }

    /**
     * Maintains heap property after root removal by comparing parent with children
     * @param pi Index of parent node
     */
    private void Downheapify(int pi) {
        int Lci = 2 * pi + 1;  // Left child index
        int Rci = 2 * pi + 2;  // Right child index
        int min = pi;

        // Compare with left child
        if(Lci < h.size() && islarger(h.get(Lci), h.get(min)) > 0) {
            min = Lci;
        }

        // Compare with right child
        if(Rci < h.size() && islarger(h.get(Rci), h.get(min)) > 0) {
            min = Rci;
        }

        // If either child is larger, swap and continue downheapify
        if(min != pi) {
            Swap(min, pi);
            Downheapify(min);
        }
    }

    /**
     * Returns the current size of the heap
     * @return Number of elements in heap
     */
    public int size() {
        return h.size();
    }

    /**
     * Returns the root element without removing it
     * @return The root element
     */
    public T min() {
        return h.get(0);
    }

    /**
     * Displays all elements in the heap
     */
    public void Display() {
        System.out.println(h);
    }

    /**
     * Compares two elements using their natural ordering
     * @param o1 First element
     * @param o2 Second element
     * @return Positive if o1 > o2, negative if o1 < o2, 0 if equal
     */
    public int islarger(T o1, T o2) {
        return o1.compareTo(o2);
    }
}

/**
 * Cars class that implements Comparable interface for heap ordering
 */
class Cars implements Comparable<Cars> {
    int speed;
    int price;
    String color;

    /**
     * Constructor to initialize a Car object
     * @param speed Speed of the car
     * @param price Price of the car
     * @param color Color of the car
     */
    public Cars(int speed, int price, String color) {
        this.speed = speed;
        this.price = price;
        this.color = color;
    }

    /**
     * String representation of Car object
     * @return Formatted string with car details
     */
    public String toString() {
        return "P " + this.price + " S " + this.speed + " C " + this.color;
    }

    /**
     * Compares cars based on their price
     * Can be modified to compare based on speed or color
     * @param o Other car to compare with
     * @return Difference in prices
     */
    public int compareTo(Cars o) {
        // return this.speed - o.speed;  // To compare based on speed
        return o.price - this.price;    // Currently comparing based on price
        // return this.color.compareTo(o.color);  // To compare based on color
    }
}