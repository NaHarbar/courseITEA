package homework.third;

public class Month {

    public void showNumberOfDaysInMonth(int month) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 10:
                System.out.println("30 days in month " + month);
                break;
            case 2:
                System.out.println("28 days in month " + month);
                break;
            default:
                System.out.println("31 days in month " + month);
                break;
        }
    }

}
