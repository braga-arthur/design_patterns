package cozyConePackage;

public class ConeFactory {

    private Cone cone;

    public Cone getCone(TipoCones type) {

        switch (type) {
            case CONE_VARANDA:
                cone = new ConeVaranda();
                break;
            default:
                cone = new ConeSimples();
                break;
        }
        return cone;
    }
}