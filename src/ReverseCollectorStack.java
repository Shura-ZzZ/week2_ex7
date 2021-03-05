import java.util.ArrayList;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;


public class ReverseCollectorStack<T, A extends Stack<T>> implements Collector<T, LinkedStack<T>, A> {


    ArrayList<T> resource;
    Stack<T> tStack;
    A stack;
     public ReverseCollectorStack(A stack)
    {
        this.stack = stack;
        resource = new ArrayList<>();

    }
    @Override
    public Supplier<LinkedStack<T>> supplier() {
        return  LinkedStack::new;
    }

    @Override
    public BiConsumer<LinkedStack<T>, T> accumulator() {

        return Stack::push;
    }

    @Override
    public BinaryOperator<LinkedStack<T>> combiner() {
        return (a, b) -> {
            while (!a.empty()) {
                b.push(a.pop());
            }
            return b;
        };
    }

    @Override
    public Function<LinkedStack<T>, A> finisher() {
        return x -> {
            resource.
            while (!x.empty()) {
                resource.(x.pop());
            }


        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return null;
    }



}
