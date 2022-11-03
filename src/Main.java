public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int saving1 = 15000;
        int total1 = 0;
        int month = 1;
        while (total1 < 2_459_000) {
            total1 = total1 + total1 / 100;
            total1 = total1 + saving1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total1 + " реблей.");
            month++;
        }
        System.out.println("Задание 2");
        int i1 = 1;
        while (i1<=10){
            System.out.print(i1 + " ");
            i1++;}
            System.out.println();
        for (i1 = 10; i1 >= 1; i1--) {
            System.out.print(i1 + " ");}
            System.out.println();

        System.out.println("Задание 3");
        int totalPopulation = 12_000_000;
        int mortality = 0;
        int fertility = 0;
        int i = 1;
        for (i = 1; i <= 10; i++){
            mortality = totalPopulation / 1000 * 8;
            fertility = totalPopulation / 1000 * 17;
            totalPopulation = totalPopulation + fertility - mortality;
            System.out.println("Год " + i + " численность населения составляет " + totalPopulation);
        }
        System.out.println("Задание 4 - 5");
        int percent = 7;
        int deposit = 15_000;
        int month2 = 1;
        while (deposit < 12_000_000){
           deposit += (deposit * percent/100);
           month2++;
           if (month2 %6 ==0){
            System.out.println("Месяц " + month2 + ", сумма накоплений равна " + deposit);}
        }
        System.out.println("Задание 6");
        int percent1 = 7;
        int deposit1 = 15_000;
        int month3 = 1;
        while (month3 < 108 ) {
            deposit1 += (deposit1 * percent1/100);
            month3++;
            if (month3 % 6 ==0){
                System.out.println("Месяц " + month3 + ", сумма накоплений равна " + deposit1);}
        }
        System.out.println("Задание 7");
        int friday = 1;
        for (int day = 1; day < 31; day++){
            if (day % 7 == friday){
                System.out.println("Сегодня " + day+ "-е. Нужен отчёт.");
            }
        }

    }
}