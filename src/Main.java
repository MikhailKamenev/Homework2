public class Main {
    public static void main(String[] args) {
        byte a = 12;
        short b = 1592;
        int c = -123456789;
        long d =  7675644439L;
        float e = (float) 2.5E+10;
        System.out.println(e);
        double f = -1.3E+200;
        System.out.println(f);
        char g = 3;
        boolean h = true;

        float boxer1Weight = (float) 78.2;
        float boxer2Weight = (float) 82.7;
        float totalBoxersWeight = boxer1Weight + boxer2Weight;
        System.out.println("Суммарный вес боксеров " + totalBoxersWeight + " кг!");
        float differenceOfTheWeights = boxer2Weight % boxer1Weight;
        System.out.println("Разница в массе боксеров " + differenceOfTheWeights + "кг!");

        int bananas = 5;
        byte oneBananaWeight = 80;
        int bananasWeight = bananas * oneBananaWeight;
        int milk = 200;
        int milkWeight = milk / 100 * 105;
        int iceCream = 2;
        byte iceCreamPack = 100;
        int iceCreamWeight = iceCream * iceCreamPack;
        int eggs = 4;
        byte oneEggWeight = 70;
        int eggsWeight = eggs * oneEggWeight;
        int totalProductsWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float totalProductsWeightInKilo = totalProductsWeight/1000F;
        System.out.println("Суммарный вес продуктов для одного завтрака составляет " + totalProductsWeight + " гр. или "+ totalProductsWeightInKilo + " кг." );

        int totalWeightLoss = 7;
        float dailyLoss = 0.25F;
        int maxDaysAmount = (int) (totalWeightLoss / dailyLoss);
        System.out.println("При потере 250 гр. веса в день, потребуется " + maxDaysAmount + " суток.");

        float dailyBigLoss = 0.5F;
        int minDaysAmount = (int) (totalWeightLoss / dailyBigLoss);
        System.out.println("При потере 500 гр. веса в день, потребуется " + minDaysAmount + " суток.");

        float averageAmount = (float) (maxDaysAmount + minDaysAmount)/2;
        System.out.println("Среднее количество суток для похудения на 7 кг - " + averageAmount);


        int maryCurrentWage = 67760;
        int denCurrentWage = 83690;
        int kristinaCurrentWage = 76230;
        float totalRise = 1.1F;
        int maryNextWage = (int) (maryCurrentWage * totalRise);
        int maryYearDifference = (int) (maryCurrentWage * totalRise * 12 - maryCurrentWage * 12);
        System.out.println("Маша теперь получает " + maryNextWage + " рублей. Годовой доход вырос на " + maryYearDifference + " рублей.");
        int denNextWage = (int) (denCurrentWage * totalRise);
        int denYearDifference = (int) (denCurrentWage * totalRise * 12 - denCurrentWage * 12);
        System.out.println("Денис теперь получает " + denNextWage + " рублей. Годовой доход вырос на " + denYearDifference + " рублей.");
        int kristinaNextWage = (int) (kristinaCurrentWage * totalRise);
        int kristinaYearDifference = (int) (kristinaCurrentWage * totalRise * 12 - kristinaCurrentWage * 12);
        System.out.println("Кристина теперь получает " + kristinaNextWage + " рублей. Годовой доход вырос на " + kristinaYearDifference + " рублей.");



    }
}