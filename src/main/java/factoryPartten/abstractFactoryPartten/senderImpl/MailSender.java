package factoryPartten.abstractFactoryPartten.senderImpl;

import factoryPartten.abstractFactoryPartten.Sender;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
