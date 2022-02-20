import javax.swing.JOptionPane;

public class calculadora{

	public static void main(String[] args){

		int n1,n2, suma, resta, mul, div;
		char o;

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

		o = JOptionPane.showInputDialog("Digite la operacion a realizar | SUMA (S o s) | RESTA (R o r) | MULTIPLICACION (M o m) | DIVISION | (D o d)").charAt(0);

		switch(o){

			case 's':
			case 'S': suma = n1+n2;
					  JOptionPane.showMessageDialog(null,"La suma es: "+suma);
					  break;
			case 'r':
			case 'R': resta = n1-n2;
					  JOptionPane.showMessageDialog(null,"La resta es: "+resta);
					  break;
			case 'm':
			case 'M': mul = n1*n2;
					  JOptionPane.showMessageDialog(null,"La multiplicacion es: "+mul);
					  break;
			case 'd':
			case 'D': div = n1/n2;
					  JOptionPane.showMessageDialog(null,"La division es: "+div);
					  break;
			default: JOptionPane.showMessageDialog(null,"Error! opcion incorrecta ");

			}

		}


	}