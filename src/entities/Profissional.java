package entities;

public class Profissional {

	private Integer id;
	private String nome;
	private String email;
	private String telefone;
	private String especializacao;

	public Profissional() {
		// TODO Auto-generated constructor stub
	}

	public Profissional(Integer id, String nome, String email, String telefone, String especializacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.especializacao = especializacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	@Override
	public String toString() {
		return "Profissional [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
				+ ", especializacao=" + especializacao + "]";
	}

}
