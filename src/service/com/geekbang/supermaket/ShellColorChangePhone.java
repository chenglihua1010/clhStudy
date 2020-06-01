package service.com.geekbang.supermaket;

public class ShellColorChangePhone extends Phone {
        private boolean enableShellColorChange;

        public ShellColorChangePhone(String name, String id, int count, double soldPrice, double purchasePrice,
                                     double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os) {
                super(name, id, count, soldPrice, purchasePrice, screenSize, cpuHZ, memoryG, storageG, brand, os);
                enableShellColorChange = false;
        }

        public boolean isEnableShellColorChange() {
                return enableShellColorChange;
        }

        public void setEnableShellColorChange(boolean enableShellColorChange) {
                this.enableShellColorChange = enableShellColorChange;
        }


        public void describe() {
                super.describe();
                System.out.println("壳色随着屏幕色变的功能开启状态：" + enableShellColorChange);
        }


        public double calculateProfit() {
                // TODO 厂家提供10个点的返点
                return super.calculateProfit() + super.getPurchasePrice() * 0.1;
        }
        public double buy (int count ){
                System.out.println("ShellColorChangePhone里的buy(int count)");
                if (count<2){
                        System.out.println("买一送一了解一下，不单卖");
                        return -1;
                }
                return super.buy(count );
        }

        public static void staticNoOerrride(){
                System.out.println("staticNoOerrride in ShellColorChangePhone");
        }
}