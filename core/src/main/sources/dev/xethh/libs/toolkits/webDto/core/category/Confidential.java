package dev.xethh.libs.toolkits.webDto.core.category;

import dev.xethh.libs.toolkits.webDto.core.request.RequestWithArgs;

public interface Confidential {
    public abstract class ConfidentialAbs implements Confidential{
        @Override public String toString(){
            return confidentialToString();
        }
        public abstract String confidentialToString();
    }

    public abstract class ConfidentialRequest<Self extends ConfidentialRequest<Self, Data>, Data> extends RequestWithArgs<Self, Data> implements Confidential{
        @Override public String toString(){
            return confidentialToString();
        }
        public abstract String confidentialToString();
    }

}
