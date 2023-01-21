
public class Samsung extends Smartphone {


    private int amountCam;

    public Samsung(String name, ColorEnum color, int amountCam) {
        super(name, color);
        this.amountCam = amountCam;
    }

    @Override
    public void print() {
        System.out.println("Samsung model: " + getName() +
                "\nColor: " + getColor() +
                "\nNumber of cameras: " + amountCam +
                "\n---------------------");
    }
}