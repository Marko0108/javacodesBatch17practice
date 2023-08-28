package review3;

public class E2LogicalOperators {
    public static void main(String[] args) {

        boolean isMeat=false;                   // checks multiple conditions
        boolean isEgg=true;
        boolean isFish=false;
        boolean milk=true;
        boolean vegies=true;

        boolean isProtein=isEgg||isMeat||isFish;
        boolean isGoodDiet=(isEgg||isMeat||isFish)&&milk&&vegies;
        System.out.println(isProtein);
        System.out.println(isGoodDiet);

    }
}
