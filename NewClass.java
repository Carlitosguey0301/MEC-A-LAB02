static void ejercicio2(){
        System.out.println("Seleccionaste el Ejercicio 3.2"+ "\n");
            // Pedir al usuario que escriba una línea de caracteres
            System.out.println("Ingresa una línea de caracteres: ");
            String linea = sc.next();
            System.out.println("");
        
            // Imprimir la línea de caracteres en la consola
            System.out.println("La línea que escribiste es: " + linea);

            // Calcular la cantidad de veces que aparece cada vocal
            int[] vocales = new int[5];

            for (int i = 0; i < linea.length(); i++) {
                char c = linea.charAt(i);
                if (c == 'a' || c == 'A') {
                    vocales[0]++;
                } else if (c == 'e' || c == 'E') {
                    vocales[1]++;
                } else if (c == 'i' || c == 'I') {
                    vocales[2]++;
                } else if (c == 'o' || c == 'O') {
                    vocales[3]++;
                } else if (c == 'u' || c == 'U') {
                    vocales[4]++;
                }
            }

            // Encontrar la vocal que más se repite
            int maxRepeticiones = 0;
            char vocalMasRepetida = ' ';
            for (int i = 0; i < vocales.length; i++) {
                if (vocales[i] > maxRepeticiones) {
                    maxRepeticiones = vocales[i];
                    switch (i) {
                        case 0:
                            vocalMasRepetida = 'a';
                            break;
                        case 1:
                            vocalMasRepetida = 'e';
                            break;
                        case 2:
                            vocalMasRepetida = 'i';
                            break;
                        case 3:
                            vocalMasRepetida = 'o';
                            break;
                        case 4:
                            vocalMasRepetida = 'u';
                            break;
                    }
                }
            }

            // Reemplazar la vocal que más se repite por un guion
            String lineaModificada = linea.replace('a',vocalMasRepetida).replace('e',vocalMasRepetida)
                   .replace('i',vocalMasRepetida).replace('o',vocalMasRepetida).replace('u',vocalMasRepetida);

            // Imprimir la línea modificada en la consola
            System.out.println("La línea modificada es: " + lineaModificada);

            String cadenaInvertida = "";
            for (int x = linea.length() - 1; x >= 0; x--)
                cadenaInvertida = cadenaInvertida + linea.charAt(x);

            System.out.println("La línea invertida es: " + cadenaInvertida);  

    }