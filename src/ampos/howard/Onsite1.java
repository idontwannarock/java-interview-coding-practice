package ampos.howard;

public class Onsite1 {

    public boolean isPrime(int input) {
        if (input <= 1) return false;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) return false;
        }
        return true;
    }
}
