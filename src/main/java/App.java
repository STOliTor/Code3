import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =  (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        //ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat cat = (Cat) applicationContext2.getBean("cat");
        System.out.println(cat.getName());

        //ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat cat2 = (Cat) applicationContext2.getBean("cat");
        System.out.println(cat2.getName());


        System.out.println(bean == bean2);
        System.out.println(cat == cat2);
    }
}