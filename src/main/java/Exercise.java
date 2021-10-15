public abstract class Exercise {
    public String name;
    public int numSets;
    public int numRest;
    public String muscleGroup;

    /**
     * Constructor for a User class, takes in all nececcary variables needed to make a User
     *
     * @param name The String name referring to the name of the exercise
     * @param sets The int repressants the number of sets
     * @param rest The int repressants the time taken to rest
     * @param muscle The String repressants the muscle group
     */
    public Exercise(String name, int sets, int rest, String muscle) {
        this.name = name;
        this.numSets = sets;
        this.numRest = rest;
        this.muscleGroup = muscle;
    }

    /**
     * Creates an Exercise object given another.
     * @param other - the other exercise
     */
    public Exercise(Exercise other)
    {
        this.name = other.name;
        this.numSets = other.numSets;
        this.numRest = other.numRest;
        this.muscleGroup = other.muscleGroup;
    }

    /**
     * Creates an Exercise object given the name.
     * @param name - name of the exercise
     */
    public Exercise(String name) {
        this.name = name;
        this.numSets = 0;
        this.numRest = 0;
        this.muscleGroup = "";
    }


    /**
     * returns the name of the exercise
     * @return the string name
     */
    public String getName() {
        return name;
    }

    /**
     * return the number of sets
     * @return the int numSets
     */
    public int getNumSets() {
        return numSets;
    }

    /**
     * return the time taken for rest
     * @return the int numRest
     */

    public int getNumRest() {
        return numRest;
    }

    /**
     * return what the muscle group the user is working on
     * @return the string muscleGroup
     */
    public String getMuscleGroup() {
        return muscleGroup;
    }

    /**
     * We define volume to be the total work done in an exercise. The exact computation of volume highly depends
     * on the type of exercise.
     *
     * @return the total volume generated by this exercise.
     */
    public abstract double getVolume();


}
