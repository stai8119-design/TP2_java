public class ElementsManquants {

    public static void afficherElementsManquants(int[] t) {
        if (t == null || t.length == 0) {
            System.out.println("Tableau vide.");
            return;
        }

        int n = t.length;
        
        boolean[] vu = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            int x = t[i];

            if (x >= 1 && x <= n) {
                vu[x] = true;
            }
        }

        System.out.print("Les éléments manquants : ");
        boolean aucunManquant = true;

        for (int k = 1; k <= n; k++) {
            if (!vu[k]) {
                System.out.print(k + " ");
                aucunManquant = false;
            }
        }

        if (aucunManquant) {
            System.out.print("Aucun");
        }
        
        System.out.println(); 
    }

    
    public static void main(String[] args) {
        int[] t1 = {3, 3, 3};               
        int[] t2 = {1, 2, 3, 4};            
        int[] t3 = {4, 2, 2, 1, 5};         
        int[] t4 = {1, 1, 1, 1};            

        System.out.print("t1 -> "); afficherElementsManquants(t1);
        System.out.print("t2 -> "); afficherElementsManquants(t2);
        System.out.print("t3 -> "); afficherElementsManquants(t3);
        System.out.print("t4 -> "); afficherElementsManquants(t4);
    }
}