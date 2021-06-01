package strategy;

public class Main {
    public static void main(String[] args) {
        int listSize = 10000;
        MeasureMent forLoopMeasureMent = new MeasureMent(new ForLoop(listSize));
        MeasureMent forEachMeasureMent = new MeasureMent(new ForEach(listSize));

        long diff = forEachMeasureMent.measureLoopTime() - forLoopMeasureMent.measureLoopTime();
        System.out.println("差は " + diff + " です。");
    }
}
