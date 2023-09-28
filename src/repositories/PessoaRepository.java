package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import entities.Pessoa;

public class PessoaRepository {
	
	public void create(Pessoa pessoa) throws Exception { 
		
		// Parâmetros para conexão com o banco de dados
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/bd_projetoaula04";
		String user = "postgres";
		String password = "coti";
		
		// Abrindo conexão com banco de dados 
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, user, password);
		
		// escrevendo um comando SQL para gravar um registro na tabela de pessoa no banco de dados (linguagem SQL)
		PreparedStatement statement = connection.prepareStatement("insert into pessoa(id, nome, cpf) values(?,?,?)");
		statement.setObject(1, pessoa.getId()); 	// preenchendo o nome id da tabela pessoa
		statement.setString(2, pessoa.getNome());   // preenchendo o campo nome da tabela pessoa
		statement.setString(3, pessoa.getCpf());    // preenchendo o campo cpf na tabela pessoa 
		statement.execute(); // executando e finalizando
		
		// fechar a conexão com banco de dados 
		connection.close();
		
		
	}

}
