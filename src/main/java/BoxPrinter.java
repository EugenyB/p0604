public class BoxPrinter<T> {
    private T val;

    public BoxPrinter(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "[" + val + "]";
    }

    public void setVal(T val) {
        this.val = val;
    }
}
