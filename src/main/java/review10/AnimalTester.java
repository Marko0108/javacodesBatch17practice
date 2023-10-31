package review10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AnimalTester {
    public static void main(String[] args) {
        /*Animal animal = new Animal();
        animal.speak();
        animal.eat();
        Dog dog = new Dog();
        dog.speak();
        dog.eat();
*/
        Animal [] arr = { new Cat(), new Dog()};           //polymorphism

        for (Animal a: arr) {
            a.eat();
            a.speak();
        }

        /*ChromeDriver c= new ChromeDriver();
        c.manage().window().maximize();
        c.get("https://amazon.com");
        c.getTitle();

        FirefoxDriver f= new FirefoxDriver();
        f.manage().window().maximize();
        f.get("https://amazon.com");
        f.getTitle();

        EdgeDriver e= new EdgeDriver();
        e.manage().window().maximize();
        e.get("https://amazon.com");
        e.getTitle();*/

        WebDriver[] webDrivers={new ChromeDriver(),new FirefoxDriver(),new EdgeDriver()};
        for (int i = 0; i < webDrivers.length; i++) {
            WebDriver w=webDrivers[i];
            w.manage().window().maximize();
            w.get("https://amazon.com");
            System.out.println(w.getTitle());
            w.quit();

        }

    }
}
