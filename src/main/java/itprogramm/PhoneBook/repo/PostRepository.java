package itprogramm.PhoneBook.repo;

import itprogramm.PhoneBook.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
