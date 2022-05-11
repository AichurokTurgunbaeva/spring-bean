package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("hello world");
        System.out.println(bean.getMessage());

        Cat cat1 = (Cat) applicationContext.getBean("cat",Cat.class);
        System.out.println(cat1.getMessage());

        Cat cat2 = (Cat) applicationContext.getBean("cat",Cat.class);
        System.out.println(cat2.getMessage());

        System.out.println("Compare these two beans: bean1 and bean2 "+ (cat1==cat2));
    }
}
