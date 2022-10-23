public class AddOne {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i > 0 ; i--){
            if(digits[i]<9){
                //If we meet any none nine we can just add and return
                digits[i] += 1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        //went through the loop: all are 9, add 1 more digit the rest are zero
        int allNine[] = new int[digits.length+1];
        allNine[0] = 1;
        return allNine;

    }
}
