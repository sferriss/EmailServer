package servidoremail;

public class CaixaPostal {

    protected String remetente;
    protected Email[] caixaDeSaida = new Email[50];
    protected Email[] caixaDeEntrada = new Email[50];

    public CaixaPostal(String remetente) {
        this.remetente = remetente;
    }

    public void setCaixaDeSaida(Email[] caixaDeSaida) {
        this.caixaDeSaida = caixaDeSaida;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public void setCaixaDeEntrada(Email[] caixaDeEntrada) {
        this.caixaDeEntrada = caixaDeEntrada;
    }

    public String getRemetente() {
        return remetente;
    }

    public Email[] getCaixaDeSaida() {
        return caixaDeSaida;
    }

    public Email[] getCaixaDeEntrada() {
        return caixaDeEntrada;
    }

    public void send(String d, String a, String c, int p) {
        for (int i = 0; i < caixaDeSaida.length; i++) {
            if (caixaDeSaida[i] == null) {
                caixaDeSaida[i] = new Email(d, a, c, p);
                caixaDeSaida[i].setRemetente(this.remetente);
                break;
            }
        }
    }

    public void showInboxExit() {
        System.out.println("Caixa de saída: " + getRemetente());
        for (int i = 0; i < caixaDeSaida.length; i++) {
            if (caixaDeSaida[i] != null) {
                System.out.println();
                System.out.println(caixaDeSaida[i].toString());
            }
        }
    }

    public void showInbox() {
        System.out.println();
        System.out.println("CAIXA DE ENTRADA: " + getRemetente());
        for (int i = 0; i < caixaDeEntrada.length; i++) {
            if (caixaDeEntrada[i] != null) {
                System.out.println();
                System.out.println(caixaDeEntrada[i].toString());
            }
        }
    }

    public void selectionSort(Email[] e) {
        for (int i = 0; i < e.length - 1; i++) {
            for (int j = i + 1; j < e.length; j++) {
                if (e[j] != null) {
                    if (e[i].getPrioridade() > e[j].getPrioridade()) {
                        Email temp = e[i];
                        e[i] = e[j];
                        e[j] = temp;
                    }
                }
            }
        }
    }

    public void insertionSort(Email[] e) {
        for (int i = 1; i < e.length; i++) {
            int j = i;
            Email b = e[i];
            if (e[i] != null) {
                while ((j > 0) && (e[j - 1].getPrioridade()) > b.getPrioridade()) {
                    e[j] = e[j - 1];
                    j--;
                }
                e[j] = b;
            }
        }
    }

    public void bubbleSort(Email[] e) {
        int i = e.length - 1;
        while (i > 0) {
            int last = 0;
            for (int j = 0; j < i; j++) {
                if (e[j + 1] != null) {
                    if (e[j].getPrioridade() > e[j + 1].getPrioridade()) {
                        Email temp = e[j];
                        e[j] = e[j + 1];
                        e[j + 1] = temp;
                        last = j;
                    }
                }
            }
            i--;
        }
    }
}
