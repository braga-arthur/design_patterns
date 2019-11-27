package cozyConePackage;

import java.util.List;

public class SingletonCozyCone {

    private static final SingletonCozyCone cozyCone = new SingletonCozyCone();
    private List<Cone> cones;

    private SingletonCozyCone(){

    }

    public static SingletonCozyCone getInstance() {
        return cozyCone;
    }
}
