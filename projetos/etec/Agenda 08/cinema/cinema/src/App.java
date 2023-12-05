import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
        int idade = 0; // idade
        int otimo = 0; // qtd ótimo
        int ruim = 0; // qtd ruim
        int pessimo = 0; // qtd péssimo
        double total_idades = 0; // soma das idades
        int lotacao = 0; //qtd total pessoas que assistiram ao filme
        int lotacao_total = 40; // qtd de pessoas que cabem no cinema
        double pessimo_por_cento = 0; // porcentagem de pessoas que acharam o filme péssimo
        String[] satisfacao = { "Ótimo", "Bom", "Regular", "Ruim", "Péssimo" }; // opções de satisfação
        String message = "Resultado da pesquisa:\nÓtimo: %d\nMédia de idade das pessoas \nque responderam 'Ruim': %f\nPorcentagem de respostas 'péssimo': %f %%"; //resultado da pesquisa

        while (lotacao < lotacao_total) {
            JOptionPane.showMessageDialog(null, "Satisfação com o filme");

            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?"));

            int x = JOptionPane.showOptionDialog(null, "Como você avalia o filme?", "Satisfação cinema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, satisfacao, satisfacao[0]); // avaliação do filme

        
            switch (x) {
                case 0:
                    otimo += 1;
                    break;

                case 1:

                    break;

                case 2:

                    break;
                case 3:
                    total_idades += idade;
                    ruim += 1;
                    break;

                case 4:
                    pessimo += 1;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Um ERRO inesperado ocorreu", "ERRO", 0);
                    ;
                    System.exit(0);
            }
            lotacao += 1;
        }
        total_idades = total_idades / ruim;//calcula a média de idade
        pessimo_por_cento = (pessimo * 100) / lotacao_total; // calcula a porcentagem de respostas como péssimo
        JOptionPane.showMessageDialog(null, String.format(message, otimo, total_idades, pessimo_por_cento)); // exibe o resultado final com formatação de strings

    }
}
