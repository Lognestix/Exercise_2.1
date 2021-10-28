# Код Java находящийся в этом репозитории

```Java
public class Main {
    public static void main(String[] args) {
        int ticketPrice = 7_019; //Стоимость билета в рублях
        int minimalAmount = 20;  //Минимальное количество рублей для получения одной бонусной мили

        int bonusCalculation = ticketPrice / minimalAmount; //Расчет бонусных миль
        System.out.println(bonusCalculation);
    }
}
```