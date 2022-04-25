
class Receiver {
    private int id;
    private int balance = 0; // sodu
    private String name;

    public Receiver(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Receiver(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("That amount exceeds your current balance.");
        } else {
            this.balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

}