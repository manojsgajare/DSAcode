package DSAExamples.src.PracticeCode;
/*
Initialize pos=1.
 Iterate till number>0,
  at each step check if the last bit is set.
 If last bit is set,
  return current position, else
 increment pos by 1 and right shift n by 1.
 */


public class PositionOfRightMostShiftBit {
    public static int Last_set_bit(int n)
    {
        int p = 1;
        //Iterate till number > 0

        while (n > 0)
        {
            // Checking if last bit is set

            if (( n & 1) > 0)
            {
                return p;
            }
            // Increment position and right
            //shift number

            p++;
             n = n >> 1;
        }
        // set bit not found.
        return -1;
    }
    //Driver code

    public static void main(String[] args) {
        int n = 18;

        // Functio call
        int pos = Last_set_bit(n);

        if (pos != -1)
        {
            System.out.println(pos);
        }
        else {
            System.out.println("0");
        }
    }
}
