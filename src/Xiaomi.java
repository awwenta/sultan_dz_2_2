public class Xiaomi extends Smartphone{

    private boolean miAccount;

    public Xiaomi(String name, ColorEnum color, boolean miAccount) {
        super(name, color);
        this.miAccount = miAccount;
    }

    @Override
    public void print() {
        System.out.println("Xiaomi model: " + getName() +
                "\nColor: " + getColor()+
                "\nDo you have MI Account: " + miAccount);
    }
}
