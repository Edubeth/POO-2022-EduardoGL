package Generic;

public class Utilities {
    public static <T, U> boolean compare(T firstTuple, U secondTuple) {
        if (firstTuple instanceof GenericTupla && secondTuple instanceof GenericTupla) {
            GenericTupla myTuple = (GenericTupla) firstTuple;
            GenericTupla anotherTuple = (GenericTupla) secondTuple;
            return myTuple.getKey().equals(anotherTuple.getKey()) && myTuple.getValue().equals(anotherTuple.getValue());
        }
        return false;
    }
}
