class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[127];
        // char[] c = sentence.toCharArray();
     
        for(int i=0;i<sentence.length();i++){
            arr[sentence.charAt(i)] = arr[sentence.charAt(i)]+1;
        }
        for(int i=97;i<123;i++){
            if(arr[i]==0){
            return false;
            }
        }
        return true;
    }
}