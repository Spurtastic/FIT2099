package lect2.code.com;

public class Watch {
    Counter minutes;
    Counter Hours;
    public Watch(){
        Hours = new Counter();
        minutes = new Counter();
    }
    public void tick(){
        minutes.increment();
        if (minutes.getValue() == 60){
            minutes.reset();
            Hours.increment();
            if(Hours.getValue() == 24){
                Hours.reset();
            }
        }
    }

    public void testWatch(int numTicks){
        for( int i = 0; i< numTicks; i++) {
            System.out.println(
                    String.format("%02d",Hours.getValue())
                    + ":"
                    + String.format("02d", minutes.getValue())
            );
            tick();
        }
    }
}
