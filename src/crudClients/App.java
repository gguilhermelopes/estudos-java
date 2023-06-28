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


        while (!isValidOption(option)){
            if("".equals(option) || "5".equals(option)){
                exitProgram();
            }
            option = JOptionPane.showInputDialog(
                    null,
                    "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair.",
                    "Cadastro",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        while (isValidOption(option)){
            if(isSignUp(option)){
              String data = JOptionPane.showInputDialog(
                        null,
                        "Digite os dados do cliente conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado.",
                        "Cadastro",
                        JOptionPane.INFORMATION_MESSAGE
                );
              signingUp(data);

            }
        }

    }

    private static void signingUp(String data) {
        String[]  strArrData = data.split(", ");
                Client client = new Client(
                strArrData[0], Long.parseLong(strArrData[1]), Long.parseLong(strArrData[2]), strArrData[3], Integer.parseInt(strArrData[4]), strArrData[5], strArrData[6]
        );
        Boolean isSignedUp = iClientDAO.signUp(client);


    }

    private static boolean isSignUp(String option) {
        return "1".equals(option);
    }

    private static void exitProgram() {

        String exit = JOptionPane.showInputDialog(
                null,
                "Deseja mesmo sair? S/N",
                "Sair",
                JOptionPane.INFORMATION_MESSAGE
        );
        if("S".equals(exit) || "s".equals(exit)) {
            JOptionPane.showMessageDialog(null,
                    "Até mais!",
                    "Sair",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    private static boolean isValidOption(String option) {
        return "1".equals(option) || "2".equals(option) || "3".equals(option) || "4".equals(option);
    }
}
