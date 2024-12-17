import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaWithStreamExample {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(5,80,46,27,38);
        System.out.println(list1);
        List<Integer> evenList1 = new ArrayList<>();

        for(Integer i : list1){
            if(i%2==0){
                evenList1.add(i);
            }
        }
        System.out.println("without stream: " + evenList1);

        List<Integer> evenList2 = list1.stream()
                .filter(i->i%2==0)
                .toList();

        System.out.println("With stream: " + evenList2);
    }
}
