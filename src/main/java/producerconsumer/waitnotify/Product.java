package producerconsumer.waitnotify;

/**
 * @author xianpeng.xia
 * on 2022/3/13 4:29 PM
 */
public class Product {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
