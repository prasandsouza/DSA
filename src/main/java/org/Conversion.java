package org;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Value;
import org.streams.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Conversion {

    static ObjectMapper objectMapper = new ObjectMapper();


    public static void main(String[] args) throws IOException {
        InputStream inputStream = Conversion.class.getClassLoader().getResourceAsStream("employeeSample.json");
        if (inputStream == null) {
            System.err.println("resource not found: employeeSample.json");
            return;
        }
        byte[] bytes = inputStream.readAllBytes();
        String fileData = new String(bytes, java.nio.charset.StandardCharsets.UTF_8);
        System.out.println(fileData);
        System.out.println(objectMapper.readValue(fileData, List.class));
    }
}
