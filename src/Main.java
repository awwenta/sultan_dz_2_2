
public class Main {
    public static void main(String[] args) {
        createObject("Iphone");
        createObject("Samsung");
        createObject("Xiaomi");

    }
    public static String createObject(String Smartphone){
        Iphone iphone = new Iphone("X",ColorEnum.BLACK,48);
        Samsung samsung = new Samsung("S21",ColorEnum.GREEN,4);
        Xiaomi xiaomi = new Xiaomi("Poco X3",ColorEnum.RED,true);
        switch (Smartphone){
            case "Iphone":
                iphone.print();
                break;
            case "Samsung" :
                samsung.print();
                break;
            case "Xiaomi":
                xiaomi.print();
                break;
        }
        return Smartphone;
    }
}