package come.xdkj.bean;

import java.util.Date;

/**
 * @author mr su
 * @create 2019-11-27 15:03
 */
public class Person {
    private Integer pid;
    private String pname;
    private Integer page;
    private Date birthday;
    private Car car;

    public Person() {
        System.out.println("我是Person无参构造呀");
    }

    public Person(Integer pid, String pname, Integer page) {
        this.pid = pid;
        this.pname = pname;
        this.page = page;
    }

    public Person(Integer pid, String pname, Integer page, Date birthday, Car car) {
        this.pid = pid;
        this.pname = pname;
        this.page = page;
        this.birthday = birthday;
        this.car = car;
    }

    public Integer getPid() {
        return pid;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public void init(){
        System.out.println("正在初始化呀");
    }
    public void destory(){
        System.out.println("正在销毁对象呀");
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", page=" + page +
                ", birthday=" + birthday +
                ", car=" + car +
                '}';
    }
}
