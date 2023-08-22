import com.dealership.domain.acessory.Accessory;
import com.dealership.domain.car.Car;
import com.dealership.domain.manufacturer.Manufacturer;
import com.dealership.repository.*;
import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    private ICarRepository carRepository;
    private IManufacturerRepository manufacturerRepository;
    private IAccessoryRepository accessoryRepository;

    public CarTest(){
        carRepository = new CarRepository();
        manufacturerRepository = new ManufacturerRepository();
        accessoryRepository = new AccessoryRepository();

    }
    @Test
    public void createCarWithTwoAccessoriesTest(){
        Manufacturer manufacturer = createManufacturer("Mazda");
        Accessory accessory1 = createAccessory(
                "Bancos em couro", "Bancos feitos em couro"
        );
        Accessory accessory2 = createAccessory(
                "N02",
                "Nitro para arrancadas"
        );

        Car car = new Car();
        car.setName("RX-7");
        car.setManufacturer(manufacturer);
        car.addAccessories(accessory1);
        car.addAccessories(accessory2);

        accessory1.setCar(car);
        accessory2.setCar(car);


        Car carReturn = carRepository.create(car);
        Assert.assertNotNull(carReturn);
        Assert.assertNotNull(carReturn.getId());

        Accessory accessoryReturn1 = accessoryRepository.create(accessory1);
        Accessory accessoryReturn2 = accessoryRepository.create(accessory2);

        Assert.assertEquals(carReturn.getId(), accessoryReturn1.getCar().getId());
        Assert.assertEquals(carReturn.getId(), accessoryReturn2.getCar().getId());
    }

    private Accessory createAccessory(String name, String description) {
        Accessory accessory = new Accessory();
        accessory.setName(name);
        accessory.setDescription(description);

        return accessory;
    }

    private Manufacturer createManufacturer(String name) {
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setName(name);

        return manufacturerRepository.create(manufacturer);
    }
}
