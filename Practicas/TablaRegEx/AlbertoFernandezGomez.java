package Practicas.TablaRegEx;

public class AlbertoFernandezGomez {
    public static void main(String[] args){
        /*CrucigramaAlbertoFernandez crucigrama1 = new CrucigramaAlbertoFernandez(
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
        }*/
        CrucigramasOpcAlbertoFernandez crucigramaOpc1 = new CrucigramasOpcAlbertoFernandez(
                new String[]{"(PO|R|G|E)*","(Z|OO)[KINZS]+"}, new String[]{"[GRA]P+.*","(X|Y|Z)[KIS\\s]+"},
                new String[]{"[GRAPEZ]+","[^ION\\sS]+","(ZO|OS|OP)"}, new String[]{"[GIN].","[SPIK\\s]*","[^ZYP]+"});
        CrucigramasOpcAlbertoFernandez crucigramaOpc2 = new CrucigramasOpcAlbertoFernandez(
                new String[]{"(N3|TRA|N7)*","[1LOVE2?4]+.", "(A|D)M[5-8&L]+", "[^\\s0ILAD]+", "[B-E]+(.)\1."},
                new String[]{"[^OLD\\s]+","(\\d+)[LA\\s$?]+", "(\\-P|5\\$|AM|Z|L)+", "(\\-D|\\-WE)+[^L4-9N$?]+", "[FED$?]+"},
                new String[]{"[2TAIL\\-D]+","(WE|R4|RY|M)+", "[FEAL3-5S]+","[^FA\sT1-2]+F", "[LO\\s\\?5-8]+"},
                new String[]{"[^ILYO]+",".+[MURDEW]+","[1ALF5$E\\s]+", "[\\dFAN$?]+", ".+\\s.+\\?"});
        CrucigramasOpcAlbertoFernandez[] arrayCrucicramas2 = new CrucigramasOpcAlbertoFernandez[]{crucigramaOpc1,
        crucigramaOpc2};
        for (int i = 0; i < arrayCrucicramas2.length; i++) {
            System.out.println(arrayCrucicramas2[i]);
            arrayCrucicramas2[i].introducirSol();
            System.out.println(arrayCrucicramas2[i]);
            arrayCrucicramas2[i].comprobarSol();
        }
    }
}
