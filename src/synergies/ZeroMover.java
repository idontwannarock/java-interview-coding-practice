package synergies;

public class ZeroMover {

    // given an array with zero and non-zero integers
    // move all zeros to the back while keeping the relative order of non-zeros
    // 
    // advance: keep time complexity and space complexity in O(n)
    public int[] sort(int[] given) {
        for (int front = 0, back = 1; given.length > 1 && back < given.length; back++) {
            if (given[front] == 0) {
                given[front] = given[back];
                given[back] = 0;
            }
            if (given[front] != 0) {
                front++;
            }
        }
        return given;
    }
}
