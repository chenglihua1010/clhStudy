package service.wwtest;

/**
 * Created by wangwu on 2020/6/3.
 */
public class Blue implements ColorEntity{
    private String duibidu;
    private Integer zishu;
    private Integer price;

    public String getDuibidu() {
        return duibidu;
    }

    public void setDuibidu(String duibidu) {
        this.duibidu = duibidu;
    }

    public Integer getZishu() {
        return zishu;
    }

    public void setZishu(Integer zishu) {
        this.zishu = zishu;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
