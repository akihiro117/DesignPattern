package strategy;

public class MeasureMent {
    private final Loop loop;

    public MeasureMent(Loop loop) {
        this.loop = loop;
    }

    public long measureLoopTime() {
        System.out.println(loop.getName() + " の処理時間を計測します。");
        long startTimeMillis = System.currentTimeMillis();
        loop.doLoop();
        long endTimeMillis = System.currentTimeMillis();
        System.out.println("計測完了。");
        System.out.println("開始時刻: " + startTimeMillis + " ms");
        System.out.println("終了時刻: " + endTimeMillis + " ms");
        long processTimeMillis = endTimeMillis - startTimeMillis;
        System.out.println("処理時間: " + processTimeMillis + " ms");

        return processTimeMillis;
    }
}
