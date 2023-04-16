public class GenericsPractise <G> {
    private G val;

    public GenericsPractise (G val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "[" + val + "]";
    }

    public void setVal(G val) {
        this.val = val;
    }
}
