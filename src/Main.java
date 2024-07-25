public class Main {
    public static void main(String[] args) {
        //task1
        double percent = 1.01;
        int sum = 0;
        int accum = 15_000;
        int month = 0;
        while(sum<=2_459_000){
            month++;
            sum+=accum;
            sum+=sum*percent;
            System.out.println("Месяц "+month+", сумма накоплений равна "+sum+" рублей");
        }

        //task2
        int numForWhile = 0;
        while (numForWhile<10){
            numForWhile++;
            System.out.print(numForWhile+" ");
        }
        System.out.println();
        for(int i =10; i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println();

        //task3
        int population = 12_000_000;
        int birth = 17;
        int death = 8;
        int people = birth-death;
        int populationYear = population/1000*people;
        int year = 0;
        while(year<10){
            population+=populationYear;
            year++;
            System.out.println("Год "+year+", численность населения составляет "+population);
        }

        //task4
        int initialDeposit = 15_000;
        int sevenPercentFromDeposit = initialDeposit/100*7;
        int needSum = initialDeposit;
        int month2 = 0;
        while(needSum<12_000_000){
            month2++;
            needSum+=sevenPercentFromDeposit;
            if (month2 % 6 == 0) {//добавленое условие из 5ой задачи
            System.out.println("Месяц "+month2+" Сумма накоплений равна "+needSum);
        }
        }

        //task6
        int initialDeposit1 = 15_000;
        int persents = initialDeposit1/100*7;
        int accumSum = initialDeposit1;
        int totalMonths = 9*12;
        int months = 0;
        while (months<totalMonths){
            accumSum+=persents;
            months++;
            if(months%6==0){
                System.out.println("Месяц "+months+ ", Сумма накоплений равна "+accumSum);
            }
        }

        //task7
        int friday = 5;
        int dayInMonth = 31;
        while (friday <= dayInMonth) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }

        //task8
        int before = 2024 - 200;
        int after = 2024 + 100;

        for (int i = before; i < after; i ++) {
            if (i % 79 == 0){
                System.out.println(i);}
        }

    }
}