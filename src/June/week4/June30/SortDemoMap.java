package June.week4.June30;

import java.util.*;

public class SortDemoMap {

    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();

        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("six", 12);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
//        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//
////
//
////            @Override
////            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
////                return o1.getKey().compareTo(o2.getKey());
////            }
////        });
//            for (Map.Entry<String, Integer> entry : entries) {
//                System.out.println(entry.getKey() + " " + entry.getValue());
//            }




//        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);



//        Map<Employee, Integer> employeeMap = new TreeMap<>(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int)(o1.getSalary()- o2.getSalary());
//            }
        Map<Employee, Integer> employeeMap = new TreeMap<>((o1,o2)->(int)(o2.getSalary()-o1.getSalary()));
        employeeMap.put(new Employee(101, "Ajay","It", 50000), 16);
        employeeMap.put(new Employee(134, "Ravi", "Civil",48000), 27);
        employeeMap.put(new Employee(323, "Neha","defence", 52000), 36);
        employeeMap.put(new Employee(652, "Meena","forensic", 51000), 45);
        employeeMap.put(new Employee(345, "Arun","air", 47000), 55);

        System.out.println(employeeMap);


employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)));

        }
    }
