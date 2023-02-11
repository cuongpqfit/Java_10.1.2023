import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lesson8_Map {

    public static void main(String[] args) {
        //[index] => value
        //key => value
        Map<String, Integer> map = new HashMap<>();
        map.put("So1", 1);
        map.put("So2", 2);
        map.put("So3", 3);

        map.put("So2", 4);

        System.out.println(map);
        System.out.println(map.get("So3"));
        System.out.println(map.get("So4"));
        //{So1=1, So3=3, So2=2}

        map.forEach((key, item) -> System.out.println(item));

    }
}
