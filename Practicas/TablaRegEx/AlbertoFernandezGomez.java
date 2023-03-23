package Practicas.TablaRegEx;

public class AlbertoFernandezGomez {
    public static void main(String[] args){
        CrucigramaAlbertoFernandez crucigrama1 = new CrucigramaAlbertoFernandez(
                new String[]{"[JUNDT]*","APA|OPI|OLK","(NA|FE|HE)[CV]" },
                new String[]{"[DEF][MNO]*","[^DJNU]P[ABC]","[ICAN]*"});
        System.out.println(crucigrama1);
        crucigrama1.introducirSol();
        System.out.println(crucigrama1);
        crucigrama1.comprobarSol();
    }
}
