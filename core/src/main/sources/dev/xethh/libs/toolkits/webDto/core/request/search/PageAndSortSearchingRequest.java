package dev.xethh.libs.toolkits.webDto.core.request.search;

import dev.xethh.libs.toolkits.webDto.core.Chain.Chain;
import dev.xethh.libs.toolkits.webDto.core.general.page.PageConfig;
import dev.xethh.libs.toolkits.webDto.core.general.sort.Sorting;

import java.util.List;

public abstract class PageAndSortSearchingRequest<Self extends PageAndSortSearchingRequest<Self, Data>,Data extends SearchingCriteria> extends SearchingRequest<Self, Data> {
    private PageConfig page;
    private List<Sorting> sort;

    public PageConfig getPage() {
        return page;
    }

    public void setPage(PageConfig page) {
        this.page = page;
    }

    public List<Sorting> getSort() {
        return sort;
    }

    public void setSort(List<Sorting> sort) {
        this.sort = sort;
    }

    public Self page(PageConfig page){
        return Chain.get((Self s)->s.setPage(page)).apply((Self) this);
    }
    public Self sort(List<Sorting> sort){
        return Chain.get((Self s)->s.setSort(sort)).apply((Self) this);
    }
}
