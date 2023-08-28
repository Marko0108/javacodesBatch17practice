package review4;

public class E1NestedLoop1 {
    public static void main(String[] args) {
                                                  //  m minutes s seconds m=j; s=i
            for (int m = 0; m < 60; m++) {

                for (int s = 0; s < 60; s++) {
                    if (s < 10 && m < 10) {

                        System.out.println("0"+m+":0"+s);
                    } else if (s >= 10 && m < 10) {
                        System.out.println("0"+m+":"+s);

                    } else {
                        System.out.println(m+":"+s);

                    }
                }
            }
        }
    }
