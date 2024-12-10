
package second;


public class fibo {
abstract static class Progression {
    protected long current; 

    public Progression(long start) {
        current = start;
    }

    public abstract long nextValue();

    public void printProgression(int n) {
        System.out.print("Progression: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nextValue() + " ");
        }
        System.out.println();
    }
}

static class FibonacciProgression extends Progression {
    protected long prev; 
    
    public FibonacciProgression(long first, long second) {
        super(first); 
        this.prev = second - first; 
    }

    @Override
    public long nextValue() {
        long temp = current; 
        current += prev;     
        prev = temp;        
        return current;     
    }
}


    public static void main(String[] args) {
        FibonacciProgression fib = new FibonacciProgression(2, 2); 
        long eighthValue = 0;

        for (int i = 1; i <= 8; i++) {
            eighthValue = fib.nextValue(); 
        }

        System.out.println("The 8th value of the Fibonacci progression is: " + eighthValue);
    }
}


