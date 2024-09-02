import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o login: ");
    String login = sc.next();
    System.out.println("");

    String ad = "admin";
    int admin = 12345;


    String fin = "financeiro";
    int financeiro = 54321;

    String cli = "cliente";
    int cliente = 1111;

    if (login.equals(ad)){
      System.out.println("");
      System.out.println("Digite sua senha: ");
      int pin = sc.nextInt();
      if (pin==admin) {
        System.out.println("");
        System.out.print("Acesso concedido.");
      } else {
        System.out.println("");
        System.out.print("Acesso rejeitado.");
    } if (login!=ad){
        System.out.println("Usuário não encontrado.");
    }
    }


    if (login.equals(fin)){
      System.out.println("");
      System.out.println("Digite sua senha: ");
      int pin1 = sc.nextInt();
      if (pin1==financeiro) {
        System.out.println("");
        System.out.print("Acesso concedido.");
     } else {
        System.out.println("");
        System.out.print("Acesso rejeitado.");
    } if (login!=fin){
        System.out.println("Usuário não encontrado.");
    }
    }
    if (login.equals(cli)){
      System.out.println("");
      System.out.println("Digite sua senha: ");
      int pin2 = sc.nextInt();
      if (pin2==cliente) {
        System.out.println("");
        System.out.print("Acesso concedido.");
    } else {
        System.out.println("");
        System.out.print("Acesso rejeitado.");
    } if (login!=cli) {
        System.out.println("Usuário não encontrado.");
    }
    sc.close();
    }
  }
}