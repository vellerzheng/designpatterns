package creationPattern.factoryPartten.staticFactoryPartten;

import creationPattern.factoryPartten.staticFactoryPartten.senderImpl.MailSender;
import creationPattern.factoryPartten.staticFactoryPartten.senderImpl.SmsSender;

public class SenderFactory {


    public static Sender produceMail(){
        return  new MailSender();
    }

    public static Sender produceSms(){
        return  new SmsSender();
    }

}
