package Boletines;

import java.util.Scanner;

public class Bucles1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Lee el código de los bucles y, antes de ejecutarlos, piensa cuántas veces se ejecuta el
        //cuerpo de los mismos, anotándolo en un papel. Después, ejecuta el código y
        //comprueba si el número de iteraciones coincide con las que has pensado.
        System.out.println("\nEJERCICIO 1");
        System.out.println("*****************************");
        System.out.println("10 iteraciones");
        int cont1A = 0;
        int var=0;
        while(var < 10) {
            System.out.println(var);
            var++;
            cont1A++;
        }
        System.out.println("Iteraciones reales: "+cont1A);

        //
        System.out.println("*****************************");
        System.out.println("21 iteraciones");
        int cont2A = 0;
        for(int i=20; i >= 0; i--) {
            System.out.println(i);
            cont2A++;
        }
        System.out.println("Iteraciones reales: "+cont2A);

        //
        System.out.println("*****************************");
        System.out.println("17 iteraciones");
        int cont3A = 0;
        int num1=15;
        for(int i=0;i<17;i++) {
            System.out.println(num1);
            cont3A++;
        }
        System.out.println("Iteraciones reales: "+cont3A);

        //
        System.out.println("*****************************");
        System.out.println("31 iteraciones");
        int var1=30;
        int cont4A = 0;
        while(var1>=0) {
            System.out.println(var1);
            var1--;
            cont4A++;
        }
        System.out.println("Iteraciones reales: "+cont4A);

        //
        System.out.println("*****************************");
        System.out.println("5 iteraciones");
        int cont5A = 0;
        for(int i=0; i<10; i+=2) {
            System.out.println(i);
            cont5A++;
        }
        System.out.println("Iteraciones reales: "+cont5A);

        //
        System.out.println("*****************************");
        System.out.println("71 iteraciones");
        int cont6A = 0;
        int var2=70;
        while(var2>=0){
            var2--;
            System.out.println(var2);
            cont6A++;
        }
        System.out.println("Iteraciones reales: "+cont6A);

        //
        System.out.println("*****************************");
        System.out.println("4 iteraciones");
        int cont7 = 0;
        for(int i=0; i<10;i+=2) {
            System.out.println(i);
            i++;
            cont7++;
        }
        System.out.println("Iteraciones reales: "+cont7);

        //

        //2. Traduce cada bucle for a su correspondiente while, y cada while a su for.
        System.out.println("\nEJERCICIO 2");
        System.out.println("*****************************");
        System.out.println("10 iteraciones");
        int cont1 = 0;
        for (int var3=0; var3<10; var3++, cont1++) {
            System.out.println(var3);
            var3++;
            cont1++;
        }
        System.out.println("Iteraciones reales: "+ cont1);

        //
        System.out.println("*****************************");
        System.out.println("17 iteraciones");
        int cont3 = 0;
        int num2=15;
        for(int i=0;i<17;i++) {
            System.out.println(num2);
            cont3++;
        }
        System.out.println("Iteraciones reales: "+cont3);

        //
        System.out.println("*****************************");
        System.out.println("21 iteraciones");
        int cont2 = 0;
        int i=20;
        while (i >= 0){
            System.out.println(i);
            i--;
            cont2++;
        }
        System.out.println("Iteraciones reales: "+cont2);

        //
        System.out.println("*****************************");
        System.out.println("31 iteraciones");

        int cont4 = 0;
        for(int var4=30; var4>=0; var4--, cont4++) {
            System.out.println(var4);
        }
        System.out.println("Iteraciones reales: "+cont4);

        //
        System.out.println("*****************************");
        System.out.println("5 iteraciones");
        int cont5 = 0;
        int b=0;
        while(b<10) {
            System.out.println(cont5);
            b+=2;
            cont5++;
        }
        System.out.println("Iteraciones reales: "+cont5);

        //
        System.out.println("*****************************");
        System.out.println("71 iteraciones");
        int cont6 = 0;
        for(int c=70; c>=0; c--, cont6++) {
            System.out.println(c);
        }
        System.out.println("Iteraciones reales: "+cont6);

        //
        System.out.println("*****************************");
        System.out.println("4 iteraciones");
        int cont8 = 0;
        int j=0;
        while(j<10) {
            System.out.println(j);
            j+=2;
            j++;
            cont8++;
        }
        System.out.println("Iteraciones reales: "+cont8);
        System.out.println("*****************************");
        //

        //3. Modifica el código para que cada bucle cuente las iteraciones y, una vez haya
        //terminado cada bucle, se imprima el número de iteraciones.
        System.out.println("\nEJERCICIO 3 YA REALIZADO EN EL CÓDIGO DE LOS EJERCICIOS");
        //4. Crea un programa que lea un número, e imprima en una misma línea tantos ceros
        //como diga el número. Por ejemplo: si se lee el 3 debe imprimirse:
        //0 0 0
        System.out.println("\nEJERCICIO 4");
        System.out.print("Indica en numero de ceros que desee: ");
        int veces1 = sc.nextInt();
        while (veces1>0) {
            System.out.print("0 ");
            veces1--;
        }

        //5. Modifica el ejercicio 4 para que la primera columna siempre imprima un 1. Por
        //ejemplo, si se lee el 3 debe imprimirse:
        //1 0 0
        System.out.println("\nEJERCICIO 5");
        System.out.print("Indica en numero de columnas que desee: ");
        int veces2 = sc.nextInt();
        int col1 = veces2;
        while (veces2>0) {
            if (veces2==col1){
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
            veces2--;
        }

        //6. Modifica el ejercicio 4 para que la última columna siempre imprima un 1. Por ejemplo,
        //si se lee el 3 debe imprimirse:
        //0 0 1
        System.out.println("\nEJERCICIO 6");
        System.out.print("Indica en numero de columnas que desee (parte 2): ");
        int veces3 = sc.nextInt();
        while (veces3>0) {
            if (veces3==1){
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
            veces3--;
        }

        //7. Modifica el ejercicio 4 para que la columna central (o la más cercana en caso de no
        //haber central) siempre imprima un 1. Por ejemplo, si se lee el 3 debe imprimirse:
        //0 1 0
        System.out.println("\nEJERCICIO 7");
        System.out.print("Indica en numero de columnas que desee (parte 3): ");
        int veces4 = sc.nextInt();
        int col2 = veces4;
        while (veces4>0) {
            if ((veces4-1)==col2/2){
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
            veces4--;
        }

        //8. Crea un programa que lea un número, y repita el ejercicio 4 tantas veces como diga
        //ese número. Por ejemplo: si se lee el 3 debe imprimirse:
        //0 0 0
        //0 0 0
        //0 0 0
        //
        //int rep = sc.nextInt();
        System.out.println("\nEJERCICIO 8");
        System.out.print("Indica el numero de columnas que desee: ");
        int veces5 = sc.nextInt();
        int repetidor1 = veces5;
        System.out.print("Indica el numero de filas que desee: ");
        for(int rep = sc.nextInt(); rep>0; rep--) {
            while (veces5>0) {
                System.out.print("0 ");
                veces5--;
            }
            System.out.println();
            veces5=repetidor1;
        }

        //9. Modifica el ejercicio 8 para que la primera línea siempre imprima unos. Por ejemplo, si
        //se lee el 3 debe imprimirse:
        //1 1 1
        //0 0 0
        //0 0 0
        System.out.println("\nEJERCICIO 9");
        System.out.print("Indica el numero de columnas que desee: ");
        int veces6 = sc.nextInt();
        int repetidor2 = veces6;
        System.out.print("Indica el numero de filas que desee: ");
        for(int rep = sc.nextInt(), reset=rep; rep>0; rep--) {
            while (veces6>0) {
                if (reset==rep) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                veces6--;
            }
            System.out.println();
            veces6=repetidor2;
        }

        //10. Modifica el ejercicio 8 para que la primera columna siempre imprima unos. Por
        //ejemplo, si se lee el 3 debe imprimirse:
        //1 0 0
        //1 0 0
        //1 0 0
        System.out.println("\nEJERCICIO 10");
        System.out.print("Indica el numero de columnas que desee: ");
        int veces7 = sc.nextInt();
        int repetidor3 = veces7;
        System.out.print("Indica el numero de filas que desee: ");
        for(int rep = sc.nextInt(); rep>0; rep--) {
            while (veces7>0) {
                if (veces7==repetidor3){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                veces7--;
            }
            System.out.println();
            veces7=repetidor3;
        }

        //11. Modifica el ejercicio 8 para que la última línea siempre imprima unos. Por ejemplo, si
        //se lee el 3 debe imprimirse:
        //0 0 0
        //0 0 0
        //1 1 1
        System.out.println("\nEJERCICIO 11");
        System.out.print("Indica el numero de columnas que desee: ");
        int veces8 = sc.nextInt();
        int repetidor4 = veces8;
        System.out.print("Indica el numero de filas que desee: ");
        for(int rep = sc.nextInt(); rep>0; rep--) {
            while (veces8>0) {
                if (rep==1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                veces8--;
            }
            System.out.println();
            veces8=repetidor4;
        }
        //12. Modifica el ejercicio 8 para que la última columna siempre imprima unos. Por ejemplo,
        //si se lee el 3 debe imprimirse:
        //0 0 1
        //0 0 1
        //0 0 1
        System.out.println("\nEJERCICIO 12");
        System.out.print("Indica el numero de columnas que desee: ");
        int veces9 = sc.nextInt();
        int repetidor5 = veces9;
        System.out.print("Indica el numero de filas que desee: ");
        for(int rep = sc.nextInt(); rep>0; rep--) {
            while (veces9>0) {
                if (veces9==1){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                veces9--;
            }
            System.out.println();
            veces9=repetidor5;
        }

        //13. Modifica el ejercicio 8 para que la primera fila y columna siempre imprima unos. Por
        //ejemplo, si se lee el 3 debe imprimirse:
        //1 1 1
        //1 0 0
        //1 0 0
        System.out.println("\nEJERCICIO 13");
        System.out.print("Indique el numero de columnas que desee: ");
        int veces10 = sc.nextInt();
        int repetidor6 = veces10;
        System.out.print("Indique el numero de filas que desee: ");
        for(int rep = sc.nextInt(), reset=rep; rep>0; rep--) {
            while (veces10>0) {
                if (reset==rep) {
                    System.out.print("1 ");
                } else if (veces10==repetidor6){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                veces10--;
            }
            System.out.println();
            veces10=repetidor6;
        }

        //14. Modifica el ejercicio 8 para que la diagonal siempre imprima unos. Por ejemplo, si se
        //lee el 3 debe imprimirse:
        //0 0 1
        //0 0 1
        //1 1 1
        System.out.println("\nEJERCICIO 14");
        System.out.print("Indique el numero de columnas que desee: ");
        int veces11 = sc.nextInt();
        int repetidor7 = veces11;
        System.out.print("Indique el numero de filas que desee: ");
        for(int rep = sc.nextInt(); rep>0; rep--) {
            while (veces11>0) {
                if (rep==1) {
                    System.out.print("1 ");
                } else if (veces11==1){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                veces11--;
            }
            System.out.println();
            veces11=repetidor7;
        }

        //15. Modifica el ejercicio 8 para que el marco siempre imprima unos. Por ejemplo, si se lee
        //el 3 debe imprimirse:
        //1 1 1
        //1 0 1
        //1 1 1
        System.out.println("\nEJERCICIO 15");
        System.out.print("Indique el numero de columnas que desee: ");
        int veces12 = sc.nextInt();
        int repetidor8 = veces12;
        System.out.print("Indique el numero de filas que desee: ");
        for(int rep = sc.nextInt(); rep>0; rep--) {
            while (veces12>0) {
                if (rep == 1 || veces12 == 1 || veces12 == repetidor8 || rep==repetidor8) {
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
                veces12--;
            }
            System.out.println();
            veces12=repetidor8;
        }

        //16. Modifica el ejercicio 8 para que la diagonal principal siempre imprima unos. Por
        //ejemplo, si se lee el 3 debe imprimirse:
        //1 0 0
        //0 1 0
        //0 0 1
        System.out.println("\nEJERCICIO 16");
        System.out.print("Indica en numero de filas que desee: ");
        int veces13 = sc.nextInt();
        int repetidor9 = veces13;
        int fila = 0;
        int col = 0;
        System.out.print("Indica en numero de columnas que desee: ");
        for(int rep = sc.nextInt(); rep>0; rep--) {
            while (veces13>0) {
                if (fila==col) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                veces13--;
                col++;
            }
            fila++;
            col = 0;
            System.out.println();
            veces13=repetidor9;
        }

        //17. Leer dos enteros e imprimir una tabla o matriz de tantas filas y columnas como los
        //números leídos. La tabla o matriz solo debe contener ceros. Por ejemplo si se leen el 2 y 4, se imprimiría:
        //0 0 0 0
        //0 0 0 0
        System.out.println("\nEJERCICIO 17");
        System.out.print("Indica en numero de columnas que desee: ");
        int veces14 = sc.nextInt();
        int repetidor10 = veces14;
        System.out.print("Numero de filas que desee: ");
        for(int rep = sc.nextInt(); rep>0; rep--) {
            while (veces14 > 0) {
                System.out.print("0 ");
                veces14--;
            }
            System.out.println();
            veces14 = repetidor10;
        }

        //18. Modificar el ejercicio anterior para que contenga la sucesión 1,2,3,4,…, etc, con tantos
        //términos como posiciones tenga la tabla o matriz. Para el caso del ejercicio anterior, se
        //imprimiría:
        //1 2 3 4
        //5 6 7 8
        System.out.println("\nEJERCICIO 18");
        System.out.print("Indica en numero de columnas que desee: ");
        int veces15 = sc.nextInt();
        int repetidor11 = veces15;
        System.out.print("Numero de filas que desee: ");
        for(int rep = sc.nextInt(), num=1; rep>0; rep--) {
            while (veces15>0) {
                System.out.print(num + " ");
                num++;
                veces15--;
            }
            System.out.println();
            veces15=repetidor11;
        }

        //19. Crea un programa que lea un número e imprima dicho número por pantalla siete
        //veces. Por ejemplo, si se lee el 6, debe imprimirse:
        //6
        //6
        //6
        //6
        //6
        //6
        //6
        System.out.println("\nEJERCICIO 19");
        System.out.print("Escriba un numero: ");
        for (int num3 = sc.nextInt(), cont = 0; cont<7; cont++){
            System.out.println(num3);
        }

        //20. Modifica el programa para que el número se imprima tantas veces como diga el propio
        //número. Por ejemplo si se lee el 4, debe imprimirse:
        //4
        //4
        //4
        //4
        System.out.println("\nEJERCICIO 20");
        System.out.print("Escriba un numero: ");
        for (int num = sc.nextInt(), cont = 0; cont<num; cont++){
            System.out.println(num);
        }

        //21. Modifica el ejercicio anterior, para que además del número se lea un carácter, y se
        //imprima dicho carácter tantas veces como diga el número. Por ejemplo, si se lee 3 y
        //‘A’, debe imprimirse:
        //A
        //A
        //A
        System.out.println("\nEJERCICIO 21");
        System.out.print("Escriba un numero: ");
        int num = sc.nextInt();
        System.out.print("Escriba una letra: ");
        String letra = sc.next();
        for (int cont = 0; cont<num; cont++) {
            System.out.println(letra);
        }

        //22. Crea un programa que lea un número, e imprima por pantalla los primeros números
        //positivos. Por ejemplo, si se lee el 5 debe imprimirse:
        //1
        //2
        //3
        //4
        //5
        System.out.println("\nEJERCICIO 22");
        System.out.print("Escriba un numero: ");
        for (int num4 = sc.nextInt(), cont = 0; cont<num4; cont++){
            System.out.println(cont+1);
        }

        //23. Modifica el ejercicio anterior para que se imprima todo en la misma línea.
        System.out.println("\nEJERCICIO 23");
        System.out.print("Escriba un numero: ");
        for (int num5 = sc.nextInt(), cont = 0; cont<num5; cont++){
            System.out.print(cont+1 + " ");
        }


        //24. Crea un programa que lea un número, e imprima por pantalla los primeros números
        //pares. Por ejemplo, si se lee el 5 debe imprimirse:
        //2
        //4
        //6
        //8
        //10
        System.out.println("\nEJERCICIO 24");
        System.out.print("Escriba un numero: ");
        for (int num6 = sc.nextInt(), cont = 0, veces=0; cont<num6; cont++, veces+=2){
            System.out.println(veces+2);
        }

        //25. Modifica el ejercicio anterior para que imprima los primeros números impares.
        System.out.println("\nEJERCICIO 25");
        System.out.print("Escriba un numero: ");
        for (int num7 = sc.nextInt(), cont = 0, veces=0; cont<num7; cont++, veces+=2){
            System.out.println(veces+1);
        }

        //26. Modifica los dos anteriores para que todo se imprima en la misma línea, pero
        //separando los números por coma en lugar de espacios en blanco.
        System.out.println("\nEJERCICIO 26");
        System.out.print("Escriba un numero: ");
        for (int num8 = sc.nextInt(), cont = 0, veces=0; cont<num8; cont++, veces+=2){
            System.out.print(veces+2 + " ");
        }


        System.out.print("\nEscriba un numero: ");
        for (int num9 = sc.nextInt(), cont = 0, veces=0; cont<num9; cont++, veces+=2){
            System.out.print(veces+1 + " ");
        }

    }
}
