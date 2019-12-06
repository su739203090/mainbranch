package come.xdkj.test;

import come.xdkj.bean.Car;
import come.xdkj.bean.FuZaDemo;
import come.xdkj.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author mr su
 * @create 2019-11-27 15:21
 */
public class Testspring {
    public static void main(String[] args) {
        /*ApplicationContext  创建spring容器时立马创建所有的Bean对象
                ClassPathXmlApplicationContext  从类路径加载
                FileSystemXmlApplicationContext 从系统路径加载
        BeanFactory          创建spring容器时不会立马创建所有的Bean对象，而是在getBean()才会创建
                XmlBeanFactory*/
        //创建了一个spring容器对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        Car car = context.getBean(Car.class);
        System.out.println(car);
        //通过bean里id获取对象
        Person person1 =(Person)context.getBean("person7");
        System.out.println(person1);
        //通过类型获取对象
        /*Person person2 = context.getBean(Person.class);
        System.out.println(person2);*/

        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring_config.xml"));
        //Person person2 = (Person) factory.getBean("person2");
        //通过id+类型获取对象
        /*Person person3 = (Person) factory.getBean("person1",Person.class);
        System.out.println(person3);*/

        FuZaDemo fz = context.getBean("fz", FuZaDemo.class);
        System.out.println(fz);
        context.close();
    }
}
