package service.wwtest;

public class Father {
        public String hight;
        public Integer age;
        public String work;

        public void myWork(){
                System.out.println("南瓜");
        }

        public void myAge(){
                System.out.println(55);
        }

        public String getHight() {
                return hight;
        }

        public void setHight(String hight) {
                this.hight = hight;
        }

        public Integer getAge() {
                return age;
        }

        public void setAge(Integer age) {
                this.age = age;
        }

        public String getWork() {
                return work;
        }

        public void setWork(String work) {
                this.work = work;
        }
}