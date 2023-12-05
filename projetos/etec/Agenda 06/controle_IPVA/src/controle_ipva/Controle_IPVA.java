package controle_ipva;

import javax.swing.JOptionPane;

public class Controle_IPVA {

    public static void main(String[] args) {
        int final_placa; // número final da placa do carro
        String data;

        JOptionPane.showMessageDialog(null, """
                                            Este programa diz at\u00e9 quando voc\u00ea deve pagar o IPVA
                                             de acordo com o n\u00famero final da placa de seu carro.""");
        final_placa = Integer.parseInt(JOptionPane.showInputDialog("Número final da placa do carro(0 à 9): "));

        switch (final_placa) {
            case 1: // final de placa 1
                data = "30/04";
                JOptionPane.showMessageDialog(null, "Placa termina com " + final_placa
                        + "\nData de pagamento do IPVA: " + data);
                break;
            case 2: // final placa 2
                data = "31/05";
                JOptionPane.showMessageDialog(null, "Placa termina com " + final_placa
                        + "\nData de pagamento do IPVA: " + data);
                break;
            case 3:// final placa 3
                data = "30/06";
                JOptionPane.showMessageDialog(null, "Placa termina com " + final_placa
                        + "\nData de pagamento do IPVA: " + data);
                break;
            case 4:// final placa 4
                data = "31/07";
                JOptionPane.showMessageDialog(null, "Placa termina com " + final_placa
                        + "\nData de pagamento do IPVA: " + data);
                break;
            case 5:// final placa 5
                data = "31/08";
                JOptionPane.showMessageDialog(null, "Placa termina com " + final_placa
                        + "\nData de pagamento do IPVA: " + data);
                break;
            case 6:// final placa 6
                data = "30/09";
                JOptionPane.showMessageDialog(null, "Placa termina com " + final_placa
                        + "\nData de pagamento do IPVA: " + data);
                break;
            case 7:// final placa 7
                data = "31/10";
                JOptionPane.showMessageDialog(null, "Placa termina com " + final_placa
                        + "\nData de pagamento do IPVA: " + data);
                break;
            case 8:// final placa 8
                data = "30/11";
                JOptionPane.showMessageDialog(null, "Placa termina com " + final_placa
                        + "\nData de pagamento do IPVA: " + data);
                break;
            case 9:// final placa 9
                data = "31/12";
                JOptionPane.showMessageDialog(null, "Placa termina com " + final_placa
                        + "\nData de pagamento do IPVA: " + data);
                break;
            case 0:// final placa 0
                data = "31/12";
                JOptionPane.showMessageDialog(null, "Placa termina com " + final_placa
                        + "\nData de pagamento do IPVA: " + data);
                break;
            default: // número inválido
                JOptionPane.showMessageDialog(null, "ERRO! O valor inserido não é válido!");
        }
    }

}
