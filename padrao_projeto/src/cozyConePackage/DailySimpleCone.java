package cozyConePackage;

public class DailySimpleCone implements Cone {

    private User user;

    public DailySimpleCone(User user) {
        this.user = user;
    }

    @Override
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public double getPrice() {
        return 480.00;
    }
}
