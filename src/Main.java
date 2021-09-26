public class Main {
    public static void main(String[] args) {

        int clientWallet = 100;
        int addMoney = 1100;

        int bonus;
        if (addMoney >= 1000) {
            bonus = addMoney / 100;
        } else {
            bonus = 0;
        }

        int total = clientWallet + addMoney + bonus;
        System.out.println("Бонусных рублей: " + bonus);
        System.out.println("Итоговая сумма: " + total);


    }


}

