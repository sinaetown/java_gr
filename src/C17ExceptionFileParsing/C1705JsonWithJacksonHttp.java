package C17ExceptionFileParsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;


public class C1705JsonWithJacksonHttp {
    public static void main(String[] args) {
//        http client 생성
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();

//        http 요청 객체 생성
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .GET()
                .build();

//        http 응답 객체 생성
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String post = response.body();
            JsonNode jsonNode = mapper.readTree(post);
//            Post post1 = new Post(jsonNode.get("userId").asText(), jsonNode.get("id").asText(),
//                    jsonNode.get("title").asText(), jsonNode.get("body").asText());
//
////          readValue를 사용해서 객체로 곧바로 mapping -> 기본생성자 사용
//            Post post2 = mapper.readValue(post, Post.class);
//            System.out.println(post2);

//            Json노드는 트리구조이므로, for(JsonNode j : JsonNode jsonNode) 형식이 가능하다
            List<Post> postList = new ArrayList<>();

            for (JsonNode j : jsonNode) {
//                post3.add(new Post(j.get("userId").asText(), j.get("id").asText(),
//                        j.get("title").asText(), j.get("body").asText()));
                Post post3 = mapper.readValue(j.toString(), Post.class);
                postList.add(post3);
            }
//            for (Post p : postList) {
//                System.out.println(p);
//            }

//            Java객체를 json데이터로 직렬화
            String serialized_data = mapper.writeValueAsString(postList);
            System.out.println(serialized_data);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Post {
    String userId;
    String id;
    String title;
    String body;

    Post(String userId, String id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    Post() {

    }

    public String getUserId() {
        return userId;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "id : " + id + "\ntitle : " + title;
    }
}
