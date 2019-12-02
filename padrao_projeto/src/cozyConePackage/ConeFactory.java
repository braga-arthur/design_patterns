package cozyConePackage;

import exceptionPackage.InvalidConeInstanceException;

public class ConeFactory {

    private Cone cone;

    public Cone getCone(ConeTypes type, User user) throws InvalidConeInstanceException {

        switch (type) {
            case DAILY_BALCONY_CONE:
                cone = new DailyBalconyCone(user);
                break;
            default:
                cone = new DailySimpleCone(user);
                break;
        }
        return cone;
    }
}