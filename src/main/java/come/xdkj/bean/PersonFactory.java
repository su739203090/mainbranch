package come.xdkj.bean;

/**
 * @author mr su
 * @create 2019-11-27 15:47
 */
public class PersonFactory {
    //普通方法
    public Person createPerson(){
        return new Person();
    }
    //静态方法
    public static Person createPerson2(){
        return new Person();
    }
}
