public abstract class Smartphone implements Printable {
    private String name;
    private ColorEnum color;

    public Smartphone(String name, ColorEnum color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public ColorEnum getColor() {
        return color;
    }
}
