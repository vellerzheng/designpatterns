package factoryPartten.staticFactoryPartten;

import factoryPartten.staticFactoryPartten.senderImpl.MailSender;
import factoryPartten.staticFactoryPartten.senderImpl.SmsSender;

public class SenderFactory {


    public static Sender produceMail(){
        return  new MailSender();
    }

    public static Sender produceSms(){
        return  new SmsSender();
    }

}
