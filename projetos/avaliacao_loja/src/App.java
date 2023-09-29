import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // ✰
        String[] avaliacao = { "✰", "✰✰", "✰✰✰", "✰✰✰✰", "✰✰✰✰✰" }; // opções
        int total_avaliacao = 0;
        double media = 0; // média
        int qtd_pessoas = 0; // qtd de pessoas que avaliaram
        String message = "Total de avaliações no dia: %d\n Média: %f ✰"; // mensagem final

        while (qtd_pessoas < 5) {
            int x = JOptionPane.showOptionDialog(null, "Como você avalia nosso atendimento?", "Avaliação",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, avaliacao, avaliacao[0]); // avaliação
            
            if (x == 0) {
                JOptionPane.showMessageDialog(null, "Sua avaliação foi: " + avaliacao[x]);
                total_avaliacao +=1;
                qtd_pessoas += 1;
            }
            else if (x == 1) {
                JOptionPane.showMessageDialog(null, "Sua avaliação foi: "+ avaliacao[x]);
                total_avaliacao +=2;
                qtd_pessoas += 1;
            }
            else if (x == 2) {
                JOptionPane.showMessageDialog(null, "Sua avaliação foi: "+ avaliacao[x]);
                total_avaliacao +=3;
                qtd_pessoas += 1;
            }
            else if (x == 3) {
                JOptionPane.showMessageDialog(null, "Sua avaliação foi: "+ avaliacao[x]);
                total_avaliacao +=4;
                qtd_pessoas += 1;
            }
            else if (x == 4) {
                JOptionPane.showMessageDialog(null, "Sua avaliação foi: "+ avaliacao[x]);
                total_avaliacao +=5;
                qtd_pessoas += 1;
            }
            else{
                System.exit(0);
            }
        }
        media = total_avaliacao / qtd_pessoas;
        JOptionPane.showMessageDialog(null, String.format(message, qtd_pessoas, media));

    }
}
