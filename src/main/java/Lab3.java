import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;


public class Lab3 {

    public static <T> Iterable<T> filter(Iterable<T> iterable, Predicate<? super T> provision) {
        ArrayList<T> result_list = new ArrayList<>();
        Iterator<T> iterator = iterable.iterator();
        T Value;
        while(iterator.hasNext()) {
            Value = iterator.next();
            if(provision.test(Value))
                result_list.add(Value);
        }
        return result_list;
    }
    public static <F, T> Iterable<T> transform(Iterable<F> iterable, Function<? super F, ? extends T> function)
    {
        ArrayList<T> result_list = new ArrayList<>();
        Iterator<F> iterator = iterable.iterator();
        F Value;
        while(iterator.hasNext()){
            Value = iterator.next();
            result_list.add(function.apply(Value));
        }
        return result_list;
    }

}
