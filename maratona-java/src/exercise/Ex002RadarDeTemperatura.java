package exercise;

public class Ex002RadarDeTemperatura {
    public static void main(String[] args) {
        int [][] temperature = new int[][] {
                {28, 32, 25},
                {27, 31, 24},
                {29, 33, 26},
                {26, 30, 23},
                {25, 29, 22},
                {30, 34, 27},
                {28, 35, 26},
        };

        int sum = 0;
        int multiply = temperature.length * temperature[0].length;
        int numberMines = 0;
        int positionRow = 0;
        int positionCollum = 0;
        int temperatureBiggerThanThirty = 0;

        for (int [] arrayTemperature : temperature) {

            for (int arrayCollum : arrayTemperature) {
                sum = sum + arrayCollum;
            }
        }

        for (int row = 0; row < temperature.length; row++) {

            for (int collum = 0; collum < temperature[0].length; collum++) {

                if (temperature[row][collum] > numberMines) {
                    numberMines = temperature[row][collum];
                    positionRow = row;
                    positionCollum = collum;
                }

                if (temperature[row][collum] > 30) {
                    temperatureBiggerThanThirty ++;
                }
            }
        }

        sum /= multiply;
        System.out.println("The average of the week is " + sum);
        System.out.println("The hosttest wether of the week is " + numberMines);
        System.out.println("Day hosttest of the week: " + positionRow + "\nTime: " + positionCollum);
        System.out.println("Temperature bigger than thirty: " + temperatureBiggerThanThirty);

    }
}
