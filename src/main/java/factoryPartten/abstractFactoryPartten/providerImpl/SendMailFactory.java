package factoryPartten.abstractFactoryPartten.providerImpl;

import factoryPartten.abstractFactoryPartten.Provider;
import factoryPartten.abstractFactoryPartten.Sender;
import factoryPartten.abstractFactoryPartten.senderImpl.MailSender;

public class SendMailFactory implements Provider {

    @Override
    public Sender produce(){
        return new MailSender();
    }
}