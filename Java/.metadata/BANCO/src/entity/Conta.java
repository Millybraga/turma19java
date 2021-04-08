package entity;

public class Conta {

	public int numero;
	public String cpf;
	public double saldo;
	public boolean ativa;
	public double valor;
	
	public void debito(double valor) {
		saldo = saldo - valor;
	}
	public void credito(double valor) {
		saldo = saldo + valor;
	}
	
	
	
}
