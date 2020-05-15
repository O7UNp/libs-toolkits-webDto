package dev.xethh.libs.toolkits.webDto.core.request;

import dev.xethh.libs.toolkits.webDto.core.Chain.Chain;

public abstract class RequestWithArgs<Self extends RequestWithArgs<Self, Data>,Data> extends Request<Self> {
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Self data(Data data){
        return Chain.get((Self rq)->rq.setData(data)).apply((Self) this);
    }

    public String toString() {
        return "RequestWithArgs{" +
                "data=" + data +
                '}';
    }
}
