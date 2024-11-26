package ExerciosPropostos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jlabel {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Calculadora de IMC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JTextField campoPeso = new JTextField(10);
        JTextField campoAltura = new JTextField(10);
        JButton calcularButton = new JButton("Calcular IMC");
        JLabel resultadoLabel = new JLabel("IMC: ");

        panel.add(new JLabel("Peso (kg):"));
        panel.add(campoPeso);
        panel.add(new JLabel("Altura (m):"));
        panel.add(campoAltura);
        panel.add(calcularButton);
        panel.add(resultadoLabel);

        frame.add(panel, BorderLayout.CENTER);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double peso = Double.parseDouble(campoPeso.getText());
                    double altura = Double.parseDouble(campoAltura.getText());

                    double imc = peso / (altura * altura);
                    String resultado = String.format("IMC: %.2f", imc);

                    String classificacao = "";
                    if (imc < 18.5) {
                        classificacao = "Abaixo do peso";
                    } else if (imc >= 18.5 && imc < 24.9) {
                        classificacao = "Peso normal";
                    } else if (imc >= 25 && imc < 29.9) {
                        classificacao = "Sobrepeso";
                    } else {
                        classificacao = "Obesidade";
                    }

                    resultado = resultado + " - " + classificacao;

                    JOptionPane.showMessageDialog(frame, resultado, "Resultado IMC", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira valores válidos para peso e altura.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
