import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;


@Getter
@Setter
@ToString
public class TestDemo {

    private String username;


    @Test
    public void test1() {

        System.out.println(663);
        System.out.println("asd");
        System.out.println(Arrays.toString(new int[]{}));


        HashMap<Object, Object> Map22 = new HashMap<>();

        HashMap<Object, Object> map3 = new HashMap<>();


    }


    public TestDemo2 test2() {

        int i2 = 123;
        return new TestDemo2();

    }

}

class TestDemo2 {

}
