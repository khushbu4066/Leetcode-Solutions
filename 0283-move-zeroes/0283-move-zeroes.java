class Solution {
    public void moveZeroes(int[] arr) {
        
        int n = arr.length;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        int nz = temp.size();
        for(int i = 0; i<nz; i++){
            arr[i] = temp.get(i);
        }
        
        for(int i = nz; i<n; i++){
            arr[i] = 0;
        }
    }
}