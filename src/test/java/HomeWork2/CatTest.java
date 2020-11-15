package HomeWork2;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat cat = new Cat();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sound() {
        assertEquals("Мяу!", cat.sound());
    }

    @Test
    void move() {
        assertEquals("Кошка двигается!", cat.move());
    }

    @Test
    void eat() {
        assertEquals("Кошка ест!", cat.eat());
    }
}