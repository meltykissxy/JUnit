import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Playground {
    Person p;
    String name;
    int age;

    int[] brand;

    @Test
    public void run04() {
        System.out.println("Test02");
    }

    /**
     * 只要执行任何一个@Test，顺序必定是：@BeforeEach -> @Test -> @AfterEach
     * 就算@Test失败了，@BeforeEach和@AfterEach也会执行
     */
    @Test
    public void run01() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(brand);
        System.out.println(p.name);
    }

    @AfterEach
    public void run02() {
        System.out.println("After");
    }

    @BeforeEach
    public void run03() {
        System.out.println("Before");
    }
}

class Person {
    String name;
    int age;
}
