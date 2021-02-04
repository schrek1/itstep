package cz.itstep.p3.calculator;

public class Calculator {

    public double sum(NumberHolder numbers) {
        double sum = 0;

        for (double n : numbers.getAll()) {
            sum += n;
        }

        return sum;
    }

    public double avg(NumberHolder numbers) {
        double sum = 0;
        int cnt = 0;

        for (double n : numbers.getAll()) {
            sum += n;
            cnt++;
        }

        return sum/cnt;
    }

    public double[] incrementAll(NumberHolder numberHolder) {
        double[] numbers = numberHolder.getAll();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 1;
        }
        return numbers;
    }
}
