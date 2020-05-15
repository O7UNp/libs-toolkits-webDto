package dev.xethh.libs.toolkits.webDto.core.response;

import dev.xethh.libs.toolkits.webDto.core.Chain.Chain;
import dev.xethh.libs.toolkits.webDto.core.WebBaseEntity;
import dev.xethh.libs.toolkits.webDto.core.response.err.ResponseError;
import dev.xethh.libs.toolkits.webDto.core.response.status.ResponseStatus;

public class Response<Self extends Response<Self, Data, Err>,Data, Err extends ResponseError> extends WebBaseEntity {
    public Response(){

    }
    public Response(ResponseStatus status, Data result, Err error) {
        this.status = status;
        this.result = result;
        this.error = error;
    }

    private ResponseStatus status;
    private Data result;
    private Err error;

    public Self status(ResponseStatus status){
        return Chain.get((Self s)->s.setStatus(status)).apply((Self) this);
    }
    public Self result(Data data){
        return Chain.get((Self s)->s.setResult(data)).apply((Self) this);
    }
    public Self error(ResponseStatus status){
        return Chain.get((Self s)->s.setError(error)).apply((Self) this);
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public Data getResult() {
        return result;
    }

    public void setResult(Data result) {
        this.result = result;
    }

    public Err getError() {
        return error;
    }

    public void setError(Err error) {
        this.error = error;
    }
}
