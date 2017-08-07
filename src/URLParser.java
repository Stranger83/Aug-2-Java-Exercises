import sun.misc.Regexp;

import java.util.Scanner;

public class URLParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int protocolIndex = input.indexOf("://");
        String protocol = "";
        String server = "";
        String resource = "";
        int serverIndex = Integer.MIN_VALUE;
        if (protocolIndex > 0) {
            protocol += input.substring(0, protocolIndex);
            serverIndex = input.indexOf("/", protocolIndex + 3);
            if (serverIndex > 0) {
                server = input.substring(protocolIndex + 3, serverIndex);
                resource += input.substring(serverIndex + 1);
            }else {
                server = input.substring(protocolIndex + 3);
            }
        } else {
            serverIndex = input.indexOf("/");
            if (serverIndex > 0) {
                server = input.substring(0, serverIndex);
                resource += input.substring(serverIndex + 1);
            }else {
                server = input;
            }
        }

        System.out.printf("[protocol] = \"%s\"%n", protocol);
        System.out.printf("[server] = \"%s\"%n", server.trim());
        System.out.printf("[resource] = \"%s\"%n", resource.trim());
    }
}