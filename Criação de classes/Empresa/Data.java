public class Data {
	// comentario de uma linha
	
	/*
	 * comentario de varias linhas
	 * 
	 */
	private short ano;
	private byte mes;
	private byte dia;
	
	public Data(){
		this.ano = -1;
		this.mes = -1;
		this.dia = -1;
	}
	
	public void setAno(short ano){
		this.ano = ano;
	}
	
	public short getAno(){
		return this.ano;
	}
	
	public void setMes(byte mes){
		this.mes = mes;
	}
	
	public byte getMes(){
		return this.mes;
	}
	
	public void setDia(byte dia){
		this.dia = dia;
	}
	
	public byte getDia(){
		return this.dia;
	}
}
