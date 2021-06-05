import me.kleidukos.arsha.ArshaIO;
import me.kleidukos.arsha.http.HttpLinkBuilder;
import me.kleidukos.arsha.models.v2.HistoryItem;
import me.kleidukos.arsha.util.ApiVersion;
import me.kleidukos.arsha.util.Language;
import me.kleidukos.arsha.util.Region;
import me.kleidukos.arsha.util.RequestType;

public class Test {

    public static void main(String[] args) {
        ArshaIO arshaIO = new ArshaIO();

        HttpLinkBuilder builder = new HttpLinkBuilder(ApiVersion.V2, Region.EU, RequestType.HISTORY);

        builder.setId(10007).setLanguage(Language.DE).setSid(10);

        String result = arshaIO.getApi().request(builder);

        System.out.println(result);

        HistoryItem items = arshaIO.getParser().parseFromJson(result, HistoryItem.class);

        System.out.println(items);
    }
}
