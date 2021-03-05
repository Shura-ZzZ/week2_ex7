import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class prog {
    public static void main(String[] args) {
       LinkedStack<Integer> st = new LinkedStack<>();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       System.out.println(st.size());
       List<Integer> nst = st.stream().collect(Collectors.toList());
      System.out.println(nst);
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        String joinCollectTest = list.stream()
                .collect(new StringCollector(", ", "[", "]"));

        System.out.println("С помощью collect: " + joinCollectTest);



    }
}
