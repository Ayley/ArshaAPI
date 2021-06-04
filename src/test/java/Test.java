import me.kleidukos.arsha.ArshaIO;
import me.kleidukos.arsha.http.HttpLinkBuilder;
import me.kleidukos.arsha.models.v2.Item;
import me.kleidukos.arsha.util.*;

import java.net.URISyntaxException;

public class Test {

    public static void main(String[] args) throws URISyntaxException {
        ArshaIO arshaIO = new ArshaIO();

        HttpLinkBuilder builder = new HttpLinkBuilder(ApiVersion.V2, Region.EU, RequestType.ITEM);

        builder.setId(5003).setLanguage(Language.DE).setSid(10);

        String result = arshaIO.getApi().request(builder);

        System.out.println(result);

        Item[] items = arshaIO.getParser().parseFromJson(result, Item[].class);

        for(Item item : items){
            System.out.println(item.toString());
        }

    }

}
