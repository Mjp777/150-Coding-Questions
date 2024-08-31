class Solution{
    public int candy(int[] rating){
        int n=rating.length;
        int increasingCount=0;
        int decreasingCount=0;
        int peakCandy=0;
        int totalCandies=1;

        for(int i=1;i<n;i++){
            if(rating[i-1]<rating[i]){
                increasingCount++;
                peakCandy=increasingCount+1;
                decreasingCount=0;
                totalCandies+=peakCandy;
            }else if(rating[i]==rating[i-1]){
                peakCandy=0;
                increasingCount=0;
                decreasingCount=0;
                totalCandies++;
            }else{
                decreasingCount++;
                increasingCount=0;
                totalCandies+=decreasingCount+(peakCandy>decreasingCount?0:1);
            }
        }
        return totalCandies;
    }
}
