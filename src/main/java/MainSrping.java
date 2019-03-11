import implementation.User;
import implementation.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSrping {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
        UserRepository repozytoriumUzytkownikow = context.getBean("repozytoriumUzytkownikow", UserRepository.class);
        User marek = repozytoriumUzytkownikow.createUser("Marek");
        User Wacek = repozytoriumUzytkownikow.createUser("Wacek");
    }

    
}
