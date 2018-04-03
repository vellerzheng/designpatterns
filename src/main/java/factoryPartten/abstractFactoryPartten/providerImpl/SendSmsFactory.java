package factoryPartten.abstractFactoryPartten.providerImpl;

import factoryPartten.abstractFactoryPartten.Provider;
import factoryPartten.abstractFactoryPartten.Sender;
import factoryPartten.abstractFactoryPartten.senderImpl.SmsSender;

public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}