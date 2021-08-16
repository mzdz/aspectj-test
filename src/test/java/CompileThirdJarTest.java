import com.alibaba.fastjson.JSONObject;
import io.muzhi.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class CompileThirdJarTest {


    /**
     * 切第三方库 注意要pom要添加运行时和第三方依赖
     *1. 首先在pom.xml中引入
     *  <dependency>
     *     <groupId>org.aspectj</groupId>
     *     <artifactId>aspectjrt</artifactId>
     *     <version>1.9.7</version>
     *  </dependency>
     *2. 引入第三方库的编织依赖weaveDependencies,然后安装依赖，编译即可;
     *  <plugin>
     *        <groupId>org.codehaus.mojo</groupId>
     *        <artifactId>aspectj-maven-plugin</artifactId>
     *        <version>1.14.0</version>
     *        <configuration>
     *            <complianceLevel>1.8</complianceLevel>
     *            <source>1.8</source>
     *            <target>1.8</target>
     *            <showWeaveInfo>true</showWeaveInfo>
     *            <Xlint>ignore</Xlint>
     *            <encoding>UTF-8</encoding>
     *            <forceAjcCompile>true</forceAjcCompile>
     *            <weaveDependencies>
     *                <weaveDependency>
     *                    <groupId>com.alibaba</groupId>
     *                    <artifactId>fastjson</artifactId>
     *                </weaveDependency>
     *            </weaveDependencies>
     *        </configuration>
     *        <executions>
     *            <execution>
     *                <goals>
     *                    <goal>compile</goal>
     *                    <goal>test-compile</goal>
     *                </goals>
     *            </execution>
     *        </executions>
     *    </plugin>
     */
    @Test
    public void thirdTest() {
        System.out.println(JSONObject.toJSONString("Abc"));
    }
}
