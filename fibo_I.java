import javax.swing.*;
public class fibo_I {
    public static int fibonacci(int n){
    int actual = 0, ant1 = 0, ant2 = 1;
       for (int i=1; i<=n; i++) {
                actual = ant1 + ant2;
                ant2 = ant1;
                ant1 = actual;
    }
        return actual;
        }
        
public static void main (String[] args) { 
    int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de n? "));
    JOptionPane.showMessageDialog(null,"Resultado: " + fibonacci(n)); 
   }
 }
