package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import entities.Profissional;

public class ProfissionalRepository {

	/*
	 * Método para gravar no banco de dados informações de cliente e de endereço..
	 */
	public void insert(Profissional profissional) throws Exception {

		// parâmetros para conexão com o banco de dados
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/bd_projetojavaaula05_tarefa1";
		String user = "postgres";
		String pass = "coti";

		// abrindo conexão com o banco de dados
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, user, pass);

		PreparedStatement statement = connection.prepareStatement("insert into profissional (id, nome, email, telefone, especializacao) values(?,?,?,?,?)");

		statement.setObject(1, profissional.getId());
		statement.setString(2, profissional.getNome());
		statement.setString(3, profissional.getEmail());
		statement.setString(4, profissional.getTelefone());
		statement.setString(5, profissional.getEspecializacao());
		statement.execute();

		connection.close();

	}
}
