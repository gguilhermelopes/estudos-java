package tdd.service;

import tdd.dao.IContractDAO;

public class ContractService implements IContractService {
    private IContractDAO contractDAO;
    public ContractService(IContractDAO dao) {
        this.contractDAO = dao;
    }

    @Override
    public String save() {
        contractDAO.save();
        return "Sucesso";
    }

    @Override
    public String search() {
        contractDAO.save();
        return "Sucesso";
    }

    @Override
    public String delete() {
        contractDAO.delete();
        return "Sucesso";
    }
}
