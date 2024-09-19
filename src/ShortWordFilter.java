public class ShortWordFilter implements Filter {

    /**
     * @param x
     * @return
     */
    @Override
    public boolean accept(Object x) {
        String x1 = (String) x;
        return x1.length() < 5;
    }
}
