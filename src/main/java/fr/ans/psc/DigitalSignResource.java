package fr.ans.psc;

import io.gravitee.gateway.api.handler.Handler;
import io.gravitee.resource.api.AbstractConfigurableResource;
import io.gravitee.resource.api.ResourceConfiguration;

import java.util.List;

public abstract class DigitalSignResource<C extends ResourceConfiguration> extends AbstractConfigurableResource<C> {

    public abstract void signWithXmldsig(byte[] docToSign, List<AdditionalParameter> additionalParameters, Handler<DigitalSignResponse> responseHandler);
}
