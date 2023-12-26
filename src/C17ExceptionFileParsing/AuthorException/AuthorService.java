package C17ExceptionFileParsing.AuthorException;

import java.util.*;

class AuthorService {
    AuthorRepository repo;

    AuthorService() {
        this.repo = new AuthorRepository();
    }

    void register(Author author) throws IllegalArgumentException {
//        만약 password가 5자리 이하이면 예외 발생 (IllegalArgumentException)
        if (author.getPassword().length() <= 5) {
            throw new IllegalArgumentException("password is too short!");
        }
        repo.register(author);
    }

    Optional<Author> login(String input_email, String input_password) throws NoSuchElementException, IllegalArgumentException {
        List<Author> authorList = repo.getAuthors();
        Optional<Author> authorEmailCheck = Optional.empty();
        Author authorforPasswordCheck = null;
        Optional<Author> authorLoginSuccess = Optional.empty();

//        email이 존재하지 않으면 예외 발생 (NoSuchElementException)
        for (Author a : authorList) {
            if (a.getEmail().equals(input_email)) {
                authorEmailCheck = Optional.of(a);
                authorforPasswordCheck = a;
                break;
            }
        }
        if(authorEmailCheck.isEmpty()){
            throw new NoSuchElementException("email doesn't match");
        }
//        password가 틀리면 예외 발생 (IllegalArgumentException)
        if (authorEmailCheck.isPresent()) {
            if (authorEmailCheck.get().getPassword().equals(input_password)) {
                authorLoginSuccess = Optional.of(authorforPasswordCheck);
            } else {
                throw new IllegalArgumentException("password is wrong");
            }
        }
        return authorLoginSuccess;
    }
}
