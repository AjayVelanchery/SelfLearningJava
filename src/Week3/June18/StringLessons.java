package Week3.June18;

public class StringLessons {

    public static void main(String[] args) {


        String s = "Ajay is learning java";
        String s2 = "Ajay is learning java";
        String s1 = "and python";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.substring(0, 5));
        System.out.println(s.substring(17));
        System.out.println(s.indexOf("jay"));
        System.out.println(s.indexOf("java", 10));
        System.out.println(s1.lastIndexOf("py", 200));
        System.out.println(s.concat(s1));
        System.out.println(s.equals(s1));
        System.out.println(s.compareTo(s1));
        System.out.println(s2.toLowerCase());
        System.out.println(s1.replace("and", "and also"));
        System.out.println(s.replace('j', 'd'));
        System.out.println(s.replace(" ", "_"));
        System.out.println(s.contains("Ajay"));
        System.out.println(s.startsWith("Ajay"));
        String result = String.join("-", "Java", "Python", "C++");
        System.out.println(result);
    }}
