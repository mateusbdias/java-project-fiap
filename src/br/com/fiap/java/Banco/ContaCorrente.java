package br.com.fiap.java.Banco;

/**
 * Classe que abstrai uma conta corrente
 * @author mateusdias
 * @version 1.0
 */
public class ContaCorrente extends Conta {

	/**
	 * Tipo da conta
	 */
	private String tipo;
	/**
	 * Valor disponível no cheque especial
	 */
	private double chequeEspecial;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(int numero, int agencia, double saldo, String tipo) {
		super(numero, agencia, saldo);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	/**
	 * Retorna o saldo total disponível, acrescido do cheque especial
	 * @return Saldo total disponível
	 */
	public double getSaldoDisponivel() {
		return getSaldo() + this.chequeEspecial;
	}
	
	/**
	 * Retira um valor do saldo da conta, acrescido da respectiva taxa
	 * @param valor Valor a ser retirado
	 */
	@Override
	public void retirar(double valor) {
		valor += 10;
		super.retirar(valor);
	}
	
}
