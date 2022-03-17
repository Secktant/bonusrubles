public class Main {
    public static void main(String[] args) {

        //Входные данные
        int initialAccount = 100; //счёт
        int depositAmount = 1000; //пополнение

        //Логика
        int numberOfBonuses = depositAmount / 100; //количество бонусов
        int accountWithoutBonuses = initialAccount + depositAmount; //счёт без бонусов
        if (numberOfBonuses >= 10) {
            int finalScore = accountWithoutBonuses + numberOfBonuses; //счёт с бонусами
            System.out.println("Общий счёт составил: " + finalScore + " рублей"); // счёт + бонусы
            System.out.println("Количество бонусных рублей составляет: " + numberOfBonuses + " рублей"); //количество бонусов
        } else {
            System.out.println("Общий счёт составил: " + accountWithoutBonuses + " рублей"); //счёт без бонусов
        }

    }
}