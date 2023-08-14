package dao;

import domain.Client;

import java.sql.SQLException;

public interface IClientDAO {
    public Integer register(Client client) throws SQLException;

    Client search(String code) throws SQLException;

    Integer delete(Client client) throws SQLException;
}
