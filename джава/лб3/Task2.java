public class Task2 {
    public static void main(String[] args) {

        Task2 secondTaskObj = new Task2();

        secondTaskObj.printTaskSolution(12, 9, 1);
        secondTaskObj.printTaskSolution(0, 8, -3);
        secondTaskObj.printTaskSolution(-7, 11, 7);
        secondTaskObj.printTaskSolution(5, 7, 2);
        secondTaskObj.printTaskSolution(0, 13, 0);
        secondTaskObj.printTaskSolution(-16, 5, 8);
    }

    private double solveTask(double t, int n, int l) {
        boolean isItEven = l % 2 == 0;

        if(t == 0 || isItEven && t < 0) {
            throw new IllegalArgumentException("param t = " + t);
        }

        double sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += isItEven ? l / Math.sqrt(t) : l / t;
        }

        return sum;
    }

    private void printTaskSolution(double t, int n, int l) {
        String output = "t=" + t + "; n=" + n + "; l=" + l + ";\nresult: ";

        try {
            output += solveTask(t, n, l);

        } catch(IllegalArgumentException e) {
            output += "EXCEPTION! " + e.getMessage();
        }

        System.out.println(output);
    }
}