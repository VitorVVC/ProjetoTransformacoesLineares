package application;

import entities.Vector;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import static entities.TransformacoesLineares.*;
import static entities.TransformacoesLineares.rotation2D;

public class Util {

    public static Scanner sc = new Scanner(System.in);
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("'Date: 'dd/MM/yyyy 'Hour: 'HH:mm");

    public static void printSetado() {
        // Declarando vetor de 2 elementos
        ArrayList<Float> elementos = new ArrayList<>();
        elementos.add(1.0F);
        elementos.add(2.0F);
        Vector vect = new Vector(2, elementos);

        // Declarando vetor de 3 elementos
        ArrayList<Float> elementos3D = new ArrayList<>();
        elementos3D.add(1.0F);
        elementos3D.add(2.0F);
        elementos3D.add(3.0F);
        Vector vect3D = new Vector(3, elementos3D);

        // Criando angulo:
        // double angulo = 45; --> Não declare assim em Java, Java possui funcões como Math.sin || Math.cos && Math.tan .. e tais funcões
        // Esperam o angulo em radianos
        double anguloWithPi = Math.PI / 4; //  Ângulo de rotação em radianos (por exemplo, 45 graus)


        // Print do método translacão
        System.out.println("||||||||||||||||||||||||");
        System.out.println("Métodos para translação: ");
        System.out.println("||||||||||||||||||||||||");

        System.out.println("========================");
        System.out.println("Vetores Originais: ");
        System.out.println("Vetor 2D: " + vect.toString());
        System.out.println("Vetor 3D: " + vect3D.toString());
        System.out.println("========================");
        System.out.println("Vetor 2D Recebendo dx = 2 & dy = 3");
        System.out.println("Vetor 3D Recebendo dx = 2, dy = 3 & dz = 4");
        System.out.println("========================");
        System.out.println("Vetores após translação: ");
        System.out.println("Vetor 2D: " + translate2D(vect, 2, 3).toString());
        System.out.println("Vetor 3D: " + translate3D(vect3D, 2, 3, 4).toString());
        System.out.println("========================");


        // Métodos para rotacão:
        System.out.println("||||||||||||||||||||||||");
        System.out.println("Métodos para rotação: ");
        System.out.println("||||||||||||||||||||||||");
        System.out.println("========================");
        System.out.println("Vetores Originais: ");
        System.out.println("Vetor 2D: " + vect.toString());
        System.out.println("Vetor 3D: " + vect3D.toString());
        System.out.println("========================");
        System.out.println("Rotação em 45 graus em ambos os vetores: ");
        System.out.println("========================");
        System.out.println("Vetor 2D: " + rotation2D(vect, anguloWithPi));
        System.out.println("Vetor 3D(X): " + rotation3DX(vect3D, anguloWithPi));
        System.out.println("Vetor 3D(Y): " + rotation3DY(vect3D, anguloWithPi));
        System.out.println("Vetor 3D(Z): " + rotation3DZ(vect3D, anguloWithPi));
        System.out.println("========================");

        // Métodos para reflexão:
        System.out.println("||||||||||||||||||||||||");
        System.out.println("Métodos para reflexão: ");
        System.out.println("||||||||||||||||||||||||");
        System.out.println("========================");
        System.out.println("Vetores Originais: ");
        System.out.println("Vetor 2D: " + vect.toString());
        System.out.println("Vetor 3D: " + vect3D.toString());
        System.out.println("========================");
        System.out.println("Fazendo a reflexão: ");
        System.out.println("========================");
        System.out.println("Vetor 2D(X): " + reflection2DX(vect));
        System.out.println("Vetor 2D(Y): " + reflection2DY(vect));
        System.out.println("Vetor 3D(X): " + reflection3DX(vect3D));
        System.out.println("Vetor 3D(Y): " + reflection3DY(vect3D));
        System.out.println("Vetor 3D(Z): " + reflection3DZ(vect3D));
        System.out.println("========================");

        // Métodos para projeção:
        System.out.println("||||||||||||||||||||||||");
        System.out.println("Métodos para Projeção: ");
        System.out.println("||||||||||||||||||||||||");
        System.out.println("========================");
        System.out.println("Vetores Originais: ");
        System.out.println("Vetor 2D: " + vect.toString());
        System.out.println("Vetor 3D: " + vect3D.toString());
        System.out.println("========================");
        System.out.println("Fazendo a projeção: ");
        System.out.println("========================");
        System.out.println("Vetor 2D(X): " + projection2DX(vect));
        System.out.println("Vetor 2D(Y): " + projection2DY(vect));
        System.out.println("Vetor 3D(X): " + projection3DX(vect3D));
        System.out.println("Vetor 3D(Y): " + projection3DY(vect3D));
        System.out.println("Vetor 3D(Z): " + projection3DZ(vect3D));
        System.out.println("========================");

        // Cisalhamento
        System.out.println("||||||||||||||||||||||||");
        System.out.println("Métodos para Cisalhamento: ");
        System.out.println("||||||||||||||||||||||||");
        System.out.println("========================");
        System.out.println("Vetores Originais: ");
        System.out.println("Vetor 2D: " + vect.toString());
        System.out.println("Vetor 3D: " + vect3D.toString());
        System.out.println("========================");
        System.out.println("Cisalhamento UM: ");
        System.out.println("Valores: (Vetor2D, kx = 2, ky = 0)");
        System.out.println("========================");
        System.out.println("Resultado: " + shearing(vect, 2, 0));
        System.out.println("========================");
        System.out.println("Cisalhamento DOIS: ");
        System.out.println("Valores: (Vetor2D, kx = 0, ky = 2)");
        System.out.println("========================");
        System.out.println("Resultado: " + shearing(vect, 0, 2));
        System.out.println("========================");
        System.out.println("Cisalhamento TRES: ");
        System.out.println("Valores: (Vetor2D, kx = 2, ky = 2)");
        System.out.println("========================");
        System.out.println("Resultado: " + shearing(vect, 2, 2));
    }

    public static void interacao() {
        System.out.println(dtf.format(LocalDateTime.now()));

        System.out.print("Qual vetor voce deseja manusear primeiramente? Exemplo -> ( 2D || 3D ): ");
        String resp = sc.nextLine();

        if (resp.equalsIgnoreCase("2D")) {
            String manter;
            do {
                System.out.println("Crie um vetor de apenas DUAS dimensões: ");
                System.out.print("Digite o valor de X: ");
                float x = sc.nextFloat();
                System.out.print("Digite o valor de Y: ");
                float y = sc.nextFloat();

                ArrayList<Float> elementos2D = new ArrayList<>();
                elementos2D.add(x);
                elementos2D.add(y);

                Vector vector2D = new Vector(2, elementos2D);
                sc.nextLine();

                System.out.println("Quais métodos voce deseja realizar? ");
                System.out.println("Exemplo: Translação, Rotação, Reflexão, Projeção ou Cisalhamento");
                String metodo = sc.nextLine();

                float dx = 0;
                float dy = 0;
                float angulo = 0;
                String escolha = null;

                switch (metodo.toLowerCase()) {
                    case "translação":
                        System.out.println("Forneça-me os valores de DX & DY");
                        System.out.print("DX: ");
                        dx = sc.nextFloat();
                        System.out.print("DY: ");
                        dy = sc.nextFloat();
                        break;
                    case "rotação":
                        System.out.print("Digite o valor do angulo: ");
                        float ang = sc.nextFloat();
                        angulo = (float) Math.toRadians(ang);
                        break;
                    case "reflexão":
                        System.out.print("Em qual coordenada você deseja operar a reflexão? ( X ou Y ): ");
                        escolha = sc.next();
                        if (!escolha.equalsIgnoreCase("x") && !escolha.equalsIgnoreCase("y")) {
                            throw new InputMismatchException("Opção inválida! Use 'x' ou 'y'.");
                        }
                        if (escolha.equalsIgnoreCase("x")) {
                            System.out.print("Digite o valor de DX: ");
                            dx = sc.nextFloat();
                        } else {
                            System.out.print("Digite o valor de DY: ");
                            dy = sc.nextFloat();
                        }
                        break;
                    case "projeção":
                        System.out.println("Em qual coordenada você deseja operar a projeção? ( X OU Y ): ");
                        escolha = sc.next();
                        if (!escolha.equalsIgnoreCase("x") && !escolha.equalsIgnoreCase("y") && !escolha.equalsIgnoreCase("z")) {
                            throw new InputMismatchException("Opção inválida! Use 'x', 'y' ou 'z'.");
                        }
                        if (escolha.equalsIgnoreCase("x")) {
                            System.out.print("Digite o valor de DX: ");
                            dx = sc.nextFloat();
                        } else {
                            System.out.print("Digite o valor de DY: ");
                            dy = sc.nextFloat();
                        }
                    case "cisalhamento":
                        System.out.println("Em qual coordenada você deseja operar o cisalhamento? ( X, Y ou Ambas ) ");
                        escolha = sc.next();
                        if (!escolha.equalsIgnoreCase("x") && !escolha.equalsIgnoreCase("y") && !escolha.equalsIgnoreCase("ambas")) {
                            throw new InputMismatchException("Opção inválida! Use 'x', 'y' ou 'ambas'.");
                        }
                        if (escolha.equalsIgnoreCase("x")) {
                            System.out.print("Digite o valor de DX: ");
                            dx = sc.nextFloat();
                        } else if (escolha.equalsIgnoreCase("y")) {
                            System.out.print("Digite o valor de DY: ");
                            dy = sc.nextFloat();
                        } else {
                            System.out.print("Digite o valor de DX: ");
                            dx = sc.nextFloat();
                            System.out.print("Digite o valor de DY: ");
                            dy = sc.nextFloat();
                        }
                        break;
                    default:
                        throw new InputMismatchException("Método inválido!");
                }

                realizarOperacao2D(metodo.toLowerCase(), vector2D, dx, dy, angulo, escolha);

                System.out.print("Você deseja realizar mais operações? (Sim ou Não): ");
                manter = sc.next();
            } while (manter.equalsIgnoreCase("sim"));
        } else if (resp.equalsIgnoreCase("3D")) {
            String manter3D = "sim";
            do {
                System.out.println("Crie um vetor de apenas TRÊS dimensões: ");
                System.out.print("Digite o valor de X: ");
                float x = sc.nextFloat();
                System.out.print("Digite o valor de Y: ");
                float y = sc.nextFloat();
                System.out.print("Digite o valor de Z: ");
                float z = sc.nextFloat();

                ArrayList<Float> elementos3D = new ArrayList<>();
                elementos3D.add(x);
                elementos3D.add(y);
                elementos3D.add(z);

                Vector vector3D = new Vector(3, elementos3D);
                sc.nextLine();

                System.out.println("Quais métodos voce deseja realizar? ");
                System.out.println("Exemplo: Translação, Rotação, Reflexão ou Projeção ");
                String metodo = sc.nextLine();

                float dx = 0;
                float dy = 0;
                float dz = 0;
                float angulo = 0;
                String escolha = null;

                switch (metodo.toLowerCase()) {
                    case "translação":
                        System.out.println("Forneça-me os valores de DX, DY & DZ");
                        System.out.print("Digite o valor de DX: ");
                        dx = sc.nextFloat();
                        System.out.print("Digite o valor de DY: ");
                        dy = sc.nextFloat();
                        System.out.print("Digite o valor de DZ: ");
                        dz = sc.nextFloat();
                        break;
                    case "rotação":
                        System.out.print("Em volta de qual eixo você deseja rotacionar?  ( X, Y ou Z ) ");
                        escolha = sc.nextLine();
                        if (escolha.equalsIgnoreCase("x")) {
                            System.out.println("Forneça-me os valores de DX");
                            System.out.print("Digite o valor do angulo: ");
                            float ang = sc.nextFloat();
                            angulo = (float) Math.toRadians(ang);
                        } else if (escolha.equalsIgnoreCase("y")) {
                            System.out.print("Digite o valor do angulo: ");
                            float ang = sc.nextFloat();
                            angulo = (float) Math.toRadians(ang);
                        } else if (escolha.equalsIgnoreCase("z")) {
                            System.out.print("Digite o valor do angulo: ");
                            float ang = sc.nextFloat();
                            angulo = (float) Math.toRadians(ang);
                        }
                        break;
                    case "reflexão":
                        System.out.print("Em qual coordenada você deseja operar a reflexão? ( X, Y ou Z ): ");
                        escolha = sc.next();
                        if (!escolha.equalsIgnoreCase("x") && !escolha.equalsIgnoreCase("y") && !escolha.equalsIgnoreCase("z")) {
                            throw new InputMismatchException("Opção inválida! Use 'x', 'y' ou 'z'.");
                        }
                        if (escolha.equalsIgnoreCase("x")) {
                            System.out.print("Digite o valor de DX: ");
                            dx = sc.nextFloat();
                        } else if (escolha.equalsIgnoreCase("y")) {
                            System.out.print("Digite o valor de DY: ");
                            dy = sc.nextFloat();
                        } else {
                            System.out.print("Digite p valor de DZ: ");
                            dz = sc.nextFloat();
                        }
                        break;
                    case "projeção":
                        System.out.println("Em qual coordenada você deseja operar a projeção? ( X, Y ou Z ): ");
                        escolha = sc.next();
                        if (!escolha.equalsIgnoreCase("x") && !escolha.equalsIgnoreCase("y") && !escolha.equalsIgnoreCase("z")) {
                            throw new InputMismatchException("Opção inválida! Use 'x', 'y' ou 'z'.");
                        }
                        if (escolha.equalsIgnoreCase("x")) {
                            System.out.print("Digite o valor de DX: ");
                            dx = sc.nextFloat();
                        } else if (escolha.equalsIgnoreCase("y")) {
                            System.out.print("Digite o valor de DY: ");
                            dy = sc.nextFloat();
                        } else {
                            System.out.print("Digite p valor de DZ: ");
                            dz = sc.nextFloat();
                        }
                        break;
                    default:
                        throw new InputMismatchException("Método inválido, confira a sua escrita.");
                }

                realizarOperacao3D(metodo.toLowerCase(), vector3D, dx, dy, dz, angulo, escolha);

                System.out.print("Você deseja realizar mais operações? (Sim ou Não): ");
                manter3D = sc.next();

            } while (manter3D.equalsIgnoreCase("sim"));
        } else {
            throw new InputMismatchException("Oque foi escrito não foi identificado.");
        }
    }

    public static void realizarOperacao2D(String metodo, Vector vector, float dx, float dy, float angulo, String escolha) {
        switch (metodo) {
            case "translação":
                System.out.println("Translação realizada com sucesso!");
                System.out.println("Vetor antes da translação: " + vector);
                System.out.println("Vetor após translação: " + translate2D(vector, dx, dy));
                break;
            case "rotação":
                System.out.println("Rotação realizada com sucesso!");
                System.out.println("Vetor antes da rotação: " + vector);
                System.out.println("Vetor após rotação: " + rotation2D(vector, angulo));
                break;
            case "reflexão":
                System.out.println("Reflexão realizada com sucesso!");
                System.out.println("Vetor antes da reflexão: " + vector);
                if (escolha.equalsIgnoreCase("x")) {
                    System.out.println("Vetor após reflexão em X: " + reflection2DX(vector));
                } else {
                    System.out.println("Vetor após reflexão em Y: " + reflection2DY(vector));
                }
                break;
            case "projeção":
                System.out.println("Projeção realizada com sucesso!");
                System.out.println("Vetor antes da projeção: " + vector);
                if (escolha.equalsIgnoreCase("x")) {
                    System.out.println("Vetor após a projeção de X: " + projection2DX(vector));
                } else {
                    System.out.println("Vetor após a projeção de Y: " + projection2DY(vector));
                }
                break;
            case "cisalhamento":
                System.out.println("Cisalhamento realizado com sucesso!");
                if (escolha.equalsIgnoreCase("x")) {
                    System.out.println("Vetor antes do cisalhamento: " + vector);
                    System.out.println("Vetor após cisalhamento: " + shearing(vector, dx, 0));
                } else if (escolha.equalsIgnoreCase("y")) {
                    System.out.println("Vetor antes do cisalhamento: " + vector);
                    System.out.println("Vetor após cisalhamento: " + shearing(vector, 0, dy));
                } else {
                    System.out.println("Vetor antes do cisalhamento: " + vector);
                    System.out.println("Vetor após cisalhamento: " + shearing(vector, dx, dy));
                }
                break;
            default:
                throw new InputMismatchException("Método inválido!");
        }
    }

    public static void realizarOperacao3D(String metodo, Vector vector, float dx, float dy, float dz, float angulo, String escolha) {
        switch (metodo) {
            case "translação":
                System.out.println("Translação realizada com sucesso!");
                System.out.println("Vetor antes da translação: " + vector);
                System.out.println("Vetor após translação: " + translate3D(vector, dx, dy, dz));
                break;
            case "rotação":
                System.out.println("Rotação realizada com sucesso!");
                System.out.println("Vetor antes da rotação: " + vector);
                if (escolha.equalsIgnoreCase("x")) {
                    System.out.println("Vetor após rotação ( X ): " + rotation3DX(vector, angulo));
                } else if (escolha.equalsIgnoreCase("y")) {
                    System.out.println("Vetor após rotação ( Y ): " + rotation3DY(vector, angulo));
                } else {
                    System.out.println("Vetor após rotação ( Z ): " + rotation3DZ(vector, angulo));
                }
                break;
            case "reflexão":
                System.out.println("Reflexão realizada com sucesso!");
                System.out.println("Vetor antes da reflexão: " + vector);
                if (escolha.equalsIgnoreCase("x")) {
                    System.out.println("Vetor após reflexão em X: " + reflection3DX(vector));
                } else if (escolha.equalsIgnoreCase("y")) {
                    System.out.println("Vetor após reflexão em Y: " + reflection3DY(vector));
                } else {
                    System.out.println("Vetor após reflexão em Z: " + reflection3DZ(vector));
                }
                break;
            case "projeção":
                System.out.println("Projeção realizada com sucesso!");
                System.out.println("Vetor antes da projeção: " + vector);
                if (escolha.equalsIgnoreCase("x")) {
                    System.out.println("Vetor após a projeção de X: " + projection3DX(vector));
                } else if (escolha.equalsIgnoreCase("y")) {
                    System.out.println("Vetor após a projeção de Y: " + projection3DY(vector));
                } else {
                    System.out.println("Vetor após projeção de Z: " + projection3DZ(vector));
                }
                break;
            default:
                throw new InputMismatchException("Método inválido!");
        }
    }


}
