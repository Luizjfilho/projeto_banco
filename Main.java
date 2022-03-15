package instaciamento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa p = new Pessoa(); // objeto
       // p.nome = "Maria";
      //  p.cpf = 123456;

        Conta c = new Conta();   // objeto
        //c.nome_titular = "Maria";
        //c.numero_conta = "123456";

        //System.out.println(c.nome_titular+ "\t" +c.numero_conta);

        System.out.println("Imforme quanto que depositar no banco.");


       // System.out.println(c.depositar(1000)); // valor depositado
       // System.out.println(c.getSaldo()); // mostrando o valor no banco
        //System.out.println(c.sacar(500)); // valor sacado
        //System.out.println(c.getSaldo());// valor restante no banco
        c.setNome_titular("José");
        System.out.println(c.getNome_titular());

        c.depositar(250);
        System.out.println(c.getSaldo());
        c.setSaldo(2000);
        System.out.println(c.getSaldo());
        System.out.println(c.sacar(1999));
        System.out.println(c.getSaldo());

    }
}
