import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;

public class BigRectLister {
    public static void main(String[] args) {

        ArrayList<Rectangle> rectangles = new ArrayList<>();

        Random dimen1 = new Random();
        Random dimen2 = new Random();

        int d1 = dimen1.nextInt(5);
        int d2 = dimen2.nextInt(5);

        BigRectangleFilter filt = new BigRectangleFilter();

        for (int i = 0; i <= 10; i++) {
            Rectangle r = new Rectangle(d1, d2);
            rectangles.add(r);

            d1 = dimen1.nextInt(5);
            d2 = dimen2.nextInt(5);
        }

        for (Rectangle r : rectangles) {
            if (filt.accept(r)) {
                System.out.println("BIG RECTANGLE FOUND: " + r);
            }
        }
    }
}
