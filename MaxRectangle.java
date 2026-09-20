public class MaxRectangle {

    static class Rectangle {
        int top;
        int left;
        int bottom;
        int right;
        int area;
    }

    public static int maxRectangle(int[][] m) {
        Rectangle r = trouverMaxRectangle(m);
        if (r == null) {
            return 0;
        }
        return r.area;
    }

    
    public static Rectangle trouverMaxRectangle(int[][] m) {
        if (m == null || m.length == 0 || m[0].length == 0) {
            return null;
        }

        int R = m.length;
        int C = m[0].length;
        
        int[][] h = new int[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (m[i][j] == 0) {
                    h[i][j] = 0;
                } else {
                    if (i == 0) {
                        h[i][j] = 1;
                    } else {
                        h[i][j] = h[i - 1][j] + 1;
                    }
                }
            }
        }

        Rectangle maxRect = new Rectangle();
        maxRect.area = 0;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int minHeight = h[i][j];
                
                if (minHeight == 0) {
                    continue; 
                }

                for (int k = j; k < C; k++) {
                    if (h[i][k] == 0) {
                        break;
                    }
                    
                    minHeight = Math.min(minHeight, h[i][k]);
                    
                    int largeur = k - j + 1;
                    int aire = minHeight * largeur;

                    if (aire > maxRect.area) {
                        maxRect.area = aire;
                        maxRect.bottom = i;
                        maxRect.top = i - minHeight + 1;
                        maxRect.left = j;
                        maxRect.right = k;
                    }
                }
            }
        }

        return maxRect;
    }

    public static void main(String[] args) {
        int[][] matrice = {
            {0, 1, 1, 0, 1},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 1, 0},
            {1, 1, 0, 0, 1}
        };

        Rectangle resultat = trouverMaxRectangle(matrice);

        System.out.println("Aire maximale = " + resultat.area);
        System.out.println("Coordonnées :");
        System.out.println(" - top    = " + resultat.top);
        System.out.println(" - bottom = " + resultat.bottom);
        System.out.println(" - left   = " + resultat.left);
        System.out.println(" - right  = " + resultat.right);
    }
}