package patrick.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import patrick.entity.Car;
import patrick.entity.InputJson;

import java.io.File;
import java.io.IOException;

public class Formatter {

    public Formatter() {
        // no-arg constructor
    }

    public static void objToJson(Car car, String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(filePath), car);
    }

    public static Car jsonToObj(String file) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = objectMapper.readValue(new File(file), Car.class);
        return car;
    }

    public InputJson readInput(String filepath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputJson inputJson = objectMapper.readValue(new File(filepath), InputJson.class);
        return inputJson;
    }


}
