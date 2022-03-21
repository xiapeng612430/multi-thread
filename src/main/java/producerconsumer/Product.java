package producerconsumer;

/**
 * @author xianpeng.xia
 * on 2022/3/21 9:15 PM
 * 生产者
 */
public class Product {

    public int no;

    public Product(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Product{" + "no=" + no + '}';
    }
}
