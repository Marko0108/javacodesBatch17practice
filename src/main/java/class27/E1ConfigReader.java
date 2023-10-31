package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        //Located the file
        //String path="C:\\Users\\Marko\\IdeaProjects\\JavaProject\\Files\\Config.properties";
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        //Moves the file from permanent storage into the RAM
        FileInputStream fis=new FileInputStream(path);
        //That one class/software that will assist us to read write data from the file
        Properties properties=new Properties();
        //loads the data from txt files into the properties object
        properties.load(fis);
        System.out.println(properties.get("userName"));
        System.out.println(properties.get("password"));
        //System.out.println(properties.get("url"));  output null - lowercase
        System.out.println(properties.get("URL"));

        System.out.println(System.getProperty("user.dir"));

    }
}
