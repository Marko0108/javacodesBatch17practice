package Class15;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chrome=new ChromeDriver();
        chrome.navigate().to("https://www.bing.com/images/search?view=detailV2&ccid=DF2Vs0lc&id=AFA7A2924962E17606C5A5EB5C010E8DB5408804&thid=OIP.DF2Vs0lcyBh5InMM7YyRzAAAAA&mediaurl=https%3a%2f%2fi.pinimg.com%2foriginals%2f89%2f7e%2fbc%2f897ebcc83e05a7e44f060a7781732647.gif&cdnurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.0c5d95b3495cc8187922730ced8c91cc%3frik%3dBIhAtY0OAVzrpQ%26pid%3dImgRaw%26r%3d0&exph=400&expw=400&q=cat+in+pool+gif&simid=608050718346649438&FORM=IRPRST&ck=82AEFFC095DE857EFC4F37875462458D&selectedIndex=2&ajaxhist=0&ajaxserp=0");
        System.out.println(chrome.getTitle());
        Thread.sleep(3000);
        chrome.navigate().to("https://www.bing.com/images/search?view=detailV2&ccid=GjCFYwAM&id=85FC84002C6F70CFEF1E85A832D17F7DD12C2410&thid=OIP.GjCFYwAMXNyAF4KwlE2WUgAAAA&mediaurl=https%3A%2F%2Fmedia.giphy.com%2Fmedia%2FjbKf1K7MhK5DErbeXY%2Fgiphy.gif&cdnurl=https%3A%2F%2Fth.bing.com%2Fth%2Fid%2FR.1a308563000c5cdc801782b0944d9652%3Frik%3DECQs0X1%252f0TKohQ%26pid%3DImgRaw%26r%3D0&exph=300&expw=300&q=cat+in+pool+gif&form=IRPRST&ck=8A4F603939097C7F614DF34212EBC22F&selectedindex=0&ajaxhist=0&ajaxserp=0&pivotparams=insightsToken%3Dccid_jVT95hkm*cp_C97BB6DAF42D5CBAA0ED0713D715DD73*mid_85FC84002C6F70CFEF1E688DC66258174D20865E*simid_608029638671087453*thid_OIP.jVT95hkmYErcvloc6VO9WwAAAA&vt=0&sim=11&iss=VSI&ajaxhist=0&ajaxserp=0");
        Thread.sleep(3000);
        chrome.navigate().refresh();
        Thread.sleep(3000);
        chrome.navigate().back();
        Thread.sleep(3000);
        chrome.close();
    }
}
