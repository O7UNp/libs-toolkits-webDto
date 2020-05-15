package dev.xethh.libs.toolkits.webDto.core.request.search;

import dev.xethh.libs.toolkits.webDto.core.Chain.Chain;
import dev.xethh.libs.toolkits.webDto.core.request.RequestWithArgs;

public class SearchingRequest<Self extends SearchingRequest<Self, Search>, Search extends SearchingCriteria> extends RequestWithArgs<Self, Search> {

    public Search getSearch() {
        return getData();
    }

    public void setSearch(Search data){
        search(data);
    }
    public Self search(Search data){
        return Chain.get((Self s)->s.setData(data)).apply((Self)this);
    }
}
