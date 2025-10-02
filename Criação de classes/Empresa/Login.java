public class Login {
	private String codigo;
	private String senha;
	private int idPessoa;
	
	public Login(){
		this.codigo = "";
		this.senha = "";
		this.idPessoa = -1;
	}
	
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	
	public String getCodigo(){
		return this.codigo;
	}
	
	public void setSenha(String senha){
		this.senha = senha;
	}
	
	public String getSenha(){
		return this.senha;
	}
	
	public void setIdPessoa(int idPessoa){
		this.idPessoa = idPessoa;
	}
	
	public int getIdPessoa(){
		return this.idPessoa;
	}
}
