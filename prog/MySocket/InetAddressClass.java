package My.MySocket;
import java.net.*;

/**
 * Created by Andrzej on 2017-09-08.
 */
public class InetAddressClass {
    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Вывод IP адреса хоста " + address.getHostAddress() );
            System.out.println("Вывод имени хоста " + address.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
