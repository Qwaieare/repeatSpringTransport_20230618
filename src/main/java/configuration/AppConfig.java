package configuration;

import model_Driver.Driver;
import models_Transport.Bus;
import models_Transport.Car;
import models_Transport.Pickup;
import models_Transport.Transport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "car")
    public Transport getCarBean() {
        return new Car("FFF");
    }
    @Bean(name = "bus")
    public Transport getBusBean() {
       return new Bus("ABB");
   }
    @Bean(name = "pickup")
    public Transport getPickupBean() {
        return new Pickup("NMN");
    }

    @Bean(name = "driverCar")
    public Driver getDriverCar() {
        return new Driver("Sasha", getCarBean());
    }

    @Bean(name = "driverBus")
    public Driver getDriverBus() {
        return new Driver("Grisha", getBusBean());
    }

    @Bean(name = "driverPickup")
    public Driver getDriverPickup() {
        return new Driver("Misha", getPickupBean());
    }
}
