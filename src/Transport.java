public interface Transport {
    public default void check(){
        System.out.println("Неопределенная проверка");
    }

}
