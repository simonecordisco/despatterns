public class Factory {
    public static Forma getShape(Enum1 enum1){
        switch (enum1){
            case CERCHIO -> {
                return new Cerchio("cerchio",0);
            }
            case RETTANGOLO -> {
                return new Rettangolo("rettangolo",4);
            }
            case TRIANGOLO -> {
                return new Triangolo("triangolo",3);
            }
            default -> throw new IllegalArgumentException("tipo di forma non valido");

        }
    }
}
