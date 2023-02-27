package level_11.Seminar_11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ServerApp {

    public static void main(String[] args) {
        ServerSocket seso;

        {
            try {
                seso = new ServerSocket(4444);
                System.out.println("---Сервер запущен. Ожидает соединения");
                Socket socket = seso.accept();
                System.out.println("---Клиент подключился");
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

                while (true) {
                    String mathExample = dataInputStream.readUTF();
                    System.out.println("Клиент прислал " + mathExample);
                    Calc calc = new Calc();
                    LinkedList <String> list = calc.infix(mathExample);
                    Queue<String> queue = calc.postfix(list);
                    int x = calc.calculate(queue);
                    if ("end".equals(mathExample))
                        break;
                    dataOutputStream.writeUTF(" ответ сервера = " + x);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
