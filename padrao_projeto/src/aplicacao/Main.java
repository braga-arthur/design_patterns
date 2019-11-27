package aplicacao;

import cozyConePackage.Cone;
import cozyConePackage.ConeFactory;
import cozyConePackage.ConeSimples;
import cozyConePackage.TipoCones;

public class Main {

    public static void main(String[] args) {

        ConeFactory coneFactory = new ConeFactory();

        Cone cone1 = coneFactory.getCone(TipoCones.CONE_SIMPLES);
        Cone cone2 = coneFactory.getCone(TipoCones.CONE_VARANDA);
    }
}
