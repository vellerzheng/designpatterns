package factoryPartten.abstractFactoryPartten.providerImpl;

import factoryPartten.abstractFactoryPartten.Provider;
import factoryPartten.abstractFactoryPartten.Sender;
import factoryPartten.abstractFactoryPartten.senderImpl.WeiXinSender;

public class SendWeiXinFactory implements Provider {
    @Override
    public Sender produce() {
        return new WeiXinSender();
    }
}
