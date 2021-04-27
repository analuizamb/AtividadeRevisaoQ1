package atividade1;

public class NotaFiscal {
	protected int numero;
	protected int data;
	protected int chave;
	protected int cnpjEmissor;
	protected String nomeEmissor;
	protected int docCliente;
	protected String nomeCliente;
	protected String listaProdNota;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	public int getCnpjEmissor() {
		return cnpjEmissor;
	}
	public void setCnpjEmissor(int cnpjEmissor) {
		this.cnpjEmissor = cnpjEmissor;
	}
	public String getNomeEmissor() {
		return nomeEmissor;
	}
	public void setNomeEmissor(String nomeEmissor) {
		this.nomeEmissor = nomeEmissor;
	}
	public int getDocCliente() {
		return docCliente;
	}
	public void setDocCliente(int docCliente) {
		this.docCliente = docCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getListaProdNota() {
		return listaProdNota;
	}
	public void setListaProdNota(String listaProdNota) {
		this.listaProdNota = listaProdNota;
	}
	
	public NotaFiscal(int numero, int data, int chave, int cnpjEmissor, String nomeEmissor, int docCliente, String nomeCliente, String listaProdNota) {
		this.numero = numero;
		this.data = data;
		this.chave = chave;
		this.cnpjEmissor = cnpjEmissor;
		this.nomeEmissor = nomeEmissor;
		this.docCliente = docCliente;
		this.nomeCliente =  nomeCliente;
		this.listaProdNota = listaProdNota;
		
	}


}
