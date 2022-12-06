package lab12.secondTask;

import java.util.Objects;

public class Worker {

    //обязательные поля
    public final String serviceNumber;
    public final String fio;
    //необязательные поля
    private int salary;
    private String post;
    private String category;
    private int healthGroup;
    private String departmentName;
    private String projectName;


    //конструктор стал приватным -> значит может вызываться только из самого класса
    private Worker(Builder builder) {
        serviceNumber = builder.serviceNumber;
        fio = builder.fio;
        salary = builder.salary;
        post = builder.post;
        category = builder.category;
        healthGroup = builder.healthGroup;
        departmentName = builder.departmentName;
        projectName = builder.projectName;
    }


    //вместо конструктора внутренний статкласс, по сути статическая фабрика
    //хотя и статический, но вложенный, поэтому имеет доступ к конструктору
    public static class Builder {
        //поля "в которых уверены" можно задавать и обычным способом
        private final String serviceNumber;
        private final String  fio;
        private int salary =0; //есть дефолтная реализация
        private String post;
        private String category;
        private int healthGroup = 1;
        private String departmentName;
        private String projectName;


        public Builder(String serviceNumber, String  fio) {
            if (Objects.equals(serviceNumber, "") || Objects.equals(fio, "")){
                System.out.println("service number and fio must not be empty");
                System.exit(1);
            }
            this.serviceNumber = serviceNumber;
            this.fio = fio;
        }

        //методы похожи на сеттеры
        public Builder makeSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder makePost(String post) {
            this.post = post;
            return this;
        }

        public Builder makeCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder makeHealthGroup(int healthGroup) {
            this.healthGroup = healthGroup;
            return this;
        }

        public Builder makeDepartmentName(String departmentName){
            this.departmentName = departmentName;
            return this;
        }

        public Builder makeProjectName(String projectName){
            this.projectName = projectName;
            return this;
        }

        //вишенка на торте
        public Worker build() {
            return new Worker(this);
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "service number " + serviceNumber +
                ", fio " + fio +
                ", salary " + salary +
                ", post " + post +
                ", category " + category +
                ", health group " + healthGroup +
                ", department name " + departmentName +
                ", project name " + projectName +
                '}';
    }

    public static void main(String[] args) {
        //Тут внутри такая форма возможна
        System.out.println(new Worker(new Worker.Builder("2", "Evgeniev").makeSalary(50000)));
        Worker s =  (new Worker.Builder("12", "Evgenievich").makeSalary(50000)).build();
        System.out.println(s);
    }
}