public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        int idx1 = 0;
        int idx2 = 0;
        for (int k = 0; k < m; k++) {
            nums1Copy[k] = nums1[k];
        }
        if(nums1.length == 0){
            for(int g = 0 ; g < n; g++){
                nums1[g] = nums2[g];
            }
        }else if(nums2.length == 0){
            //do nothing
        }else if(nums1.length == 0&&nums2.length==0){
            //do nothing
        }else{

            for(int i = 0; i<m+n; i++){
                //case to + idx1
                //1. when it second array is done
                //2. when first array is not over and and it's smaller
                if(idx2 >= n ||(idx1<m && nums1Copy[idx1] < nums2[idx2])){
                    nums1[i] = nums1Copy[idx1++];
                }else{// All other cases, 1. first array is done 2. equal 3. secons is not over and smaller
                    nums1[i] = nums2[idx2++];
                }

            }
        }
    }
}
