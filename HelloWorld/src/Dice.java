import java.util.Random;

public class Dice {
    private int faceUp;

    public Dice(){
        roll();
    }
    public void roll(){
        Random r = new Random();
        faceUp = r.nextInt(6)+1;
    }
    public int getFaceUp(){
        return faceUp;
    }

}
