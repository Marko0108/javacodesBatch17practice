package review13;

import utils.ConfigReader;

public class E3Config {
    public static void main(String[] args) {
        System.out.println(ConfigReader.getProperty("C:\\Users\\Marko\\IdeaProjects\\JavaProject\\src\\Test.properties","name"));
    }
}
