public class CarreMagique {

    public static boolean estCarreMagique(int[][] m) {
        if (m == null || m.length != 3 || m[0].length != 3) {
            return false; 
        }

        int ref = m[0][0] + m[0][1] + m[0][2];

        int ligne2 = m[1][0] + m[1][1] + m[1][2];
        int ligne3 = m[2][0] + m[2][1] + m[2][2];
        
        if (ligne2 != ref || ligne3 != ref) {
            return false;
        }

        
        int col1 = m[0][0] + m[1][0] + m[2][0];
        int col2 = m[0][1] + m[1][1] + m[2][1];
        int col3 = m[0][2] + m[1][2] + m[2][2];

        if (col1 != ref || col2 != ref || col3 != ref) {
            return false;
        }

        int diagPrinc = m[0][0] + m[1][1] + m[2][2];
        int diagSec = m[0][2] + m[1][1] + m[2][0];

        if (diagPrinc != ref || diagSec != ref) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        
        int[][] m1 = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };

        
        int[][] m2 = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 7}
        };


        int[][] m3 = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };

        System.out.println("m1 est un carré magique ? " + estCarreMagique(m1)); 
        System.out.println("m2 est un carré magique ? " + estCarreMagique(m2)); 
        System.out.println("m3 est un carré magique ? " + estCarreMagique(m3)); 
    }
}