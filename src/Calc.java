import java.util.Scanner;

public class Calc {

    static public void main(String[] args) {
        String op;
        Scanner sc = new Scanner(System.in);

        Num n1 = new Num(0);
        Num n2 = new Num(0);
        Num res = new Num(0);

        System.out.print("Digite o 1° Numero: ");
        n1.setValue(sc.nextFloat());
        do {
            System.out.println("Qual Operação(+, -, /, *)");
            op = sc.next();
            if(!op.equals("+") && !op.equals("-") && !op.equals("/") && !op.equals("*")){
                System.out.println("Digite Novamente o Operador");
            }
        } while (!op.equals("+") && !op.equals("-") && !op.equals("/") && !op.equals("*"));
        System.out.print("Digite o 2° Numero: ");
        n2.setValue(sc.nextFloat());


        if (op.equals("+")) {
            res.setValue(n1.getValue() + n2.getValue());
            System.out.println(res.getValue());
        } else if (op.equals("-")) {
            res.setValue(n1.getValue() - n2.getValue());
            System.out.println(res.getValue());
        } else if (op.equals("/")) {
            res.setValue(n1.getValue() / n2.getValue());
            System.out.println(res.getValue());
        } else if (op.equals("*")) {
            res.setValue(n1.getValue() * n2.getValue());
            System.out.println(res.getValue());
        }

    }
}
