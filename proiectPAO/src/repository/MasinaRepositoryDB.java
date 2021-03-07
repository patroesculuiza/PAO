package repository;

import model.Masina;
import repository.MasinaRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MasinaRepositoryDB extends MasinaRepository{

    public final Connection connection;

    public MasinaRepositoryDB(Connection connection) {
        this.connection = connection;
    }


    public void add(Masina M) throws SQLException {
        String sql = "INSERT INTO masina VALUES (NULL, ?)";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(3,M.getCuloare());
        statement.setString(2, M.getMarca());
        statement.setFloat(4,M.getCapacitate());
        statement.setString(1,"232");

        statement.executeUpdate();
        statement.close();
    }

    public void delete(int nr) throws SQLException {
        String sqlDelete = "DELETE FROM masina WHERE marca = ?";
        PreparedStatement statement = connection.prepareStatement(sqlDelete);
        statement.setInt(1, nr);
        statement.executeUpdate();
    }


    public List<Masina> getAll() throws SQLException {
        List<Masina> cards = new ArrayList<Masina>();

        String sql = "SELECT * FROM masina";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            Masina a = new Masina(rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getFloat(4));
            MasinaRepository b = new MasinaRepository();
            b.addMasina(a);
        }
        return cards;
    }

}
