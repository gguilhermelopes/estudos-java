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

    @Test(expected = UnsupportedOperationException.class)
    public void expectedErrorOnSaveWithDatabase(){
        IContractDAO dao = new ContractDAO();
        IContractService service = new ContractService(dao);
        String saveReturn = service.save();
        Assert.assertEquals("Sucesso", saveReturn);
    }
}
