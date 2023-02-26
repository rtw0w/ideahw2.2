public class Main {

    public static void main(String[] args) {
        int amount = 55; // начальный счёт
        int refill = 1500; // сумма пополнения
        int precent;
        if (refill > 1000) {
            precent = 1 * refill / 100; // количество бонусных рублей
            System.out.println("Итоговый счёт:");
            System.out.println((amount + refill + precent) + " Сумма на Вашем счету");
        } else {
            System.out.println("Итоговый счёт:");
            System.out.println((amount + refill) + " Сумма на Вашем счету");
            System.out.println("Акция: пополните счёт более чем на 1000 рублей и получайте по 1 рублю за каждые 100 рублей");
        }
    }

}
