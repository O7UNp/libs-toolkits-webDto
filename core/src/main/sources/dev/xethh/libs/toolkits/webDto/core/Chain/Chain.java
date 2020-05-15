package dev.xethh.libs.toolkits.webDto.core.Chain;

public class Chain<Item> {
    public interface Fun<I>{
        void apply(I i);
    }
    Fun<Item> fun;

    public Chain(Fun<Item> fun){
        this.fun = fun;
    }

    public Item apply(Item item){
        fun.apply(item);
        return item;
    }

    public static <Item> Chain<Item> get(Fun<Item> fuc){
        Chain chain = new Chain(fuc);
        return chain;
    }


}
