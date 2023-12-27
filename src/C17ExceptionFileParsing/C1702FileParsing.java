package C17ExceptionFileParsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

//<textfile parsing>
public class C1702FileParsing {
    public static void main(String[] args) {
//        src/C17ExceptionFileParsing
        Path filePath = Paths.get("src/C17ExceptionFileParsing/text_file.txt");

//        1. 파일 쓰기
//        버퍼기능이 구현되어 있고, NIO 패키지에서는 non-blocking 방식 사용
//        기본이 StandardCharSets.UTF_8
//        CREATE_NEW 이후에 APPEND 실행 가능
        try {
            if (Files.exists(filePath)) {
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.APPEND);
            } else {
                Files.write(filePath, "손흥민\n".getBytes(), StandardOpenOption.CREATE_NEW);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        2. 파일 읽기 : readString (String 형태로 return), readAllLines(List 형태로 return)
        try {
            String mySt = Files.readString(filePath);
            System.out.println(mySt);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> myStrList = Files.readAllLines(filePath);
            System.out.println(myStrList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
