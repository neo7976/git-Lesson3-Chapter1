package demo;

public class MyPay {

    private int money;

    public MyPay(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "В моем кошельке " + money + "монет.";
    }
}
