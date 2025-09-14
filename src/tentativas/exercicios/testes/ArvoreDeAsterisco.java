package tentativas.exercicios.testes;

public class ArvoreDeAsterisco {
    public static void main(String[] args) {

        int i = 1;
        int c = 1;
        int count;
        int countinf = 1;
        int ic = 1;
        int cr = 1;

        for (int ec = 1; ec <= 5; ec++) {
            System.out.println(" ");
        }
        for (int cmc = 1; cmc <= 75; cmc++) {
            System.out.print(("") + ("*"));
        }

        do {
            if (countinf % 2 == 1) {
                System.out.println(" ");
                for (count = 1; count <= 8; count++) {
                    i = 1;
                    c++;
                    for (i = 1; i < c; i++) {
                        System.out.print(("") + ("*"));
                    }

                    for (cr = 1; cr <= 3; cr++) {
                        System.out.print("   ");
                        for (int cd = 1; cd < 12; cd++) {
                            System.out.print(" ");
                        }
                        for (ic = 1; ic < 7; ic++) {
                            System.out.print(("") + ("*"));
                        }
                    }

                    for (cr = 1; cr <= 3; cr++) {
                        System.out.print("   ");
                        for (int cd = 1; cd < 14; cd++) {
                            System.out.print(" ");
                        }
                        for (ic = 1; ic < 7; ic++) {
                            System.out.print(("") + ("*"));
                        }
                    }


                    if (count <= 7 && count >= 1) {
                        System.out.println(" ");
                    }
                }
            } else {
                c = 9;
                for (count = 1; count <= 9; count++) {
                    i = 1;
                    c--;
                    if (count <= 7) {
                        System.out.println("   ");
                    } else {
                        continue;
                    }
                    for (i = 1; i < c; i++) {
                        System.out.print(("") + ("*"));
                    }

                    for (cr = 1; cr <= 3; cr++) {
                        System.out.print("   ");
                        for (int cd = 1; cd < 12; cd++) {
                            System.out.print(" ");
                        }
                        for (ic = 1; ic < 7; ic++) {
                            System.out.print(("") + ("*"));
                        }
                    }
                    for (cr = 1; cr <= 3; cr++) {
                        System.out.print("   ");
                        for (int cd = 1; cd < 14; cd++) {
                            System.out.print(" ");
                        }
                        for (ic = 1; ic < 7; ic++) {
                            System.out.print(("") + ("*"));
                        }
                    }
                }
            }
            countinf++;
        } while (countinf <= 100000);

        System.out.println(" ");
        for (int cmc2 = 1; cmc2 <= 75; cmc2++) {
            System.out.print((" ") + ("*"));
        }
        for (int ec2 = 1; ec2 <= 5; ec2++) {
            System.out.println(" ");
        }

    }
}

