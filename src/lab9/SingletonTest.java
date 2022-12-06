package lab9;

public class SingletonTest {
    public static void main(String[] args) {

        // наивный не безопасный с ленивой инициализацией 0.0160461s
        MetalSmelter1 firstTest = MetalSmelter1.getInstance();
        System.out.println(firstTest.getClass());
        MetalSmelter1 second = MetalSmelter1.getInstance();
        System.out.println(firstTest == second);
        firstTest.fill();
        second.fill();
        firstTest.smelting();
        second.smelting();
        firstTest.drain();
        second.drain();
//
        // потокобезопасный без ленивой инициализации time 0.197256s
//        MetalSmelter2 first = MetalSmelter2.Instance;
//        System.out.println(first.getClass());
//        MetalSmelter2 second = MetalSmelter2.Instance;
//        System.out.println(first == second);
//        first.smelting();
//        second.smelting();
//        first.drain();
//        second.drain();

        // потокобезопасный с синхронизацией getInstance 0.0119844s
//        MetalSmelter3 first = MetalSmelter3.getInstance();
//        System.out.println(first.getClass());
//        MetalSmelter3 second = MetalSmelter3.getInstance();
//        System.out.println(first == second);
//        first.fill();
//        second.fill();
//        first.smelting();
//        second.smelting();
//        first.drain();
//        second.drain();

        //потокобезопасный с Double-Checked Locking 0.0161238s
//        MetalSmelter4 first = MetalSmelter4.getInstance();
//        System.out.println(first.getClass());
//        MetalSmelter4 second = MetalSmelter4.getInstance();
//        System.out.println(first == second);
//        first.fill();
//        second.fill();
//        first.smelting();
//        second.smelting();
//        first.drain();
//        second.drain();

        //на основе enum 0.0147642s
//        System.out.println(MetalSmelter5.INSTANCE);
//        System.out.println(MetalSmelter5.INSTANCE);
//        MetalSmelter5.INSTANCE.fill();
//        MetalSmelter5.INSTANCE.fill();
//        MetalSmelter5.INSTANCE.smelting();
//        MetalSmelter5.INSTANCE.smelting();
//        MetalSmelter5.INSTANCE.drain();
//        MetalSmelter5.INSTANCE.drain();

        //на основе внутренних классов 0.0142172s
//        MetalSmelter6 first = MetalSmelter6.getInstance();
//        System.out.println(first.getClass());
//        MetalSmelter6 second = MetalSmelter6.getInstance();
//        System.out.println(first == second);
//        first.fill();
//        second.fill();
//        first.smelting();
//        second.smelting();
//        first.drain();
//        second.drain();
    }
}
