class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int start = n - 1; 
        int end = n - 1;   
        int sum = 0;
        int stationsChecked = 0;
        while (stationsChecked < n) {
            sum += gas[end] - cost[end];
            stationsChecked++; 
            end = (end + 1) % n; 
            while (sum < 0 && stationsChecked < n) {
                start--; 
                sum += gas[start] - cost[start]; 
                stationsChecked++; 
            }
        }
        return sum >= 0 ? start : -1;
    }
}
