package lesson4.Task1;

//Переписать задачу о сезонах на enum реализацию (switch)

public class SearchSeason {
    public static void main(String[] args) {

        Month month = Month.APRIL;

        switch (month){
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println(Season.WINTER);
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println(Season.SPRING);
                break;
            case JULY:
            case JUNE:
            case AUGUST:
                System.out.println(Season.SUMMER);
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println(Season.AUTUMN);
                break;
            default:
                System.out.println("Please, check the correctness of the entered text/Пожалуйста, проверьте правильность введенного текста");
        }
    }
}
