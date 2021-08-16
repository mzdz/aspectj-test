import io.muzhi.Application;
import io.muzhi.models.CompileClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class CompileTest {

    /**
     * 切本地方法
     * 切本地方法和第三方的区别在于不需要指定weaveDependency，其他都一样
     */
    @Test
    public void localTest() {
        CompileClass b = new CompileClass();
        b.aMethod();
    }
}
