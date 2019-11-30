package cozyConePackage;

public class DailyBalconyCone implements Cone {

    private User user;

    public DailyBalconyCone(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public double getPrice() {
        return 620.00;
    }
}
