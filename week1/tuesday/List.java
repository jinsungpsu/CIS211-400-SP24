public class List {
    private int listContent;

    public void add (int numbertoAdd) {
        listContent = numbertoAdd;
    }

    @Override
    public String toString() {
        return "List{" +
                "listContent=" + listContent +
                '}';
    }
}
