package f4life.dao;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

import f4life.Imovel;
import f4lipe.factory.ConnectionFactory;

public class ImovelDAO {

	public void save(Imovel imovel) {
		String sql = "INSERT INT imovel (cnpj, quant_quartos) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		
		try {
			// criar uma conexão com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL(); 
			
			// criamos uma PreparedStatement, para executar uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setInt(1, imovel.getCnpj());
			pstm.setInt(2, imovel.getQuant_quartos());
			
			
			// executar a query
			pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			// fechar as conexões
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
