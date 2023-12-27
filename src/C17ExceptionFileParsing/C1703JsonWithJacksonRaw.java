package C17ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class C1703JsonWithJacksonRaw {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
//            readTree 통해서 Json을 계층적 트리 구조 형태로 변환
            File myPath = Paths.get("src/C17ExceptionFileParsing/testdata1.json").toFile();
            JsonNode data1 = mapper.readTree(myPath);
            Map<String, String> studentMap = new HashMap<>();
            studentMap.put("name", data1.get("name").asText());
            studentMap.put("classNumber", data1.get("classNumber").asText());
            studentMap.put("city", data1.get("city").asText());
            System.out.println(studentMap);

//            key:value중에 value의 타입이 예상되지 않을 땐 Object 타입으로 받을 수 있음
            Map<String, Object> studentMap2 = mapper.readValue(myPath, Map.class);
            System.out.println(studentMap2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
