package f4lipe.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	// nome do usuário do sql
	private static final String USERNAME = "root";

	// senha do banco
	private static final String PASSWORD = "";
	
	// caminho do banco de dados, porta, nome do banco de dados
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/f4life";
	
	// conexão com o banco de dados
	public static Connection createConnectionToMySQL() throws Exception {
		// faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		
		// cria a conexão com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection; 
	}
	
	public static void main(String[] args) throws Exception {
		
		// recuperar uma conexão com o banco de dados
		Connection con = createConnectionToMySQL();
		
		// testar se a conexão é nula
		if (con!=null) {
			System.out.println("Conexão obetida com sucesso!");
			con.close();
		}
		
	}
}
