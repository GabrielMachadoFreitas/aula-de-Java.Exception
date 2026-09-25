import java.util.Scanner;

public class Principal {

    static void main(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();

            if (nome.equals("kauan")) {
                throw new NomeInvalidoException("Não pode se chamar kauan");
            } else if (nome.equals("Lucas Grave")) {
                throw  new IllegalArgumentException("Não pode se chamar lucas grave");

            }
        }catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("oi");
        }



    }
}
