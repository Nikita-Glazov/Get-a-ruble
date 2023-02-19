public class Main {
    public static void main(String[] args) {

        int score = 100;
        int deposit = 2300;
        int bonus;
        int result;


        if (1000 <= deposit) {
            bonus = deposit / 100;
            result = score + deposit + bonus;

        } else {
            bonus = 0;
            result = score + deposit;
        }

        System.out.println("Итого на счету: " + result);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}