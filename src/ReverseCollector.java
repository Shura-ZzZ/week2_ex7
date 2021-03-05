import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class ReverseCollector<T, A extends Collection<T>> implements Collector<A, ArrayList<A>, Collection<A>> {




    @Override
    public Supplier<ArrayList<A>> supplier() {
        return  ArrayList::new;
    }

    @Override
    public BiConsumer<ArrayList<A>, A> accumulator() {
        return ArrayList::add;
    }

    @Override
    public BinaryOperator<ArrayList<A>> combiner() {
        return (x, y) -> {
            x.addAll(y);
            return x;
        };
    }

    @Override
    public Function<ArrayList<A>, Collection<A>> finisher() {
        return x -> {
            Collection<T> fin =
        }
    }

    @Override
    public Set<Characteristics> characteristics() {
        return EnumSet.of(Characteristics.UNORDERED);
    }
}
