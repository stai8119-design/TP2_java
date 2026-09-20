public class MaxSubarray {

    public static int maxSubarraySum(int[] t) {
        if (t == null || t.length == 0) {
            return 0;
        }

        int currentSum = t[0];
        int maxSum = t[0];

        for (int i = 1; i < t.length; i++) {

            if (currentSum + t[i] > t[i]) {
                currentSum = currentSum + t[i];
            } else {
                currentSum = t[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void afficherMeilleureSousSuite(int[] t) {
        if (t == null || t.length == 0) {
            System.out.println("Tableau vide.");
            return;
        }

        int currentSum = t[0];
        int maxSum = t[0];
        
        int start = 0;
        int bestStart = 0;
        int bestEnd = 0;

        for (int i = 1; i < t.length; i++) {
            if (currentSum + t[i] > t[i]) {
                currentSum = currentSum + t[i];
            } else {
                currentSum = t[i];
                start = i; 
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                bestStart = start;
                bestEnd = i;
            }
        }

        System.out.println("Somme maximale = " + maxSum);
        System.out.print("Sous-suite : ");
        for (int i = bestStart; i <= bestEnd; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] t1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; 
        int[] t2 = {1, 2, 3, 4};                     
        int[] t3 = {-1, -2, -3};                     
        int[] t4 = {-2, -1, 3, 4, -5};               

        System.out.print("Test 1 -> "); afficherMeilleureSousSuite(t1);
        System.out.print("Test 2 -> "); afficherMeilleureSousSuite(t2);
        System.out.print("Test 3 -> "); afficherMeilleureSousSuite(t3);
        System.out.print("Test 4 -> "); afficherMeilleureSousSuite(t4);
    }
}
