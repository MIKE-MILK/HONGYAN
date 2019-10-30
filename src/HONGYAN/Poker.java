package HONGYAN;

public class Poker {
    private String size;
    private String type;

    public Poker(String size, String type) {
        this.type = type;
        this.size = size;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        sb.append(size);
        return sb.toString();
    }
}
