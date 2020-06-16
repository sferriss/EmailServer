package servidoremail;

public class Email {

    protected String remetente, destinatario, assunto, corpEmail;
    protected int prioridade;

    Email(String d, String a, String c, int p) {
        this.destinatario = d;
        this.assunto = a;
        this.corpEmail = c;
        if (p > 0 && p < 21) {
            this.prioridade = p;
        } else {
            if (p < 1) {
                this.prioridade = 1;
            } else {
                this.prioridade = 20;
            }
        }
    }

    @Override
    public String toString() {
        return "Remetente: " + remetente + "\nDestinatario: " + destinatario + "\nAssunto: " 
                + assunto + "\nPrioridade: " + prioridade + "\n" + corpEmail;
    }

    public String getRemetente() {
        return this.remetente;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getDestinatario() {
        return this.destinatario;
    }

    public String getAssunto() {
        return this.assunto;
    }

    public String getCorpEmail() {
        return this.corpEmail;
    }

    public void setRemetente(String r) {
        this.remetente = r;
    }

    public void setDestinaraio(String d) {
        this.destinatario = d;
    }

    public void setAssunto(String a) {
        this.assunto = a;
    }

    public void setCorpEmail(String c) {
        this.corpEmail = c;
    }
}
