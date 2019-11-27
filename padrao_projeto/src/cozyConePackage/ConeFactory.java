package cozyConePackage;

public class ConeFactory {

    private Cone cone;

    public Cone getCone(ConeTypes type) {

        switch (type) {
            case BALCONY_CONE:
                cone = new DailyBalconyCone();
                break;
            default:
                cone = new DailySimpleCone();
                break;
        }
        return cone;
    }
}