package enumkeyword;

enum EnumDays {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5);

    public int value;

    private EnumDays(int value){
        this.value = value;
    }
}

public class Main {

    // private static final int MONDAY = 1;
    // private static final int TUESDAY = 2;
    // private static final int WEDNESDAY = 3;
    

    public static void main(String[] args) {

        // int day = 5;
        EnumDays day = EnumDays.MONDAY;

        switch(day){
            case MONDAY:
                System.out.println("It's a monday!");
                break;
            case TUESDAY:
                System.out.println("It's a tuesday!");
                break;
            case WEDNESDAY:
                System.out.println("It's a wednesday!");
                break;
            case THURSDAY:
                System.out.println("It's a thursday!");
                break;
            case FRIDAY:
                System.out.println("It's a friday!");
                break;
            default:
                System.out.println("No life...");
                
        }

        for(EnumDays dayTemp: EnumDays.values()){
            System.out.println(dayTemp + " : " + dayTemp.ordinal());
        }

    }
    
}
