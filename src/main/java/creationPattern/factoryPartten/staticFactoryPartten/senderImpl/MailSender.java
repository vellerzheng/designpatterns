package creationPattern.factoryPartten.staticFactoryPartten.senderImpl;


import creationPattern.factoryPartten.staticFactoryPartten.Sender;

public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }


}
