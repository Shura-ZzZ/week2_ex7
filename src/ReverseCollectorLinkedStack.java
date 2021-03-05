import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.EnumSet;

public class ReverseCollectorLinkedStack implements Collector<Integer,LinkedStack<Integer>, LinkedStack<Integer>> {


     public ReverseCollectorLinkedStack()
    {

    }

    @Override
    public Supplier<LinkedStack<Integer>> supplier() {
        return ()->new LinkedStack<Integer>();
    }

    @Override
    public BiConsumer<LinkedStack<Integer>, Integer> accumulator() {
        return LinkedStack::push;
    }

    @Override
    public BinaryOperator<LinkedStack<Integer>> combiner() {
        return (a, b) -> {
            System.out.println();
            while (!a.empty()) {
                b.push(a.pop());
            }
            return b;
        };
    }

    @Override
    public Function<LinkedStack<Integer>, LinkedStack<Integer>> finisher() {
        return x -> {
            LinkedStack<Integer> end= new LinkedStack<>();
            while (!x.empty()) {
                end.push(x.pop());
            }
            return end;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return EnumSet.of(Characteristics.CONCURRENT);
    }
}
