package C12ClassLecture;

import java.util.*;

public class C1204AuthorPostService {

    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        List<Post> posts = new ArrayList<>();
        boolean b = true;
        while (b) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter 1 for sign up \n 2 for posting \n 3 to view author list" +
                    "\n 4 for detailed author info \n 5 for detailed post info.");
            String service_choice = sc.nextLine();
            if (service_choice.equals("1")) {
                System.out.println("Enter author's name: ");
                String name = sc.nextLine();
                System.out.println("Enter author's email: ");
                String email = sc.nextLine();
                System.out.println("Enter author's password: ");
                String password = sc.nextLine();
                Author enrolledAuthor = new Author(name, email, password);
                authors.add(enrolledAuthor); //List
                System.out.printf("Sign up completed! \n%s\'s account is newly created!\n", enrolledAuthor.getName());
            } else if (service_choice.equals("2")) {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Login using author's email : ");
                String current_email = sc2.nextLine();
                Author current_author = null;
                for (Author a : authors) {
                    if (a.getEmail().equals(current_email)) {
                        current_author = a;
                        break;
                    }
                }
                System.out.println("Enter post's title: ");
                String title = sc2.nextLine();
                System.out.println("Enter post's contents: ");
                String contents = sc2.nextLine();
                if (current_author != null) {
                    Post uploadedPost = new Post(title, contents, current_author);
                    current_author.postsOfAuthor.add(uploadedPost);
                    System.out.println(current_author.postsOfAuthor.size());
                    posts.add(uploadedPost);
                } else if (current_author == null) {
                    System.out.println("Failure");
                }

//                System.out.printf("New post with the title, '%s' is uploaded!", uploadedPost.getTitle());
//                System.out.println(posts.size());
            } else if (service_choice.equals("3")) {
                for (Author a : authors) {
                    System.out.printf("Email: %s", a.getEmail());
                    System.out.println();
                }
            } else if (service_choice.equals("4")) {
                System.out.println("Enter author's Email: ");
                String author_email = sc.nextLine();
                Author temp_author = null;

                for (Author a : authors) {
                    if (a.getEmail().equals(author_email)) {
                        temp_author = a;
                        break;
                    }
                }

                System.out.println("Total number of posts : " + temp_author.postsOfAuthor.size());
                break;

            } else if (service_choice.equals("5")) {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Enter post ID : ");
                Long current_id = Long.parseLong(sc2.nextLine());
                Post temp_post = null;

                for (Post p : posts) {
                    if (p.getId().equals(current_id)) {
                        System.out.printf("Title: %s", p.getTitle());
                        temp_post = p;
                        break;
                    }
                }

                assert temp_post != null; //??
                System.out.println(temp_post.getAuthor().getEmail());

            } else {
                System.out.println("Program ended. See you!");
                b = false;
            }
        }
    }
}

//DB의 entity == Java의 class
//DB의 칼럼명 == Java의 인스턴스 변수
class Author {
    private Long id;
    private String name;
    private String email;
    private String password;

    List<Post> postsOfAuthor = new ArrayList<>();
    static Long static_id = 0L;

    Author(String name, String email, String password) {
        static_id++;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Post> getPostsOfAuthor() {
        return postsOfAuthor;
    }

    public String getPassword() {
        return password;
    }
}

class Post {
    private Long id;
    private String title;
    private String contents;
    private Author author;

    static Long static_id = 0L;

    Post(String title, String contents, Author author) {
        static_id++;
        this.id = static_id;
        this.title = title;
        this.contents = contents;
//        if (C1204AuthorPostService.authors.contains(author)){
        this.author = author;
//        }
//        else{
//            System.out.println("no");
//        }

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Author getAuthor() {
        return author;
    }
}