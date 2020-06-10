package service.wwtest;

/**
 * Created by wangwu on 2020/6/5.
 */
public enum Phone {
    APPLE("apple",5000.00,"ios"),
    MI("mi",2000.00,"MU"),
    HUAWEI("huawei",4000.00,"hongmeng");

    private String name;
    private Double price;
    private String os;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }


    private Phone(String name,Double price,String os){
        this.name=name;
        this.os=os;
        this.price=price;
    }

    public static void main(String[] args) {
        System.out.println(Phone.APPLE.getName());
    }

}
