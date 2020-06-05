package service.wwtest;

public interface Fruit {
         void eat();
         void see();
        default void he(){
            System.out.println("我是 fruit里面的he");
        }
    void he1();

}