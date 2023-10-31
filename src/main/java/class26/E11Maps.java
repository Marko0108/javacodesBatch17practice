package class26;

import java.util.TreeMap;

public class E11Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("Lipsticks", 22.0);
        makeup.put("BlushOn", 40.0);
        makeup.put("Base", 50.5);
        makeup.put("Foundation", 90.5);
        makeup.put("EyeLiner", 25.5);
        makeup.put("Concealer", 35.5);
        makeup.put("EyeLiner", 25.5);
        makeup.entrySet().removeIf(x->x.getKey().contains("a"));
        System.out.println(makeup);
    }
}