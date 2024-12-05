public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int ages = 19;
        if (ages >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("нужно подождать");
        }

        int temp = 7;
        if (temp >= 5) {
            System.out.println("На улице тепло, можно идти без шапки");
        } else {
            System.out.println("Надень шапку, холодно");
        }

        int speed = 59;
        if (speed < 60) {
            System.out.println("Можно ездить спокойно");
        } else {
            System.out.println(" Придется заплатить штраф");
        }

        int peopleEge = 6;
        boolean garden = peopleEge >= 2 && peopleEge <= 6;
        if (garden) {
            System.out.println(" Если возраст человеека равен " + peopleEge + " , то ему нужно ходить в детский сад ");
        }

        boolean skcool = peopleEge >= 7 && peopleEge < 18;
        if (skcool) {
            System.out.println(" Если возраст человека равен " + peopleEge + " ,то ему нужно идти в школу");
        }

        boolean college = peopleEge >= 18 && peopleEge <= 24;
        if (college) {
            System.out.println("Если возраст человека равен " + peopleEge + " , то его место в университете");
        }

        boolean work = peopleEge >= 25;
        if (work) {
            System.out.println("Если возраст человека равен " + peopleEge + " то ему нужно ходить на работу");
        }

        int child = 14;
        boolean not = child < 5;
        if (not) {
            System.out.println(" Нельзя кататься на атракционе");
        }

        boolean yesBut = child > 5 && child < 14;
        if (yesBut) {
            System.out.println("Можно кататься на атракционе в сопровождении взрослого.");
        }

        boolean yes = child >= 14;
        if (yes) {
            System.out.println(" Можно кататься на атракционе без сопровождения взрослого");
        }


        int trainPalace = 102;
        int passager = 40;
        int seat = 60;
        int freePalace = trainPalace - passager;
        int stay = trainPalace - seat;

        if (freePalace == 0) {
            System.out.println("Вагон полон");
        } else if (freePalace > 0 && freePalace <= 40) {
            System.out.println(" В вагоне осталось " + freePalace + " стоячих мест ");
        } else if (freePalace > 40 && freePalace < 102) {
            System.out.println("В вагоне осталось " + (freePalace - seat) + " сидячих и " + stay + " стоячих мест");
        }


        int one11 = 7;
        int two22 = 4;
        int three33 = 2;
        if (one11 > two22 && one11 > three33) {
            System.out.println("Больше " + one11);
        } else if (two22 > three33 && two22 > one11) {
            System.out.println("Больше  " + two22);
        } else if (three33 > one11 && three33 > two22) {
            System.out.println(" Больше " + three33);
        }

    }
}
