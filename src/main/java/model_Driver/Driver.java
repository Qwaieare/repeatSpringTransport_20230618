package model_Driver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import models_Transport.Transport;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    private String name;
    private Transport transport;

    public void startTheTransport() {
        transport.start();
    }
}
