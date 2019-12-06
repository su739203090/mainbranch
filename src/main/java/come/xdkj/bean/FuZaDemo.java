package come.xdkj.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author mr su
 * @create 2019-11-27 16:54
 */
public class FuZaDemo {
    private Integer [] ids;

    private List<String> list;

    private Map<Integer,String> maps;

    //配置类
    private Properties prop;


    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<Integer, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<Integer, String> maps) {
        this.maps = maps;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "FuZaDemo{" +
                "ids=" + Arrays.toString(ids) +
                ", list=" + list +
                ", maps=" + maps +
                ", prop=" + prop +
                '}';
    }
}
