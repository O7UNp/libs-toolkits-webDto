package dev.xethh.libs.toolkits.webDto.core.response;

import dev.xethh.libs.toolkits.webDto.core.response.err.ResponseError;
import dev.xethh.libs.toolkits.webDto.core.response.status.ResponseStatus;
import dev.xethh.libs.toolkits.webDto.core.general.page.PagedObject;

public abstract class PagingResponse<Self extends PagingResponse<Self, Data, Err>, Data, Err extends ResponseError> extends ObjectResponse<Self, PagedObject<Data>, Err> {
    public PagingResponse(ResponseStatus status, PagedObject<Data> result, Err error) {
        super(status, result, error);
    }
}
