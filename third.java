
package second;


public class third {
    
    static class ArithmeticProgression {
    protected long current; 
    protected long increment; 

    public ArithmeticProgression(long start, long increment) {
        this.current = start;
        this.increment = increment;
    }

    public long nextValue() {
        current += increment;
        return current;
    }

    public static void main(String[] args) {
        ArithmeticProgression ap = new ArithmeticProgression(0, 128);
        long maxLong = Long.MAX_VALUE;
        long value = ap.current;
        long count = 0;

        while (value < maxLong) {
            value = ap.nextValue();
            count++;
        }

        System.out.println("عدد الاستدعاءات القصوى لـ nextValue قبل التجاوز: " + count);
    }
}

    
}
