package cozyConePackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SingletonCozyCone {

    private static final int LIMIT_CONES = 20;
    private static SingletonCozyCone cozyCone;
    private List<Cone> cones = new ArrayList<>(LIMIT_CONES);
    private List<Cone> waitList = new ArrayList<>();
    private boolean flagFull = false;

    private SingletonCozyCone(){

    }

    public static SingletonCozyCone getInstance() {
        if(cozyCone == null) {
            return cozyCone = new SingletonCozyCone();
        }
        return cozyCone;
    }

    public boolean isFull(){
        return cones.size() == LIMIT_CONES;
    }

    public void notifyAllWaitList(){
        waitList.stream().forEach(c -> System.out.println());
        System.out.println();
    }

    public void addCone(Cone cone){
        if(isFull()){
            waitList.add(cone);
            return;
        }

        cones.add(cone);
    }

    public boolean isFlagFull() {
        return flagFull;
    }

    public void setFlagFull(boolean flagFull) {
        this.flagFull = flagFull;
    }

    public List<Cone> getWaitList() {
        return waitList;
    }
}
