package vya_odev_2;

public class Client {
    private final String name;
    private final int ID;
    public Client(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public int getID() {
        return ID;
    }
}

