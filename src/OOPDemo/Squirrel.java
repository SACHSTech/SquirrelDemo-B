package OOPDemo;

public class Squirrel{
    // instance variables
    String colourString;
    String sizeString;
    int nutCountInt;
    boolean aliveBoolean;
    double iqDouble;


    // constructor
    /**
     * Create an instance of a Squirrel
     * @param newColourString
     * @param newSizeString
     * @param newNutCountInt
     * @param newIQdouble
     */
    public Squirrel(String newColourString, String newSizeString, int newNutCountInt, double newIQdouble){
        this.aliveBoolean = true;
        this.colourString = newColourString;
        this.sizeString = newSizeString;
        this.nutCountInt = newNutCountInt;
        this.iqDouble = newIQdouble;
    }

    // instance methods
    public void run(){
        System.out.println("run!!");
    }

    public void findNut(int numberNuts){
        this.nutCountInt = this.nutCountInt + numberNuts;
    }

    public int getNutCount(){
        return this.nutCountInt;
    }

    public void eatNut(){
        this.nutCountInt--;
    }

    public void climb(){
        System.out.println("Climb that tree!!");
    }

    public void kill(){
       this.aliveBoolean = false;
    }
}