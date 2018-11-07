package Chapter2;

/**
 * Created by kartikkapur on 11/15/17.
 */
public class Determinant {
 public double determinant(double m[][]) {
    if (m.length == 1) {
        return m[0][0];
     } else if (m.length == 2) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
      } else {
        double det = 0.0;
        for (int i = 0; i < m.length; i++) {
            double[][] a = new double[m.length - 1][];
            for (int k = 0; k < (m.length - 1); k++) {
                a[k] = new double[m.length - 1];
            }
            for (int j = 1; j < m.length; j++) {
                int q = 0;
                for (int p = 0; p < m.length; p++) {
                    if (p == i) {
                        continue;
                    }
                    a[j - 1][q] = m[j][p];
                    q++;
                }
            }
            det += Math.pow(-1.0, i) * m[0][i] * determinant(a);
        }
        return det;
    }
 }
}
