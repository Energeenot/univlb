package lab9;

public class MetalSmelter6 {
    private boolean empty;
    private boolean smelt;

    private MetalSmelter6(){
        empty = true;
        smelt = false;
        System.out.println("Singleton created!");
    }

    private static class SingletonHolder{
        public static final MetalSmelter6 HOLDER_INSTANCE = new MetalSmelter6();
    }

    public static MetalSmelter6 getInstance(){
        return SingletonHolder.HOLDER_INSTANCE;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isSmelt() {
        return smelt;
    }
    public void fill(){
        if(isEmpty()){
            empty = false;
            smelt = false;
            System.out.println("Заполнение плавильщика металла");
        }
    }

    public void drain(){
        if (!isEmpty() && isSmelt()){
            System.out.println("Сливаем расплавленный металл");
            empty = true;
        }
    }

    public void smelting(){
        if (!isEmpty() && !isSmelt()){
            System.out.println("Плавим металл");
            smelt = true;
        }
    }
}
