public class Iphone extends Smartphone{

    private int cameraMP;

    public Iphone(String name, ColorEnum color, int cameraMP) {
        super(name, color);
        this.cameraMP = cameraMP;
    }

    @Override
    public void print() {
        System.out.println("Iphone model: " + getName()+
                "\nColor: " + getColor() +
                "\nCamera MP: " + cameraMP +
                "\n-------------------");
    }
}