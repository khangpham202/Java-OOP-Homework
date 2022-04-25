
public class Sender {
    private int id;
    private int balance = 0; // sodu
    private String name;

    public Sender(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Sender(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) { // gui tien vao tk

        this.balance += amount;
    }

    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

}
