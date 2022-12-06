package lab9;

public class MetalSmelter2 {
    public static final MetalSmelter2 Instance = new MetalSmelter2();
    private boolean empty;
    private boolean smelt;

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
