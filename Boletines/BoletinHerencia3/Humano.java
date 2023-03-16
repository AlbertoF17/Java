package Boletines.BoletinHerencia3;

public class Humano extends Vertebrados{
    //4. Cree clases para los humanos y perros dentro de la jerarquía, teniendo en cuenta que
    //pueden hablar y ladrar respectivamente. Cree una clase para el pulpo, teniendo en
    //cuenta que pueden camuflarse. Pueden crearse instancias de las clases que
    //representan a una especie en concreto (Humano, Perro, Pulpo) pero no de las clases
    //genéricas.
    public void hablar(String frase){
        System.out.println(frase);
    }
}
