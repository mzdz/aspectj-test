import io.muzhi.models.CompileClass;
import org.junit.jupiter.api.Test;

public class LocalTest {

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
