public class Pivots {

    public static void afficherPivots(int[] t) {
        if (t == null || t.length < 3) {
            System.out.println("Aucun pivot");
            return;
        }

        int n = t.length;
        boolean aUnPivot = false; 
        
        System.out.print("Pivots : ");

        
        for (int i = 1; i < n - 1; i++) {
            boolean estPivot = true;

            
            for (int j = 0; j < i; j++) {
                if (t[j] > t[i]) {
                    estPivot = false;
                    break; 
                }
            }

            for (int k = i + 1; k < n; k++) {
                if (t[k] < t[i]) {
                    estPivot = false;
                    break; 
                }
            }

            if (estPivot) {
                System.out.print(t[i] + " ");
                aUnPivot = true;
            }
        }

        
        if (!aUnPivot) {
            System.out.print("Aucun pivot");
        }
        
        System.out.println(); 
    }

    public static void main(String[] args) {
        
        int[] t1 = {2, 4, 3, 5, 6};
        int[] t2 = {1, 2, 3, 4, 5};
        int[] t3 = {5, 4, 3, 2, 1};
        int[] t4 = {3, 3, 3, 3};
        int[] t5 = {7, 1, 5, 2, 6, 3, 4};

        System.out.print("t1 -> "); afficherPivots(t1); 
        System.out.print("t2 -> "); afficherPivots(t2); 
        System.out.print("t3 -> "); afficherPivots(t3); 
        System.out.print("t4 -> "); afficherPivots(t4); 
        System.out.print("t5 -> "); afficherPivots(t5); 
    }
}