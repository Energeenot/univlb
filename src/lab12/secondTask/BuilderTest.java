package lab12.secondTask;

public interface BuilderTest {
    public static void main(String[] args) {
        System.out.println(new Worker.Builder("100", "Abramov Ivan").makeSalary(100).build());
        System.out.println(new Worker.Builder("200", "Aksenov").makeCategory("what").makeHealthGroup(2).build());

        Worker worker=new Worker.Builder("150", "Semenov").makeSalary(100000).makePost("General").makeDepartmentName("department name").build();

        //тут так уже не получится
//        Worker someClass = new Worker(new Worker.Builder(2, "Abramov Ivan"));
    }
}
