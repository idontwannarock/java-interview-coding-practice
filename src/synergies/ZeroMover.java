package synergies;

public class ZeroMover {

    // given an array with zero and non-zero integers
    // move all zeros to the back while keeping the relative order of non-zeros
    // 
    // advance: keep time complexity and space complexity in O(n)
    public int[] sort(int[] given) {
        for (int front = 0, back = 1; given.length > 1 && back < given.length; back++) {
            // swap only when int in the front is zero and int in the back is not zero
            if (given[front] == 0 && given[back] != 0) {
                given[front] = given[back];
                given[back] = 0;
            }
            // index of front add 1 when int in the front is not zero
            if (given[front] != 0) {
                front++;
            }
        }
        return given;
    }
}
