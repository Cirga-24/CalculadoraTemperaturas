import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);
        int opc;
        double tempI, tempF;
        boolean estado = true, again = false;
        String reintento;
        while (estado){
            again = false;
            System.out.println("\tMenú de opciones" +
                    "\nDe Celcius a: " +
                    "\n1. F°" +
                    "\n2. K°" +
                    "\n3. Rankine" +
                    "\n4. Réamur" +
                    "\nDe Farenheit a: " +
                    "\n5. C°" +
                    "\n6. K°" +
                    "\n7. Rankine" +
                    "\n8. Réamur" +
                    "\nDe Kelvin a: " +
                    "\n9. C°" +
                    "\n10. F°" +
                    "\n11. Rankine" +
                    "\n12. Réamur" +
                    "\nDe Rankine a:" +
                    "\n13. C°" +
                    "\n14. F°" +
                    "\n15. K°" +
                    "\n16. Cerrar el programa" +
                    "\nIngrese una de las opciones de la lista anterior.");
            opc = teclado.nextInt();
                switch (opc) {
                    case 1 -> {
                        System.out.println("Ingrese la temperatura a convertir: ");
                        tempI = teclado.nextDouble();
                        if (tempI > 0) {
                            tempF = (tempI * 9 / 5) + 32;
                            System.out.println("La temperatura resultante es: " + tempF + "F°");
                            while (!again) {
                                System.out.println("Desea hacer otra conversion? 1. Si 2. No");
                                reintento = teclado.next().toLowerCase();
                                if (reintento.equals("1") || reintento.equals("s")) {
                                    again = true;
                                } else if (reintento.equals("2") || reintento.equals("n")) {
                                    again = true;
                                    estado = false;
                                } else {
                                    System.out.println("Esa no es una opcion.");
                                    again = false;
                                }
                            }
                        } else {
                            System.out.println("Ingrese una temperatura positiva");
                        }
                    }
                    case 2 -> {
                        System.out.println("Ingrese la temperatura a convertir: ");
                        tempI = teclado.nextDouble();
                        if (tempI < 0){
                        tempF = (tempI + 273.15);
                        System.out.println("La temperatura resultante es: " + tempF + "K°");
                        while (!again) {
                            System.out.println("Desea hacer otra conversion? 1. Si 2. No");
                            reintento = teclado.nextLine().toLowerCase();
                            if (reintento.equals("1") || reintento.equals("s")) {
                                again = true;
                            } else if (reintento.equals("2") || reintento.equals("n")) {
                                again = true;
                                estado = false;
                            } else {
                                System.out.println("Esa no es una opcion.");
                                again = false;
                            }
                        }}else {
                            System.out.println("Ingrese una temperatura positiva");
                        }
                    }
                    case 3 -> {
                        System.out.println("Ingrese la temperatura a convertir: ");
                        tempI = teclado.nextDouble();
                        if (tempI < 0){
                        tempF = (tempI + 273.15) * 9 / 5;
                        System.out.println("La temperatura resultante es: " + tempF + "R°");
                        while (!again) {
                            System.out.println("Desea hacer otra conversion? 1. Si 2. No");
                            reintento = teclado.nextLine().toLowerCase();
                            if (reintento.equals("1") || reintento.equals("s")) {
                                again = true;
                            } else if (reintento.equals("2") || reintento.equals("n")) {
                                again = true;
                                estado = false;
                            } else {
                                System.out.println("Esa no es una opcion.");
                                again = false;
                            }
                        }}else {
                            System.out.println("Ingrese una temperatura positiva");
                        }
                    }
                    case 4 -> {
                        System.out.println("Ingrese la temperatura a convertir: ");
                        tempI = teclado.nextDouble();
                        if (tempI > 0){
                        tempF = (tempI * 4 / 5);
                        System.out.println("La temperatura resultante es: " + tempF + "Re°");
                        while (!again) {
                            System.out.println("Desea hacer otra conversion? 1. Si 2. No");
                            reintento = teclado.nextLine().toLowerCase();
                            if (reintento.equals("1") || reintento.equals("s")) {
                                again = true;
                            } else if (reintento.equals("2") || reintento.equals("n")) {
                                again = true;
                                estado = false;
                            } else {
                                System.out.println("Esa no es una opcion.");
                                again = false;
                            }
                        }}else {
                            System.out.println("Ingrese una temperatura positiva");
                        }
                    }
                    case 5 -> {
                        System.out.println("Ingrese la temperatura a convertir: ");
                        tempI = teclado.nextDouble();
                        if(tempI > 0){
                        tempF = (tempI - 32) * 5 / 9;
                        System.out.println("La temperatura resultante es: " + tempF + "C°");
                        while (!again) {
                            System.out.println("Desea hacer otra conversion? 1. Si 2. No");
                            reintento = teclado.nextLine().toLowerCase();
                            if (reintento.equals("1") || reintento.equals("s")) {
                                again = true;
                            } else if (reintento.equals("2") || reintento.equals("n")) {
                                again = true;
                                estado = false;
                            } else {
                                System.out.println("Esa no es una opcion.");
                                again = false;
                            }
                        }}else {
                            System.out.println("Ingrese una temperatura positiva");
                        }
                    }
                    case 6 -> {
                        System.out.println("Ingrese la temperatura a convertir: ");
                        tempI = teclado.nextDouble();
                        if(tempI > 0) {
                        tempF = (tempI - 32) * 5 / 9 + 273.15;
                        System.out.println("La temperatura resultante es: " + tempF + "K°");
                        while (!again) {
                            System.out.println("Desea hacer otra conversion? 1. Si 2. No");
                            reintento = teclado.nextLine().toLowerCase();
                            if (reintento.equals("1") || reintento.equals("s")) {
                                again = true;
                            } else if (reintento.equals("2") || reintento.equals("n")) {
                                again = true;
                                estado = false;
                            } else {
                                System.out.println("Esa no es una opcion.");
                                again = false;
                            }
                        }}else {
                            System.out.println("Ingrese una temperatura positiva");
                        }
                    }
                    case 7 -> {
                        System.out.println("Ingrese la temperatura a convertir: ");
                        tempI = teclado.nextDouble();
                        if(tempI > 0) {
                        tempF = (tempI + 459.67);
                        System.out.println("La temperatura resultante es: " + tempF + "R°");
                        while (!again) {
                            System.out.println("Desea hacer otra conversion? 1. Si 2. No");
                            reintento = teclado.nextLine().toLowerCase();
                            if (reintento.equals("1") || reintento.equals("s")) {
                                again = true;
                            } else if (reintento.equals("2") || reintento.equals("n")) {
                                again = true;
                                estado = false;
                            } else {
                                System.out.println("Esa no es una opcion.");
                                again = false;
                            }
                        }}else {
                            System.out.println("Ingrese una temperatura positiva");
                        }
                    }
                    case 8 -> {
                        System.out.println("Ingrese la temperatura a convertir: ");
                        tempI = teclado.nextDouble();
                        if(tempI > 0) {
                        tempF = (tempI - 32) * 4 / 9;
                        System.out.println("La temperatura resultante es: " + tempF + "Re°");
                        while (!again) {
                            System.out.println("Desea hacer otra conversion? 1. Si 2. No");
                            reintento = teclado.nextLine().toLowerCase();
                            if (reintento.equals("1") || reintento.equals("s")) {
                                again = true;
                            } else if (reintento.equals("2") || reintento.equals("n")) {
                                again = true;
                                estado = false;
                            } else {
                                System.out.println("Esa no es una opcion.");
                                again = false;
                            }
                        }}else {
                            System.out.println("Ingrese una temperatura positiva");
                        }
                    }
                    case 9 -> {
                        System.out.println("Ingrese la temperatura a convertir: ");
                        tempI = teclado.nextDouble();
                        if(tempI > 0) {
                        tempF = (tempI - 273.15);
                        System.out.println("La temperatura resultante es: " + tempF + "C°");
                        while (!again) {
                            System.out.println("Desea hacer otra conversion? 1. Si 2. No");
                            reintento = teclado.nextLine().toLowerCase();
                            if (reintento.equals("1") || reintento.equals("s")) {
                                again = true;
                            } else if (reintento.equals("2") || reintento.equals("n")) {
                                again = true;
                                estado = false;
                            } else {
                                System.out.println("Esa no es una opcion.");
                                again = false;
                            }
                        }}else {
                            System.out.println("Ingrese una temperatura positiva");
                        }
                    }
                    case 10 -> {
                        System.out.println("Ingrese la temperatura a convertir: ");
                        tempI = teclado.nextDouble();
                        if(tempI > 0) {
                        tempF = (tempI - 273.15) * 9 / 5 + 32;
                        System.out.println("La temperatura resultante es: " + tempF + "F°");
                        while (!again) {
                            System.out.println("Desea hacer otra conversion? 1. Si 2. No");
                            reintento = teclado.nextLine().toLowerCase();
                            if (reintento.equals("1") || reintento.equals("s")) {
                                again = true;
                            } else if (reintento.equals("2") || reintento.equals("n")) {
                                again = true;
                                estado = false;
                            } else {
                                System.out.println("Esa no es una opcion.");
                                again = false;
                            }
                        }}else {
                            System.out.println("Ingrese una temperatura positiva");
                        }
                    }
                    case 11 -> {
                        System.out.println("Ingrese la temperatura a convertir: ");
                        tempI = teclado.nextDouble();
                        if(tempI > 0) {
                        tempF = (tempI * 9 / 5);
                        System.out.println("La temperatura resultante es: " + tempF + "R°");
                        while (!again) {
                            System.out.println("Desea hacer otra conversion? 1. Si 2. No");
                            reintento = teclado.nextLine().toLowerCase();
                            if (reintento.equals("1") || reintento.equals("s")) {
                                again = true;
                            } else if (reintento.equals("2") || reintento.equals("n")) {
                                again = true;
                                estado = false;
                            } else {
                                System.out.println("Esa no es una opcion.");
                                again = false;
                            }
                        }}else {
                            System.out.println("Ingrese una temperatura positiva");
                        }
                    }
                    case 12 -> {
                        System.out.println("Ingrese la temperatura a convertir: ");
                        tempI = teclado.nextDouble();
                        if(tempI > 0) {
                        tempF = (tempI - 273.15) * 4 / 5;
                        System.out.println("La temperatura resultante es: " + tempF + "Re°");
                        while (!again) {
                            System.out.println("Desea hacer otra conversion? 1. Si 2. No");
                            reintento = teclado.nextLine().toLowerCase();
                            if (reintento.equals("1") || reintento.equals("s")) {
                                again = true;
                            } else if (reintento.equals("2") || reintento.equals("n")) {
                                again = true;
                                estado = false;
                            } else {
                                System.out.println("Esa no es una opcion.");
                                again = false;
                            }
                        }}else {
                            System.out.println("Ingrese una temperatura positiva");
                        }
                    }
                    case 13 -> {
                        System.out.println("Ingrese la temperatura a convertir: ");
                        tempI = teclado.nextDouble();
                        if(tempI > 0) {
                        tempF = (tempI - 491.67) * 5 / 9;
                        System.out.println("La temperatura resultante es: " + tempF + "C°");
                        while (!again) {
                            System.out.println("Desea hacer otra conversion? 1. Si 2. No");
                            reintento = teclado.nextLine().toLowerCase();
                            if (reintento.equals("1") || reintento.equals("s")) {
                                again = true;
                            } else if (reintento.equals("2") || reintento.equals("n")) {
                                again = true;
                                estado = false;
                            } else {
                                System.out.println("Esa no es una opcion.");
                                again = false;
                            }
                        }}else {
                            System.out.println("Ingrese una temperatura positiva");
                        }
                    }
                    case 14 -> {
                        System.out.println("Ingrese la temperatura a convertir: ");
                        tempI = teclado.nextDouble();
                        if(tempI > 0) {
                        tempF = (tempI - 459.67);
                        System.out.println("La temperatura resultante es: " + tempF + "F°");
                        while (!again) {
                            System.out.println("Desea hacer otra conversion? 1. Si 2. No");
                            reintento = teclado.nextLine().toLowerCase();
                            if (reintento.equals("1") || reintento.equals("s")) {
                                again = true;
                            } else if (reintento.equals("2") || reintento.equals("n")) {
                                again = true;
                                estado = false;
                            } else {
                                System.out.println("Esa no es una opcion.");
                                again = false;
                            }
                        }}else {
                            System.out.println("Ingrese una temperatura positiva");
                        }
                    }
                    case 15 -> {
                        System.out.println("Ingrese la temperatura a convertir: ");
                        tempI = teclado.nextDouble();
                        if(tempI > 0) {
                        tempF = (tempI * 5 / 9);
                        System.out.println("La temperatura resultante es: " + tempF + "K°");
                        while (!again) {
                            System.out.println("Desea hacer otra conversion? 1. Si 2. No");
                            reintento = teclado.nextLine().toLowerCase();
                            if (reintento.equals("1") || reintento.equals("s")) {
                                again = true;
                            } else if (reintento.equals("2") || reintento.equals("n")) {
                                again = true;
                                estado = false;
                            } else {
                                System.out.println("Esa no es una opcion.");
                                again = false;
                            }
                        }}else {
                            System.out.println("Ingrese una temperatura positiva");
                        }
                    }
                    case 16 -> {
                        estado = false;
                    }
                    default -> {
                        System.out.println("Esa no es una opción.");
                    }
                }
        }
    }
}