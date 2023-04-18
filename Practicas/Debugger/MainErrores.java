package Practicas.Debugger;

public class MainErrores {
    public static void main(String[] args) {
        //Basico -> https://www.youtube.com/watch?v=lAWnIP1S6UA
        //Avanzado -> https://www.youtube.com/watch?v=AOrnx-9zNBQ
        AlumnoErrores evilEdu = new AlumnoErrores("Edu");
        evilEdu.publicarNota(7);

        try{
            evilEdu.publicarNota(-1);
        }catch (IllegalArgumentException e){
            System.out.println("Nota errónea, no ha sido añadida");
        }

        try{
            evilEdu.publicarNota(11);
        }catch (IllegalArgumentException e){
            System.out.println("Nota errónea, no ha sido añadida");
        }

        evilEdu.publicarNota(9.5f);
        evilEdu.publicarNota(8);
        System.out.println(evilEdu);

        try{
            evilEdu.eliminarNota(-1);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

        evilEdu.eliminarNota(1);
        System.out.println(evilEdu);
        //TODO seguir por aqui
        try{
            evilEdu.editarNota(-1, 10);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        evilEdu.editarNota(1, 11);
        System.out.println(evilEdu);
    }
}
