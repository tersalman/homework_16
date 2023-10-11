public interface ServiceStation {
    public default void check(){
        System.out.println("Неопределенная проверка");
    }

}
