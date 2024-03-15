// class Solution {
//     public int[] productExceptSelf(int[] arr) {
        
//         int n = arr.length;
//         int[] result = new int[n];
        
//         for(int i = 0; i<n; i++){
//             int productCurrEle = 1;
//             for(int j = 0; j<n; j++){
                
//                 if(i == j)
//                     continue;
//                 productCurrEle = productCurrEle * arr[j];
                
//             }
            
//             result[i] = productCurrEle;
//         }
//         return result;
//     }
// }

class Solution {
    public int[] productExceptSelf(int[] arr) {
        
        int n = arr.length;
        int[] Product = new int[n];
        
        Product[0] = 1;
        for(int i = 1; i<n; i++)
            Product[i] = arr[i-1] * Product[i-1];
        
        
        int sufixProduct = 1;
        for(int i = n-1; i>=0; i--){
            Product[i] *= sufixProduct;
            sufixProduct *= arr[i];
        }
        
        return Product;
    }
}