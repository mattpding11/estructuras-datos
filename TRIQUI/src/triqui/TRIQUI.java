
package triqui;
import java.util.Scanner;

public class TRIQUI {
public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[][] triqui = new int[3][3];
        int valor = 0;
        int intentosA = 0;
        int a, b, s, d, fin = 0;
        for (int i = 0; i < triqui.length; i++) {
            for (int j = 0; j < triqui.length; j++) {
                if (i < 3) {
                    triqui[i][j] = 0;
                    System.out.print(triqui[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Jugador A = 1");
        System.out.println("Jugador B = 2");
        System.out.println();
        System.out.println("Nota: El juego no recibira cordenadas si esta es mayor a 2...");
        for (int y = 0; y < 5; y++) {
            
            if (valor == 3) {

            } else {
                if (fin == 5 || intentosA == 5) {
                    System.out.println();
                    System.out.print("Lo sentimos tablero lleno...");
                } else {
                    intentosA = intentosA + 1;
                    System.out.println();
                    System.out.println("Jugador A:");
                    System.out.println();
                    do {
                        System.out.print("Ingrese la coordenada a: ");
                        a = num.nextInt();
                    } while (a >= 3);
                     if(a==-1){
                    System.out.println("se reinicio el juego por el jugador a");
                    TRIQUI.main (null); 
                    
                    }
                    do {
                        System.out.print("Ingrese la coordenada b: ");
                        b = num.nextInt();
                    } while (b >= 3);
                     if(b==-1){
                    System.out.println("se reinicio el juego por el jugaro b");
                    TRIQUI.main (null); 
                    
                    }
                    
                
                    System.out.println();
                    for (int i = 0; i < triqui.length; i++) {
                        for (int j = 0; j < triqui.length; j++) {
                            if (i == a && j == b) {
                                triqui[i][j] = 1;
                            }
                        }
                    }
                    for (int i = 0; i < triqui.length; i++) {
                        for (int j = 0; j < triqui.length; j++) {
                            if (i < 3) {
                                System.out.print(triqui[i][j] + " ");
                            }
                        }
                        System.out.println();
                    }
                    for (int w = 0; w < 1; w++) {
                        s = 0;
                        if (triqui[s][w] == 1) {
                            s++;
                            if (triqui[s][w] == 1) {
                                s++;
                                if (triqui[s][w] == 1) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.print("El ganador es el jugador A");
                                    fin = 5;
                                }
                            }
                        }
                    }
                    for (int w = 0; w < 1; w++) {
                        s = 0;
                        if (triqui[w][s] == 1) {
                            s++;
                            if (triqui[w][s] == 1) {
                                s++;
                                if (triqui[w][s] == 1) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.print("El ganador es el jugador A");
                                    fin = 5;
                                }
                            }
                        }
                    }
                    for (int w = 0; w < 3; w++) {
                        s = 0;
                        if (triqui[s][s] == 1) {
                            s++;
                            if (triqui[s][s] == 1) {
                                s++;
                                if (triqui[s][s] == 1) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.print("El ganador es el jugador A");
                                    fin = 5;
                                }
                            }
                        }
                    }
                    for (int w = 0; w < 3; w++) {
                        s = 0;
                        d = 2;
                        if (triqui[s][d] == 1) {
                            s++;
                            d--;
                            if (triqui[s][d] == 1) {
                                s++;
                                d--;
                                if (triqui[s][d] == 1) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.print("El ganador es el jugador A");
                                    fin = 5;
                                }
                            }
                        }
                    }
                }
                if (fin == 5 || intentosA == 5) {
                    System.out.println();
                    System.out.print("Lo sentimos tablero lleno...");
                } else {
                    System.out.println();
                    System.out.println("Jugador B:");
                    System.out.println();
                    do {
                        System.out.print("Ingrese la coordenada a: ");
                        a = num.nextInt();
                    } while (a >= 3);
                    if(a==-1){
                    System.out.println("se reinicio el juego por el jugador a");
                    TRIQUI.main (null); 
                    }
                    do {
                        System.out.print("Ingrese la coordenada b: ");
                        b = num.nextInt();
                    } while (b >= 3);
                    if(b == -1){
                    System.out.println("se reinicio el juego por el jugador a");
                    TRIQUI.main (null);
                    }
                    System.out.println();
                    for (int i = 0; i < triqui.length; i++) {
                        for (int j = 0; j < triqui.length; j++) {
                            if (i == a && j == b) {
                                triqui[i][j] = 2;
                            }
                        }
                    }
                    for (int i = 0; i < triqui.length; i++) {
                        for (int j = 0; j < triqui.length; j++) {
                            if (i < 3) {
                                System.out.print(triqui[i][j] + " ");
                            }
                        }
                        System.out.println();
                    }
                    for (int w = 0; w < 3; w++) {
                        s = 0;
                        if (triqui[s][w] == 2) {
                            s++;
                            if (triqui[s][w] == 2) {
                                s++;
                                if (triqui[s][w] == 2) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.print("El ganador es el jugador B");
                                    fin = 5;
                                }
                            }
                        }
                    }
                    for (int w = 0; w < 3; w++) {
                        s = 0;
                        if (triqui[w][s] == 2) {
                            s++;
                            if (triqui[w][s] == 2) {
                                s++;
                                if (triqui[w][s] == 2) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.print("El ganador es el jugador B");
                                    fin = 5;
                                }
                            }
                        }
                    }
                    for (int w = 0; w < 3; w++) {
                        s = 0;
                        if (triqui[s][s] == 2) {
                            s++;
                            if (triqui[s][s] == 2) {
                                s++;
                                if (triqui[s][s] == 2) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.print("El ganador es el jugador B");
                                    fin = 5;
                                }
                            }
                        }
                    }
                    for (int w = 0; w < 3; w++) {
                        s = 0;
                        d = 2;
                        if (triqui[s][d] == 2) {
                            s++;
                            d--;
                            if (triqui[s][d] == 2) {
                                s++;
                                d--;
                                if (triqui[s][d] == 2) {
                                    valor = 3;
                                    System.out.println();
                                    System.out.print("El ganador es el jugador B");
                                    fin = 5;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.print("GRACIAS POR HABER JUGADO...");
        System.out.println();
        System.out.println();
        TRIQUI.main (null); 
    }
}
