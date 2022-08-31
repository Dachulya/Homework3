public class Main {
    public static void main(String[] args) {
        //задача 1
        int shuller=5;
        System.out.println("Значение переменной shuller" +
                "с типом int равно "+shuller);
        byte cherchul= -128;
        System.out.println("Значение переменной cherchul" +
                "с типом byte равно "+cherchul);
        short kant = 32767;
        System.out.println("Значение переменной kant" +
                "с типом short равно "+kant);
        long car=53563535;
        System.out.println("Значение переменной car" +
                "с типом long равно "+car);
        float gav= 1.46789f;
        System.out.println("Значение переменной gav" +
                "с типом float равно "+gav);
        double sleeeep =1.56948559456;
        System.out.println("Значение переменной sleeeep" +
                "с типом double равно "+sleeeep);
        //2 задание
        byte cot= 2;
        short ghjt=-159;
        float hor=27.12f;
        long tok= 987678965549l;
        short gh=786;
        boolean sss=false;
        short ght=569;
        short ghtp=27897;
        byte cop= 67;
//задача3
        byte lpStudent=23;
        byte asStudent=27;
        byte eaStudent=30;
        short allSheets=480;
        System.out.println("На каждого ученика рассчитано "+(allSheets/(lpStudent+asStudent+eaStudent))+" листов бумаги");

//задача 4
        byte efficiency = 8;
        byte time1= 20;
        short time2= 24*60;
        short time3= 3*24*60;
        int time4= 30*24*60;
        System.out.println("за "+(time1)+" минут машины произвела бутылок "+(time1*efficiency)+ " штук");
        System.out.println("за "+(time2)+" минут машины произвела бутылок "+(time2*efficiency)+ " штук");
        System.out.println("за "+(time3)+" минут машины произвела бутылок "+(time3*efficiency)+ " штук");
        System.out.println("за "+(time4)+" минут машины произвела бутылок "+(time4*efficiency)+ " штук");
        //задача5
        short quantityClass=(120/(2+4));
        int whiteCans = quantityClass * 2;
        int blackCans = quantityClass*4;
        System.out.println("В школе, где "+quantityClass+" классов, нужно "+whiteCans+ " банок белой краски и "+blackCans+ " банок коричневый краски");
//задача 6
        byte bananas=80;
        short milk=105;
        byte ice=100;
        byte egg=70;
        int weight=bananas*5+2*milk+ice*2+4*egg;
        System.out.println("Вес спорт-завтрака составляет "+(weight/1000) +" кг");
        //задача 7
        short needReset=7000;
        short min=250;
        short max=500;
        System.out.println((needReset/min)+" дней уйдёт на похудение , если спортсмен будет терять каждый день по 250 грамм");
        System.out.println((needReset/max)+" дней уйдёт на похудение , если спортсмен будет терять каждый день по 500 грамм");
        System.out.println(((needReset/min+needReset/max)/2)+" дней уйдёт на похудение , если спортсмен будет терять каждый день по 250-500 грамм в среднем");
//задача 8
        int maryaSalary= 67760;
        int denisSalary=83690;
        int kristinaSalary=76230;
        int generalMaryaSalary=maryaSalary*12;
        int generaDenisSalary=denisSalary*12;
        int generalKristinaSalary=kristinaSalary*12;
        double syperGeneralMaryaSalary=maryaSalary*11+maryaSalary*1.1;
        double syperGeneralDenisSalary=denisSalary*11+denisSalary*1.1;
        double syperGeneralKristinaSalary=kristinaSalary*11+kristinaSalary*1.1;
        System.out.println("Маша теперь получает "+syperGeneralMaryaSalary+" рублей. Годовой доход вырос на "+(syperGeneralMaryaSalary-generalMaryaSalary)+" рублей");
        System.out.println("Денис теперь получает "+syperGeneralDenisSalary+" рублей. Годовой доход вырос на "+(syperGeneralDenisSalary-generaDenisSalary)+" рублей");
        System.out.println("Кристина теперь получает "+syperGeneralKristinaSalary+" рублей. Годовой доход вырос на "+(syperGeneralKristinaSalary-generalKristinaSalary)+" рублей");



    }
}