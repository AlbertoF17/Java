package Practicas.TablaRegEx;

public class AlbertoFernandezGomez {
    public static void main(String[] args){
        CrucigramaAlbertoFernandez crucigrama1 = new CrucigramaAlbertoFernandez(
                new String[]{"[JUNDT]*","APA|OPI|OLK","(NA|FE|HE)[CV]" },
                new String[]{"[DEF][MNO]*","[^DJNU]P[ABC]","[ICAN]*"});
        CrucigramaAlbertoFernandez crucigrama2 = new CrucigramaAlbertoFernandez(
                new String[]{"UB|IE|AW","[TUBE]*","[BORF]." },
                new String[]{"[NOTAD]*","WEL|BAL|EAR"});
        CrucigramaAlbertoFernandez crucigrama3 = new CrucigramaAlbertoFernandez(
                new String[]{"[BQW](PR|LE)","[RANK]+"},
                new String[]{"[AWE]+","[ALP]+K","(PR|ER|EP)"});
        CrucigramaAlbertoFernandez[] arrayCrucicramas =
                new CrucigramaAlbertoFernandez[]{crucigrama1,crucigrama2,crucigrama3};
        for (int i = 0; i < arrayCrucicramas.length; i++) {
            System.out.println(arrayCrucicramas[i]);
            arrayCrucicramas[i].introducirSol();
            System.out.println(arrayCrucicramas[i]);
            arrayCrucicramas[i].comprobarSol();
        }
    }
}
