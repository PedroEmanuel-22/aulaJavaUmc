package tratamentoExcecoes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ConexaoBanco {

	public static void main(String[] args) {
		try {
			conectarBanco();
		} catch (SQLException e){
			System.out.println("Erro ao conectar banco");
		}

	}
	
	public static void conectarBanco () throws SQLException{
		
		String url = "jdbc:mysql://localhost:3306/sistema";
		String usuario = "root";
		String senha ="";
		
		Connection conexao = DriverManager.getConnection(url,usuario,senha);
		
		System.out.println("Conexão com sucesso");
		
		String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";
		
		PreparedStatement consQuery = conexao.prepareStatement(sql);
		consQuery.setString(1,"Felipe");
		consQuery.setString(2,"Felipe@gmail.com");
		consQuery.setString(3,"admin");
		
		//execute a consulta
		consQuery.executeUpdate();
		
		//Encerra a conexão com o banco
		consQuery.close();
		conexao.close();
	}

}
