package br.com.fiap.java.Banco;

/**
 * Classe que abstrai uma conta bancária
 * @author mateusdias
 * @version 1.0
 */
public class Conta {
	/**
	 * Número da conta
	 */
	private int numero;
	/**
	 * Número da agência
	 */
	private int agencia;
	/**
	 * Saldo da conta
	 */
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(int numero, int agencia, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	/**
	 * Deposita um valor no saldo da conta
	 * @param valor Valor a ser depositado
	 */
	public void depositar(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException();
		}
		saldo += valor;
	}
	
	/**
	 * Retira um valor do saldo da conta
	 * @param valor Valor a ser retirado
	 */
	public void retirar(double valor) {
		saldo -= valor;
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > saldo) {
			throw new SaldoInsuficienteException();
		}
		saldo -= valor;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}

}
