package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class C1703JsonWithJacksonRaw {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
//            readTree 통해서 json을 계층적 트리 구조 형태로 변환
            JsonNode data1 = mapper.readTree(Paths.get("src/C17ExceptionFileParsing/testdata").toFile());
            Map<String, String> studentMap = new HashMap<>();
            studentMap.put("name", data1.get("name").asText());
            studentMap.put("classNumber", data1.get("classNumber").asText());
            studentMap.put("city", data1.get("city").asText());
            System.out.println(studentMap);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
