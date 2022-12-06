package lab12.secondTask;

public class test {
    public static void main(String[] args) {
        Worker worker =new Worker.Builder("2",  "Absolyamov").makeSalary(5000).makeHealthGroup(2).makeSalary(10000).build();
        System.out.println(worker);
        System.out.println( new Worker.Builder("2", "Monitor").build());
    }
}
