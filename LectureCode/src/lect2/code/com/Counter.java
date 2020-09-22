package lect2.code.com;

public class Counter {
    // other classes cant access this at all
    private int value = 0;

    // methods that changes value
    public void reset(){value = 0;}
    public void decrement(){value--;}
    public void increment(){value++;}
    public int getValue(){return value;}
}
