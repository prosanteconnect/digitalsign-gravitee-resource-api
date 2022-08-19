package fr.ans.psc;

import io.gravitee.gateway.api.handler.Handler;
import io.gravitee.resource.api.AbstractConfigurableResource;
import io.gravitee.resource.api.ResourceConfiguration;

public abstract class DigitalSignResource<C extends ResourceConfiguration> extends AbstractConfigurableResource<C> {

    public abstract void signWithXmldsig(byte[] docToSign, Handler<DigitalSignResponse> responseHandler);
}
