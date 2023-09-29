import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.Contact;
import ru.netology.PhoneBook;

public class PhoneBookTest {
    private PhoneBook phoneBook;

    @BeforeEach
    public void setup() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void testAddGroup_validGroup_success() {
        // given
        String group = "Семья";

        // when
        boolean result = phoneBook.addGroup(group);

        // then
        Assertions.assertTrue(result);
    }

    @Test
    public void testAddGroup_duplicateGroup_failure() {
        // given
        String group = "Семья";
        phoneBook.addGroup(group);
    }
}