import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        //adding from row2(index = 1)
        for (int i = 1; i<numRows; i++){
            //setup head tail of array to be 1 other init as 0
            triangle.add(new ArrayList<>());
            //used<= i because i is already 1 size smaller than the index, ex row2, i = 1, need to populate row2[0], row2[1]
            for(int j = 0; j<=i; j++){
                if(j == 0||j== i){
                    triangle.get(i).add(1);
                }else{
                    triangle.get(i).add(0);
                }
            }

            //need addition from row 3(i=2)
            if(i>1){
                //start from 1 and end on i(numRows-1) to not modify head and tail
                for(int k = 1; k<i;k++){
                    //addition are the previous row at k-1 and k(see graph)
                    triangle.get(i).set(k,triangle.get(i-1).get(k-1)+triangle.get(i-1).get(k));
                }
            }
        }
        return triangle;

    }
}
