package leonardtreman;
import java.awt.BorderLayout;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class JavaApplication1 {
    public static void main(String[] args) throws InterruptedException {
            int x=0;
    int y=600;
    int a3 = 0;
    int b3 = 60;
    int c3 = 0;
    int d3 = 10;
    int timer1 = 0;
    int timer2 = 10000;
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTable table = new JTable(60, 10);
    JScrollPane scrollPane = new JScrollPane(table);
    frame.add(scrollPane, BorderLayout.CENTER);
    frame.setSize(500, 2000);
    frame.setVisible(true);
    
   Random rand = new Random();
int  n = rand.nextInt(80) + 1;
if ( n % 2 == 0 )
{
    n = n - 1;
            }         
int[] a = new int[600];
while (timer1 != timer2)
{
while (x != y) 
        {
                 n = rand.nextInt(80) + 1;
                 if ( n % 2 == 0 )
                 {
                     n = n - 1;
                 }         
                 System.out.print(n + " ");
           a[x] = n;
                          x=x+1;   
        }
x=0;
    while (x != y)
    {
    table.setValueAt(a[x], a3, c3);
    a3=a3+1;
    if (a3 == b3)
    {
        a3 = 0;
        c3 = c3 + 1;
    }
    x=x+1;     
    }
    x=0;
    a3=0;
    c3=0;
    			Thread.sleep(30000);
timer1 = timer1+1;
    }
    }   
    }