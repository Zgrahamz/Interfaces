import java.awt.Rectangle;

public class BigRectangleFilter implements Filter {

    /**
     * @param x
     * @return
     */
    @Override
    public boolean accept(Object x) {
        Rectangle r = (Rectangle) x;
        return ((r.getHeight() * 2) + (r.getWidth() * 2)) > 10;
    }
}
