package Boletines;

public class Boletin6 {
    public static void main(String[] args) {
        //1. Crea un algoritmo que imprima por pantalla la tabla de la verdad (truth table) de la operación
        //lógica NOT. Para ello, utiliza las siguientes instrucciones (cuidado con las comillas, puede que
        //se copien mal):
        System.out.println("Tabla de la operacion lógica NOT");
        System.out.println("******************************************");
        System.out.println("      * A           |           !A *       ");
        System.out.println("**Valor de entrada******Valor de salida**");
        System.out.println("      " + true +"          |         " + !true + "         ");
        System.out.println("      " + false + "         |         " + !false + "         ");
        System.out.println("******************************************");

        //Si fuese necesario, modifique la cantidad de espacios en blanco o caracteres para que la tabla se
        //vea de la mejor forma posible.
        //2. Repita el ejercicio anterior para la operación lógica AND.
        System.out.println("Tabla de la operacion lógica AND");
        System.out.println("******************************************");
        System.out.println("      * A            &&          B *       ");
        System.out.println("**Valor de entrada******Valor de salida**");
        System.out.println("  false && false      |       " + (false&&false) + "  ");
        System.out.println("  false && true       |       " + (false&&true) + "  ");
        System.out.println("  true && false       |       " + (true&&false) + "  ");
        System.out.println("  true && true        |       " + (true&&true) + "  ");
        System.out.println("******************************************");

        //3. Repita el ejercicio anterior para la operación lógica OR.
        System.out.println("Tabla de la operacion lógica OR");
        System.out.println("******************************************");
        System.out.println("      * A            ||          B *       ");
        System.out.println("**Valor de entrada******Valor de salida**");
        System.out.println(" false || false      |       " + (false||false) + "  ");
        System.out.println(" false || true       |       " + (false||true) + "  ");
        System.out.println("  true || false      |       " + (true||false) + "  ");
        System.out.println("  true || true       |       " + (true||true) + "  ");
        System.out.println("******************************************");

        //4. Evalúe mentalmente las siguientes operaciones Booleanas y compruebe posteriormente en
        //Java su resultado, almacenándolas en una variable booleana e imprimiéndolas por pantalla.
        //a. NO CIERTO Y NO VERDADERO
        boolean op1 = !true && !true;
        System.out.println("Operación 1 (!true && !true): " + op1);

        //b. NO FALSO Y NO VERDADERO
        boolean op2 = !false && !true;
        System.out.println("Operación 2 (!false && !true): " + op2);

        //c. VERDADERO Y NO VERDADERO O NO FALSO
        boolean op3 = true && !true || !false;
        System.out.println("Operación 3 (true && !true || !false): " + op3);

        //d. VERDADERO Y (NO VERDADERO O NO FALSO)
        boolean op4 = true && (!true && !false);
        System.out.println("Operación 4 (true && (!true && !false)): " + op4);

        //e. VERDADERO Y (NO VERDADERO O FALSO)
        boolean op5 = true && (!true || false);
        System.out.println("Operación 5 (true && (!true || false)): " + op1);

        //f. FALSO O FALSO O NO FALSO
        boolean op6 = false || false && !false;
        System.out.println("Operación 6 (false || false && !false): " + op6);

        //g. NO (FALSO O FALSO O NO FALSO)
        boolean op7 = !(false || false && !false);
        System.out.println("Operación 7 (!(false || false && !false)): " + op7);

        //h. NO(FALSO Y FALSO)Y(NO FALSO Y NO FALSO) Y NO NO VERDADERO
        boolean op8 = !(false && false) && (!false && !false) & !!true;
        System.out.println("Operación 8 (!(false && false) && (!false && !false) & !!true): " + op8);

        //i. NO NO NO NO NO NO NO NO FALSO
        boolean op9 = !!!!!!!!false;
        System.out.println("Operación 9 (!!!!!!!!false): " + op9);

        //j. FALSO O NO NO FALSO O VERDADERO Y FALSO
        boolean op10 = false || !!false || true && false;
        System.out.println("Operación 10 (false || !!false || true && false): " + op10);

        //5. En base a los resultados anteriores, ¿cuál es la precedencia de los operadores lógicos? Si aún
        //no está clara, ponga un ejemplo que no utilice paréntesis para saber cuál de las tres operaciones
        //se ejecuta con preferencia sobre las demás.
        System.out.println("La preferencia de los operadores usados anteriormente la tiene el operador NOT, luego el AND y por último el OR");

        //6. Cree un programa que compruebe si un número es mayor que 100, e imprima por pantalla
        //verdadero o falso.
        int numero = 103;
        System.out.println("El número es: " + numero);
        System.out.println(numero>100);

        //7. Modifique el ejercicio anterior para que compruebe si es mayor que 100 y menor que 200.
        System.out.println("El numero es mayor que 100 y menor que 200?" + (numero>100 && numero<200));

        //8. Cree un programa que reciba una nota con decimales, e imprima por pantalla si el alumno ha aprobado
        float nota = 5.0f;
        System.out.println("La nota es: " + nota);
        System.out.println("El alumno ha aprobado? " + (nota>=5.0f));

        //9. Compruebe si el alumno ha suspendido.
        System.out.println("El alumno ha suspendido? " + !(nota>5.0f));

        //10. Compruebe si el alumno ha sacado matricula (nota superior a 10).
        System.out.println("El alumno ha sacado matricula? " + (nota>10.0f));

        //11. Cree un programa que reciba un número entero y compruebe si es par.
        int x = 3;
        System.out.println("El número es: " + x);
        boolean esPar = x%2 == 0;
        System.out.println("¿Es par? " + esPar);

        //12. Compruebe si es impar.
        System.out.println("¿Es impar? " + !esPar);

        //13. Compruebe si es múltiplo de 10.
        System.out.println("Es múltiplo de 10? " + (x%10==0));

        //14. Compruebe si es divisible por 31.
        System.out.println("Es divisible entre 31? " + (x%31==0));

        //15. Cree un programa que reciba un número con decimales (salario) y un número entero entre 0 y
        //100 (porcentaje), e imprima por pantalla el nuevo salario resultante de aplicar la subida de salario
        //correspondiente.
        float salario = 1500.87f;
        System.out.println("El salario inicial es: " + salario);
        float porcentaje = 20;
        float subida = 1+porcentaje/100;
        System.out.println("El salario de subida es: " + (salario*subida));

        //16. Repita pero aplicando una bajada de salario.
        float bajada = 1-subida/100;
        System.out.println("El salario de bajada es: " + (salario*bajada));

        //17. Busque por internet información sobre que condiciones lógicas debe cumplir un año para ser
        //bisiesto. Cuando las encuentre, cree un programa que almacene un año en una variable entera, y
        //luego cree un booleano que almacene el resultado de esa condición lógica sobre la variable
        //entera. Imprima por pantalla el resultado.
        //Si lo desea, use la siguiente referencia:
        //https://docs.microsoft.com/es-es/office/troubleshoot/excel/determine-a-leap-year
        int anyo = 1960;
        System.out.println("El anyo " + anyo + "es bisiesto? " + (anyo%100==0 && anyo%400==0));
    }
}
