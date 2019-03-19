//comment one
//comment two
//another comment
//two changes
//richard made me do this
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.jpg", 200, 100);
		add(robot);
		GLabel label = new GLabel("Stop", 200, 110);
		GLabel slabel = new GLabel("oj");
		add(slabel);
		add(label);
	}
}