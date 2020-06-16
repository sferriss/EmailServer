package servidoremail;

public class Teste {

    public static void main(String[] args) {
        CaixaPostal cpCarlos = new CaixaPostal("carlos@unisinos.br"); //cria caixa postal do Carlos
        CaixaPostal cpEduardo = new CaixaPostal("eduardo@unisinos.br");
        CaixaPostal cpJonas = new CaixaPostal("jonas@unisinos.br");
        Servidor ser = new Servidor();
        ser.add(cpCarlos); // adiciona caixa postal do Carlos ao servidor de emails
        ser.add(cpEduardo);
        ser.add(cpJonas);
        cpCarlos.send("eduardo@unisinos.br", "teste", "isto eh um teste", 2);
        cpEduardo.send("carlos@unisinos.br", "oi", "tudo bem?", 20);
        cpJonas.send("carlos@unisinos.br", "projeto", "tenho proposta de projeto", 1);
        cpJonas.send("carlos@unisinos.br", "projeto", "tenho proposta de projeto", 15);
        cpJonas.send("carlos@unisinos.br", "projeto", "tenho proposta de projeto", 2);
        cpJonas.send("carlos@unisinos.br", "projeto", "tenho proposta de projeto", 12);
        cpJonas.send("carlos@unisinos.br", "projeto", "tenho proposta de projeto", 10);
        cpJonas.send("carlos@unisinos.br", "projeto", "tenho proposta de projeto", 9);
        cpJonas.send("carlos@unisinos.br", "projeto", "tenho proposta de projeto", 20);
        cpJonas.send("carlos@unisinos.br", "projeto", "tenho proposta de projeto", 8);
        cpJonas.send("carlos@unisinos.br", "projeto", "tenho proposta de projeto", 1);
        cpJonas.send("carlos@unisinos.br", "projeto", "tenho proposta de projeto", 3);
        cpCarlos.send("jonas@unisinos.br", "Contrato", "Contrato em anexo", 18);
        cpCarlos.send("jonas@unisinos.br", "Contrato", "Contrato em anexo", 3);
        cpCarlos.send("jonas@unisinos.br", "Contrato", "Contrato em anexo", 9);
        cpCarlos.send("jonas@unisinos.br", "Contrato", "Contrato em anexo", 2);
        cpCarlos.send("jonas@unisinos.br", "Contrato", "Contrato em anexo", 17);
        cpCarlos.send("jonas@unisinos.br", "Contrato", "Contrato em anexo", 15);
        cpCarlos.send("jonas@unisinos.br", "Contrato", "Contrato em anexo", 7);
        cpCarlos.send("jonas@unisinos.br", "Contrato", "Contrato em anexo", 8);
        cpCarlos.send("jonas@unisinos.br", "Contrato", "Contrato em anexo", 13);
        cpCarlos.send("jonas@unisinos.br", "Contrato", "Contrato em anexo", 15);
        cpCarlos.send("jonas@unisinos.br", "Contrato", "Contrato em anexo", 4);
        cpCarlos.send("jonas@unisinos.br", "Contrato", "Contrato em anexo", 19);
        cpCarlos.send("eduardo@unisinos.br", "teste", "isto eh um teste", 6);
        cpCarlos.send("eduardo@unisinos.br", "teste", "isto eh um teste", 3);
        cpCarlos.send("eduardo@unisinos.br", "teste", "isto eh um teste", 9);
        cpCarlos.send("eduardo@unisinos.br", "teste", "isto eh um teste", 5);
        cpCarlos.send("eduardo@unisinos.br", "teste", "isto eh um teste", 19);
        cpCarlos.send("eduardo@unisinos.br", "teste", "isto eh um teste", 14);
        cpCarlos.send("eduardo@unisinos.br", "teste", "isto eh um teste", 16);
        
        /**
        cpCarlos.showInboxExit();
        cpEduardo.showInboxExit();
        cpJonas.showInboxExit();
        * */
        
        ser.sendReceive(); //envia e recebe emails entre todas caixas postais
        cpCarlos.selectionSort(cpCarlos.getCaixaDeEntrada());
        cpJonas.insertionSort(cpJonas.getCaixaDeEntrada());
        cpEduardo.bubbleSort(cpEduardo.getCaixaDeEntrada());
        cpCarlos.showInbox(); //mostra caixaDeEntrada do Carlos: lista emails recebidos (remetente/assunto/corpo)
        cpEduardo.showInbox();
        cpJonas.showInbox();

        

    }
}
