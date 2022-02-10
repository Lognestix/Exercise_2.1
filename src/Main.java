public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10_000; //Стоимость билета в рублях
        int minimalAmount = 20;  //Минимальное количество рублей для получения одной бонусной мили

        int bonusCalculation = ticketPrice / minimalAmount; //Расчет бонусных миль
        System.out.println(bonusCalculation);
    }
}
