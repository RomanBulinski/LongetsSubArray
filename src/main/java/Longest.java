public class Longest {

    public int  getLongestSubarr(String string ){

        String[] arr = string.split("");

        int longestSubArr = 0;
        int tempCOunter = 1;

        for (int i =1; i<arr.length; i++){
            if(arr[i].equals( arr[i-1]) ){
                tempCOunter++;
            }else{
                tempCOunter=1;
            }
            if(longestSubArr<tempCOunter){
                longestSubArr = tempCOunter;
            }
        }
        return longestSubArr;
    }



}
