package C17ExceptionFileParsing;

import java.io.IOException;
import java.util.HashMap;

public class C1703JsonWithJacksonRaw {
    public static void main(String[] args) {
        ObjectMapper mapper = new OBjectMapper();
        try{
//            readTree 통해서 json을 계층적 트리 구조 형태로 변환
            JsonNode data1- mapper.readTree(Paths.get());
            Map<String, String> studentMap = new HashMap<>();
            studentMap.,put()
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
