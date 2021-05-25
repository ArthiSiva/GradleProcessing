import processing.core.PApplet;

public class FourBall extends PApplet {
    public static final int WIDTH = 648;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int ballOne=1, ballTwo=1, ballThree=1, ballFour=1;

    public static void main(String[] args) {
        PApplet.main("FourBall", args);
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {

        ellipse(ballOne,HEIGHT/5, DIAMETER, DIAMETER);
        ballOne+=1;
        ellipse(ballTwo,HEIGHT*2/5, DIAMETER, DIAMETER);
        ballTwo+=2;
        ellipse(ballThree,HEIGHT*3/5, DIAMETER, DIAMETER);
        ballThree+=3;
        ellipse(ballFour,HEIGHT*4/5, DIAMETER, DIAMETER);
        ballFour+=4;

    }


}
