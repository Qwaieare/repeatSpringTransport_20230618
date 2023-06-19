package models_Transport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public abstract class Transport {
    private  String model;
    public abstract void start();

}
