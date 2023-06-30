package crudClients;

import crudClients.dao.ClientMapDAO;
import crudClients.dao.IClientDAO;
import crudClients.domain.Client;

import javax.swing.*;

public class App {
    private static IClientDAO iClientDAO;
    public static  void main(String[] args){
        iClientDAO = new ClientMapDAO();

        String option = JOptionPane.showInputDialog(
                null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou outras teclas para sair.",
                "Cadastro",
                JOptionPane.INFORMATION_MESSAGE
        );
        while (!isValidOption(option)) {
            if ("".equals(option) ) {
                exitProgram();
            }
            option = JOptionPane.showInputDialog(
                    null,
                    "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou outras teclas para sair.",
                    "Cadastro",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
        while (isValidOption(option)){
              if (isSignUp(option)){
              String data = JOptionPane.showInputDialog(
                        null,
                        "Digite os dados do cliente conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado.",
                        "Cadastro",
                        JOptionPane.INFORMATION_MESSAGE
                );
              signingUp(data);


            }
            else if (isFind(option)) {
                String data = JOptionPane.showInputDialog(
                        null,
                        "Digite o CPF cadastrado para consulta.",
                        "Busca",
                        JOptionPane.INFORMATION_MESSAGE
                );
            finding(data);

            }
            option = JOptionPane.showInputDialog(
                    null,
                    "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou outras teclas para sair.",
                    "Cadastro",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

    }

    private static void finding(String data) {
           Client client = iClientDAO.find(Long.parseLong(data));
                JOptionPane.showMessageDialog(
                null,
                "Cliente encontrado: " + client.toString(),
                "Busca",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private static boolean isFind(String option) {
        return "2".equals(option);
    }

    private static void signingUp(String data) {
        String[] strArrData = data.split(", ");


                Client client = new Client(
                strArrData[0], Long.parseLong(strArrData[1]), Long.parseLong(strArrData[2]), strArrData[3], Integer.parseInt(strArrData[4]), strArrData[5], strArrData[6]
        );
        Boolean isSignedUp = iClientDAO.signUp(client);
        if(isSignedUp)
            JOptionPane.showMessageDialog(
                    null,
                    "Cliente cadastrado com sucesso!",
                    "Cadastro",
                    JOptionPane.INFORMATION_MESSAGE
            );
        else {
            JOptionPane.showInputDialog(
                    null,
                    "Falha no cadastro, verifique as informações e tente novamente.",
                    "Cadastro",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    }

    private static boolean isSignUp(String option) {
        return "1".equals(option);
    }

    private static void exitProgram() {
        JOptionPane.showMessageDialog(null,
                    "Até mais!",
                    "Sair",
                    JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isValidOption(String option) {
        return "1".equals(option) || "2".equals(option) || "3".equals(option) || "4".equals(option);
    }
}
