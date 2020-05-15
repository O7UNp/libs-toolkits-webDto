package dev.xethh.libs.toolkits.webDto.core.response;

import dev.xethh.libs.toolkits.webDto.core.response.err.ResponseError;
import dev.xethh.libs.toolkits.webDto.core.response.status.ResponseStatus;

public abstract class ObjectResponse<Self extends ObjectResponse<Self, Data, Err>,Data, Err extends ResponseError> extends Response<Self, Data, Err> {
    public ObjectResponse(ResponseStatus status, Data result, Err error) {
        super(status, result, error);
    }
}
