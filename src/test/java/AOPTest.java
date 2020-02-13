import com.toulan.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LOL_toulan
 * @Time 2020/2/12 19:29
 * @Message
 */
public class AOPTest {

    public static void main(String[] args) {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //获取容器中对象
        AccountService as = (AccountService) ac.getBean("accountService");
        //执行方法
//        as.saveAccount();
        System.out.println();
        as.updateAccount(5);
        System.out.println();
//        as.deleteAccount();
    }
}
