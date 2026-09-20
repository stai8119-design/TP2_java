public class PermutationCirculaire {

    public static boolean estPermutationCirculaire(int[] t) {

        if (t == null || t.length == 0) {
            return false;
        }

        int n = t.length;

        boolean[] vu = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            int x = t[i];

            if (x < 1 || x > n) {
                return false;
            }

            if (vu[x]) {
                return false;
            }

            vu[x] = true;
        }

        int pos1 = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                pos1 = i;
                break; 
            }
        }

        for (int k = 0; k < n; k++) {

            int idx = (pos1 + k) % n;

            int valeurAttendue = k + 1;

            if (t[idx] != valeurAttendue) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
       
        int[] t1 = {1, 2, 3, 4, 5};         
        int[] t2 = {2, 3, 4, 5, 1};         
        int[] t3 = {3, 1, 2, 4, 5};         
        int[] t4 = {1, 2, 2, 3, 4};         
        int[] t5 = {0, 1, 2, 3, 4};        

        System.out.println("t1 -> " + estPermutationCirculaire(t1)); 
        System.out.println("t2 -> " + estPermutationCirculaire(t2)); 
        System.out.println("t3 -> " + estPermutationCirculaire(t3));
        System.out.println("t4 -> " + estPermutationCirculaire(t4)); 
        System.out.println("t5 -> " + estPermutationCirculaire(t5)); 
    }
}
