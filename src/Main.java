import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame tela = new JFrame("Carrinho de Compras");
        tela.setSize(400, 300);
        tela.setLayout(null);

        String[] produtos = {"Mouse - 50", "Teclado - 100", "Monitor - 800"};

        JList<String> lista = new JList<>(produtos);
        lista.setBounds(20, 20, 150, 150);

        JButton calcular = new JButton("Total");
        calcular.setBounds(200, 20, 100, 30);

        JLabel total = new JLabel("Total: 0");
        total.setBounds(200, 60, 150, 30);

        calcular.addActionListener(e -> {
            int soma = 0;

            for (String item : lista.getSelectedValuesList()) {
                String[] partes = item.split("-");
                soma += Integer.parseInt(partes[1].trim());
            }

            total.setText("Total: " + soma);
        });

        tela.add(lista);
        tela.add(calcular);
        tela.add(total);

        tela.setVisible(true);
    }

}