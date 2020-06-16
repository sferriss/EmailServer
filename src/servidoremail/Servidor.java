package servidoremail;

public class Servidor {

    protected CaixaPostal[] vetorCaixasPostais = new CaixaPostal[50];

    public void add(CaixaPostal c) {
        for (int i = 0; i < vetorCaixasPostais.length; i++) {
            if (vetorCaixasPostais[i] == null) {
                vetorCaixasPostais[i] = c;
                break;
            }
        }
    }
    

    public void sendReceive() {
        String dest = "";
        Email e;
        for (int i = 0; i < vetorCaixasPostais.length; i++) { //Percorre o vetorCaixasPostais
            if (vetorCaixasPostais[i] != null) {
                for (int j = 0; j < vetorCaixasPostais[i].caixaDeSaida.length; j++) { //Percorre o caixa de saida
                    if (vetorCaixasPostais[i].caixaDeSaida[j] != null) {
                        dest = vetorCaixasPostais[i].caixaDeSaida[j].getDestinatario(); //Guarda o destinatario do email
                        e = vetorCaixasPostais[i].caixaDeSaida[j]; // guarda o email
                        for (int k = 0; k < vetorCaixasPostais.length; k++) { //percorre um novo vetorCaixasPostais
                            if (vetorCaixasPostais[k] != null) {
                                if (vetorCaixasPostais[k].getRemetente().equals(dest)) { //compara o destinatario com remetente
                                    for (int l = 0; l < vetorCaixasPostais[k].caixaDeEntrada.length; l++) { //percorre o vetor caixa de entrada
                                        if (vetorCaixasPostais[k].caixaDeEntrada[l] == null) {
                                            vetorCaixasPostais[k].caixaDeEntrada[l] = e; //insere o e-mail
                                            vetorCaixasPostais[i].caixaDeSaida[j] = null; //remove o email da caixa de saida
                                            break;
                                        }
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
    }
}
