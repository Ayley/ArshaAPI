import me.kleidukos.arsha.ArshaIO;
import me.kleidukos.arsha.http.GetHttpLinkBuilder;
import me.kleidukos.arsha.http.PostHttpLinkBuilder;
import me.kleidukos.arsha.models.utility.MaterialGroup;
import me.kleidukos.arsha.models.utility.Recipe;
import me.kleidukos.arsha.models.v2.HistoryItem;
import me.kleidukos.arsha.util.Api;
import me.kleidukos.arsha.util.Language;
import me.kleidukos.arsha.util.Region;
import me.kleidukos.arsha.util.RequestType;

public class Test {

    public static void main(String[] args) {
        ArshaIO arshaIO = new ArshaIO();

        /*GetHttpLinkBuilder getBuilder = new GetHttpLinkBuilder(Api.V2, Region.EU, RequestType.HISTORY);

        getBuilder.setId(10007).setLanguage(Language.DE).setSid(10);

        String getResult = arshaIO.getApi().getRequest(getBuilder);

        PostHttpLinkBuilder postBuilder = new PostHttpLinkBuilder(Api.V2, Region.EU, RequestType.HISTORY);

        postBuilder.setId(10007).setSid(10);

        String postResult = arshaIO.getApi().postRequest(postBuilder);

        System.out.println(getResult);

        HistoryItem items = arshaIO.getParser().parseFromJson(postResult, HistoryItem.class);

        System.out.println(items);*/

        PostHttpLinkBuilder postHttpLinkBuilder = new PostHttpLinkBuilder(Api.Util, RequestType.RECIPE_DATABASE);


        postHttpLinkBuilder.setLanguage(Language.DE).setId(115);

        String result = arshaIO.getApi().postRequest(postHttpLinkBuilder);

        System.out.println(result);

        Recipe recipe = arshaIO.getParser().parseFromJson(result, Recipe.class);

        System.out.println(recipe);
    }
}
