import configuration.AppConfig;
import model_Driver.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driverCar = context.getBean("driverCar", Driver.class);
        Driver driverBus = context.getBean("driverBus", Driver.class);
        Driver driverPickup = context.getBean("driverPickup", Driver.class);

        driverCar.startTheTransport();
        driverBus.startTheTransport();
        driverPickup.startTheTransport();

        System.out.println(driverCar);
        System.out.println(driverBus);
        System.out.println(driverPickup);
    }
}
