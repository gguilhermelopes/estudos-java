package dao.generic;

import domain.Persistent;
import exception.TypeKeyNotFoundException;

import java.util.Collection;

/**
 * @author guilherme.lopes
 *
 * Interface genérica para métodos de CRUD(Create, Read, Update and Delete)
 */
public interface IGenericDAO <T extends Persistent> {

    /**
     * Método para cadastrar novos registro no banco de dados
     *
     * @param entity a ser cadastrado
     * @return true para cadastrado e false para não cadastrado
     */
    public Boolean save(T entity) throws TypeKeyNotFoundException;

    /**
     * Método para excluir um registro do banco de dados
     *
     * @param value chave única do dado a ser excluído
     */
    public void delete(Long value);

    /**
     * Método para alterar um registro no banco de dados.
     *
     * @param entity a ser atualizado
     */
    public void update(T entity) throws TypeKeyNotFoundException;

    /**
     * Método para consultar um registro no banco de dados
     *
     * @param value chave única do dado a ser consultado
     * @return Registro encontrado
     */
    public T search(Long value);

    /**
     * Método que irá retornar todos os registros do banco de dados de uma determinado dado ou tabela
     *
     * @return Registros encontrados
     */
    public Collection<T> searchAll();
}