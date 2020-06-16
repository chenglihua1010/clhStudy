package service.com.geekbang.learnthread.threadlocal;

import java.util.ArrayList;
import java.util.List;

public class PerformanceTracker {
        //静态内部内 线程执行时间
        private static class Phase{
                public Phase(String name,long duration){
                        this.name=name;
                        this.duration=duration;
                }
                private String name;
                private long duration;

                @Override
                public String toString() {
                        return "Phase{" +
                                        "name='" + name + '\'' +
                                        ", duration=" + duration +
                                        "}\n";
                }
        }


        //TODO ThreadLocal一般都是static的
        //TODO 这样使用threadlocal，这些数据不用再应用程序之间传递，而且还可以为每个线程保留自己的一份数据
        private static final ThreadLocal<List<Phase>> PHASES = new ThreadLocal<>();
        private static final ThreadLocal<Long> PHASE_START_TIME = new ThreadLocal<>();
        //初始化
        public static void reset() {
                PHASES.set(new ArrayList<>());
                PHASE_START_TIME.set(-1L);
        }
        //记录开始时间
        public static void startPhase() {
                PHASE_START_TIME.set(System.currentTimeMillis());
        }
        //name的执行时间
        public static void endPhase(String phaseName) {
                long start = PHASE_START_TIME.get();
                PHASES.get().add(new Phase(phaseName, System.currentTimeMillis() - start));
        }
        //清空
        public static void finish() {
                List<Phase> phases = PHASES.get();
                PHASES.set(null);
                PHASE_START_TIME.set(null);

                StringBuilder out = new StringBuilder("------Thread Execution Phase Durations---------\n");
                phases.forEach(out::append);
                out.append("--------------------------------------\n");
                System.out.println(out.toString());
        }




}