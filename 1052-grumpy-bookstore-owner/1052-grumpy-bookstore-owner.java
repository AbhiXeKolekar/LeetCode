class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;

        for(int i = 0; i < customers.length; i++){
            if(grumpy[i] == 0) satisfied += customers[i];
        }

        int sum = 0;

        for(int i = 0; i < minutes; i++){
            if(grumpy[i] == 1) sum += customers[i];
        }

        int maxSum = sum;

        for(int i = minutes; i < customers.length; i++){
            if(grumpy[i - minutes] == 1) sum -= customers[i - minutes];
            if(grumpy[i] == 1) sum += customers[i];
            maxSum = Math.max(sum, maxSum);
        }

        satisfied += maxSum;

        return satisfied;
    }
}