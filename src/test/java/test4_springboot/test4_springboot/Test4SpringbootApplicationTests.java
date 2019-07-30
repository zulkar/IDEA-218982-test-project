package test4_springboot.test4_springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test4SpringbootApplicationTests {

    @Test
    public void contextLoads() {
        ReadXMLFileJaxb.main(new String[0]);
    }


}
