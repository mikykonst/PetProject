package test;

import com.company.User;
import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserTest {
    @Test
    public void userCreation() throws Exception {
        User user = new User("Misha", 24);

        assertEquals(user.getAccount().getMoneyAmount(), 0, 0);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void shouldNotCreateAccount() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("User should be 18 years old");
        User user = new User("Misha", 16);
    }

    @Test
    public void shouldShowListOfUsers() throws Exception {
        List<String> mockedUsers = new ArrayList<>(Arrays.asList("Misha", "Petya", "Vasya"));
        User user1 = new User("Misha", 24);
        User user2 = new User("Petya", 20);
        User user3 = new User("Vasya", 21);

        assertEquals(User.BankAccount.getAllUsers(), mockedUsers);
    }

    @Test
    public void shouldMakeOperationsWithMoney() throws Exception {
        User user1 = new User("Misha", 24);
        user1.getAccount().putMoney(1000);

        assertEquals(user1.getAccount().getMoneyAmount(), 1000, 0);

        user1.getAccount().withdrawMoney(100);

        assertEquals(user1.getAccount().getMoneyAmount(), 900, 0);
    }
}
