public class Main {
    public static void main(String[] args) {

// Задание 1.1.
        int Vklad = 15_000;     // Ежемесячное пополнение банковской суммы;
        int Summa_Bank = 0;     // Сумма накоплений;
        int Month = 0;              // Счётчик месяцев;
        while (Summa_Bank <= 2_459_000) {
            Month ++;
            Summa_Bank = Summa_Bank + (Summa_Bank/100) + Vklad;
            System.out.println(Summa_Bank + " руб.");
        }
        System.out.println("Прошёл месяц " + Month + ", сумма накоплений равна " + Summa_Bank + " рублей.");
        System.out.println("-----------------------");

// Задание 1.2.
        int i = 0;
        while (i < 10) {
            i ++;
            System.out.print(i + " ");
        }
        System.out.println("");
        for (; i >=1 ; i--) {
            System.out.print(i + " ");
        }
        System.out.println('\n' + "-----------------------");

// Задание 1.3.
        int population = 12_000_000;    // Население страны Y;
        int natality = 17;              // Рождаемость на 1000 чел.;
        int mortality = 8;              // Смертность на 1000 чел.;
        int IncreasePopulation = (natality - mortality) * population / 1000;
        for (int f = 1; f <=10 ; f++) {
            population = population + IncreasePopulation;
            System.out.println("Год " + f + ". Численность населения составляет " + population + " человек.");
        }
        System.out.println("-----------------------");

// Задание 2.1.
        double SummSchetBank = 15_000;  // Cумма на счёте в банке;
        int month = 1;
        while (SummSchetBank <= 12_000_000) {
            SummSchetBank = SummSchetBank + SummSchetBank * 0.07;
            SummSchetBank = Math.round(SummSchetBank * 100.0) / 100.0;
            System.out.println("Сумма накоплений " + SummSchetBank + " руб. Месяц " + month);
            month ++;
        }
        System.out.println("-----------------------");

// Задание 2.2.
        double SummSchetBank_2 = 15_000;  // Cумма на счёте в банке;
        int month_2 = 0;
        while (SummSchetBank_2 <= 12_000_000) {
            month_2 ++;
            SummSchetBank_2 = SummSchetBank_2 + SummSchetBank_2 * 0.07;
            SummSchetBank_2 = Math.round(SummSchetBank_2 * 100.0) / 100.0;
            if (month_2 % 6 == 0) {
                System.out.println("Сумма накоплений " + SummSchetBank_2 + " руб. Месяц " + month_2);
            }
        }
        System.out.println("Ожидаемая сумма накоплений " + SummSchetBank_2 + " руб. Месяц " + month_2);
        System.out.println("-----------------------");

// Задание 2.3.
        double SummSchetBank_3 = 15_000;  // Cумма на счёте в банке;
        int month_3 = 1;
        while (month_3 <= 108) {
            SummSchetBank_3 = SummSchetBank_3 + SummSchetBank_3 * 0.07;
            SummSchetBank_3 = Math.round(SummSchetBank_3 * 100.0) / 100.0;
            if (month_3 % 6 == 0) {
                System.out.println("Сумма накоплений " + SummSchetBank_3 + " руб. Месяц " + month_3);
            }
            month_3 ++;
        }
        System.out.println("-----------------------");

// Задание 2.4.
        int Friday = 5;
        for (; Friday < 31 ; Friday = Friday + 7) {
            System.out.println("Сегодня пятница, " + Friday + "-е число. Необходимо поготовить отчёт.");
        }
        System.out.println("-----------------------");

// Задание 3.1.
        int IntYearCometFly = 79;
        int OurYear = 2022;
        for (; IntYearCometFly <= 2132; IntYearCometFly = IntYearCometFly + 79) {
            if (IntYearCometFly >= 1822 && IntYearCometFly <= OurYear) {
                System.out.println(IntYearCometFly + " год. Прилетала комета");
            }
            if (IntYearCometFly > OurYear && IntYearCometFly <= 2132) {
                System.out.println(IntYearCometFly + " год. Ещё разок залетит.");
            }
        }
        System.out.println("-----------------------");

// Задание 3.2.
        for (int a = 1; a <= 10; a++) {
            System.out.println("2 * " + a + " = " + a*2);
        }
        System.out.println("-----------------------");
    }
}