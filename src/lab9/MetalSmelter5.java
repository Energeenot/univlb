package lab9;

public enum MetalSmelter5 {
    INSTANCE;

    MetalSmelter5(){
        System.out.println("Singleton created");
    }
    private boolean empty = true;
    private boolean smelt = false;

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
