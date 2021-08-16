import io.muzhi.Application;
import io.muzhi.models.RuntimeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RuntimeTest {

    /** 运行时切入
     *  需要在resources目录META-INF/aop.xml文件中指定切面和切面方法
     * <?xml version="1.0" encoding="UTF-8"?>
     * <!DOCTYPE aspectj PUBLIC "-//AspectJ//DTD//EN" "https://www.eclipse.org/aspectj/dtd/aspectj.dtd">
     * <aspectj>
     *     <aspects>
     *         <aspect name="io.muzhi.aspects.RuntimeAspect"/>
     *     </aspects>
     *     <weaver options="-verbose -showWeaveInfo">
     *         <include within="io.muzhi.models.**"/>
     *         <include within="io.muzhi.aspects.RuntimeAspect"/>
     *     </weaver>
     * </aspectj
     *  然后Java项目运行时指定javaagent
     *    <plugin>
     *       <groupId>org.apache.maven.plugins</groupId>
     *       <artifactId>maven-surefire-plugin</artifactId>
     *       <version>2.20</version>
     *       <configuration>
     *           <argLine>-javaagent:"${settings.localRepository}"/org/aspectj/aspectjweaver/${aspectj.version}/aspectjweaver-${aspectj.version}.jar</argLine>
     *           <useSystemClassLoader>true</useSystemClassLoader>
     *           <forkMode>always</forkMode>
     *       </configuration>
     *   </plugin>
     */
    @Test
    public void runtimeTest() {
        RuntimeClass runtimeClass = new RuntimeClass();
        runtimeClass.aMethod();
    }
}
