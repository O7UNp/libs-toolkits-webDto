package dev.xethh.libs.toolkits.webDto.core.response;

import dev.xethh.libs.toolkits.webDto.core.response.err.ResponseError;
import dev.xethh.libs.toolkits.webDto.core.response.status.ResponseStatus;

import java.util.List;

public abstract class ListResponse<Self extends ListResponse<Self, Data, Err>,Data, Err extends ResponseError> extends Response<Self,List<Data>, Err> {
    public ListResponse(ResponseStatus status, List<Data> result, Err error) {
        super(status, result, error);
    }
}
