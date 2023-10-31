package class11;

public class T3StringMethodsSplitMethod1 {
    public static void main(String[] args) {

        String str="Hi There how are you.I am Good. I am Driving";
        String []strs=str.split("[.]");
        //System.out.println(strs.length);
        System.out.println(strs[2]);  //first sentence without .
        System.out.println(strs[2].trim());




    }

}
