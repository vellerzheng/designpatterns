package factoryPartten.staticFactoryPartten.senderImpl;


import factoryPartten.staticFactoryPartten.Sender;

public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }


}
