import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map1 map11 = new Map1(new HashMap<>());
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("A", 1);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("C", 3);
        Map1 map12 = new Map1(map2);
        map12.mapAd("A", 2);
        System.out.println(map12);

        Random random1 = new Random();
        List<Integer> numbs = new ArrayList<>(3);
        while (numbs.size() < 3) {
            Integer numb = random1.nextInt(1000);
            numbs.add(numb);
        }
        System.out.println(numbs);

        Map<String, List<Integer>> str1 = new HashMap<>();
        str1.put("S1", numbs);
        str1.put("S2", List.of(2,4,6));
        str1.put("S3", List.of(21,16,46));
        str1.put("S4", List.of(153,158,588));
        str1.put("S5", List.of(145,866,848));
        System.out.println(str1);

        Map<String, Integer> str2 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> num: str1.entrySet()) {
            int sum = 0;
            for (int i = 0; i < num.getValue().size(); i++) {

                sum = num.getValue().get(i) + sum;
            }
            str2.put(num.getKey(), sum);
        }
        System.out.println(str2);

        Map<Integer, String> str3 = new LinkedHashMap<>();
        str3.put(1, "A");
        str3.put(2, "B");
        str3.put(3, "C");
        str3.put(4, "D");
        str3.put(5, "E");
        str3.put(7, "F");
        str3.put(8, "G");
        str3.put(9, "H");
        str3.put(10, "I");
        str3.put(6, "J");
        System.out.println(str3);
    }
}