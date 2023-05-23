/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    /*
     * TODO: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */
    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;




    /*
     * TODO: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */

    /**
     * A constructor for the class Bag.
     * This constructor takes in two Strings as arguments.
     *
     * @param color the color of this bag
     * @param capacity the capacity of this bag
     */
    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new String[capacity];
    }



    /*
     * TODO: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */

    /** A getter function for the color of this bag.
     *
     * @return the color of this bag
     */
    public String getColor() {
        return this.color;
    }

    /** A getter function for the number of contents in this bag.
     *
     * @return the number of contents in this bag.
     */
    public int getNumberOfContents() {return this.numberOfContents;}

    /** A getter function for the capacity of this bag.
     *
     * @return the capacity of this bag.
     */
    public int getCapacity() {
        return this.capacity;
    }


    /*
     * TODO: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */

    /** A setter function for the color of this bag.
     *
     * @param color the color which this bag should be set to.
     */
    public void setColor(String color) {
        this.color = color;
    }
    

    /*
     * TODO: Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */

    /** Adds the given item into the bag and returns true
     * if the bag contains less items than its capacity. Otherwise,
     * returns false.
     *
     * @param item the item to be added into the bag.
     */
    public boolean addItem(String item) {
        if (this.numberOfContents < this.capacity) {
            this.contents[this.numberOfContents] = item;
            this.numberOfContents += 1;
            return true;
        } else {
            return false;
        }
    }


    /**
     * TODO: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     * If there are no items in this Bag, return null.
     *
     * @return
     */

    /** Return the last item added to this bag and remove the
     * item from the bag if the bag is not empty. If the bag is
     * empty, return null.
     *
     * @return the last item added to this bag if the bag is not
     * empty, or null otherwise.
     */
    public String popItem() {
        if (this.numberOfContents == 0) {
            return null;
        } else {
            String last_item = this.contents[this.numberOfContents-1];
            this.contents[this.numberOfContents-1] = null;
            this.numberOfContents -= 1;
            return last_item;
        }
    }


    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        // TODO: Implement this method.
        int new_capcity = this.capacity + n;
        String[] new_contents = new String[new_capcity];
        for (int i = 0; i == this.capacity; i++) {
            new_contents[i] = this.contents[i];
        }
        this.capacity = new_capcity;
        this.contents = new_contents;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}