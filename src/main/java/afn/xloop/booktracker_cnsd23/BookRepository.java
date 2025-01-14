package afn.xloop.booktracker_cnsd23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;

@Repository
public class BookRepository implements IBookRepository<Book> {

    private Map<Integer, Book> booklistrepo;

    public BookRepository(){
        this.booklistrepo = new HashMap<>();
    }

    @Override
    public void save(Book book) {
        this.booklistrepo.put(book.getId(), book);
    }

    @Override
    public Collection<Book> getAllBook() {
        return this.booklistrepo.values();
    }

    @Override
    public void delete(Book book) {
        this.booklistrepo.remove(book.getId(), book);

}

   

    // public Collection<Book> removeById() {
    //     return null;
    // }
}
