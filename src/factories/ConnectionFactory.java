package factories;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Classe para fabricar as conexões com o banco de dados 
 * seguindo um Design Pattern chamado "Factory Method"
 */
public class ConnectionFactory {

	public static Connection getConnection() throws Exception {

		// Parâmetros para conexão com o banco de dados
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/bd_projetoaula04";
		String user = "postgres";
		String password = "coti";

		// Abrindo conexão com banco de dados
		Class.forName(driver);
		return DriverManager.getConnection(url, user, password);

	}

}
