package tdd;

import org.junit.Assert;
import org.junit.Test;
import tdd.dao.ContractDAO;
import tdd.dao.IContractDAO;
import tdd.dao.mock.ContractDAOMock;
import tdd.service.ContractService;
import tdd.service.IContractService;


public class ContractServiceTest {
    @Test
    public void saveTest(){
        IContractDAO dao = new ContractDAOMock();
        IContractService service = new ContractService(dao);
        String saveReturn = service.save();
        Assert.assertEquals("Sucesso", saveReturn);
    }

    @Test
    public void searchTest(){
        IContractDAO dao = new ContractDAOMock();
        IContractService service = new ContractService(dao);
        String searchReturn = service.search();
        Assert.assertEquals("Sucesso", searchReturn);
    }

    @Test
    public void deleteTest(){
        IContractDAO dao = new ContractDAOMock();
        IContractService service = new ContractService(dao);
        String deleteReturn = service.delete();
        Assert.assertEquals("Sucesso", deleteReturn);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void expectedErrorOnSaveWithDatabase(){
        IContractDAO dao = new ContractDAO();
        IContractService service = new ContractService(dao);
        String saveReturn = service.save();
        Assert.assertEquals("Sucesso", saveReturn);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void expectedErrorOnSearchWithDatabase(){
        IContractDAO dao = new ContractDAO();
        IContractService service = new ContractService(dao);
        String searchReturn = service.search();
        Assert.assertEquals("Sucesso", searchReturn);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void expectedErrorOnDeleteWithDatabase(){
        IContractDAO dao = new ContractDAO();
        IContractService service = new ContractService(dao);
        String deleteReturn = service.delete();
        Assert.assertEquals("Sucesso", deleteReturn);
    }
}
