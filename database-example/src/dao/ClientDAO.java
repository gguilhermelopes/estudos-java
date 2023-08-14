package dao;

import dao.jdbc.ConnectionFactory;
import domain.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientDAO implements IClientDAO{
    @Override
    public Integer register(Client client) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = "INSERT INTO CLIENT (ID, CODE, NAME) VALUES (nextval('SQ_CLIENT'), ?, ?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, client.getCode());
            ps.setString(2, client.getName());
            return ps.executeUpdate();
        } catch (Exception error){
            throw error;
        } finally {
            if(ps != null && !ps.isClosed()){
                ps.close();
            }
            if(connection != null && !connection.isClosed()){
                connection.close();
            }
        }
    }

    @Override
    public Client search(String code) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        Client client = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM CLIENT WHERE CODE = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, code);

            ResultSet resultSet = ps.executeQuery();
            if(resultSet.next()){
                client = new Client();
                client.setId(resultSet.getLong("id"));
                client.setName(resultSet.getString("name"));
                client.setCode(resultSet.getString("code"));
            }
            return client;
        } catch (Exception error){
            throw error;
        } finally {
            if(ps != null && !ps.isClosed()){
                ps.close();
            }
            if(connection != null && !connection.isClosed()){
                connection.close();
            }
        }
    }

    @Override
    public Integer delete(Client client) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = "DELETE FROM CLIENT WHERE CODE = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, client.getCode());

            return ps.executeUpdate();
        } catch (Exception error){
            throw error;
        } finally {
            if(ps != null && !ps.isClosed()){
                ps.close();
            }
            if(connection != null && !connection.isClosed()){
                connection.close();
            }
        }
    }
}
