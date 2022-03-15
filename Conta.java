package instaciamento;

public class Conta {
    private String nome_titular;
    private String numero_conta;
    private double saldo =0;

    public boolean depositar (double valor){
        if(valor >0){
            saldo = valor +saldo;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean sacar (double valor){
        if(valor >0 && saldo >= valor){
            saldo = saldo -valor;
            System.out.println("saque realizado com sucesso!!");
            return true;
        }
        else{
            System.out.println("saque nao realizado");
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome_titular() {
        return nome_titular;
    }

    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    public String getNumero_conta() {

        return numero_conta;
    }

    public void setNumero_conta(String numero_conta) {
        this.numero_conta = numero_conta;
    }
}




