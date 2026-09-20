public class MajorityElement {

    public static int elementMajoritaire(int[] t) {
        
        if (t == null || t.length == 0) {
            return -1;
        }

        int n = t.length;
        int candidat = t[0];
        int compteur = 0;

        for (int i = 0; i < n; i++) {
            if (compteur == 0) {
                candidat = t[i];
                compteur = 1;
            } else if (t[i] == candidat) {
                compteur++;
            } else {
                compteur--;
            }
        }

        int occurrences = 0;
        for (int i = 0; i < n; i++) {
            if (t[i] == candidat) {
                occurrences++;
            }
        }

        if (occurrences > n / 2) {
            return candidat;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] t1 = {3, 3, 4, 3, 5};         
        int[] t2 = {1, 2, 3, 2, 2};         
        int[] t3 = {1, 2, 3, 4};            
        int[] t4 = {1, 1, 2, 2};            
        int[] t5 = {-2, -2, -2, -2, 1, 3};  

        System.out.println("t1 -> " + elementMajoritaire(t1));
        System.out.println("t2 -> " + elementMajoritaire(t2));
        System.out.println("t3 -> " + elementMajoritaire(t3));
        System.out.println("t4 -> " + elementMajoritaire(t4));
        System.out.println("t5 -> " + elementMajoritaire(t5));
    }
}
