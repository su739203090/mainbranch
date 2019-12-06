package come.xdkj.bean;

/**
 * @author mr su
 * @create 2019-11-27 16:36
 */
public class Car {
    private String cname;
    private String color;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cname='" + cname + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
