package com.amazon.BroShaver.Section12Collections;

import java.util.ArrayList;
import java.util.Collections;

public class MisspellinatorReplacer {
    private static ArrayList<String> allKeywordsList;
    private static ArrayList<MisspelledWord> misspelledWordsList;
    private static ArrayList<String> finalPPCList;

    static {
        allKeywordsList.add("head shaver");
        allKeywordsList.add("skull shaver");
        allKeywordsList.add("head shavers for bald men");
        allKeywordsList.add("pitbull shaver");
        allKeywordsList.add("bald head shavers for men");
        allKeywordsList.add("skull shavers for men");
        allKeywordsList.add("head shavers for men");
        allKeywordsList.add("pitbull skull shaver");
        allKeywordsList.add("mens head shaver");
        allKeywordsList.add("head razors for bald men");
        allKeywordsList.add("best shaver for bald heads");
        allKeywordsList.add("bald head shaver");
        allKeywordsList.add("electric head shavers for men");
        allKeywordsList.add("pitbull gold pro head and face shaver");
        allKeywordsList.add("head razor");
        allKeywordsList.add("shavers for bald heads");
        allKeywordsList.add("best shaver for bald heads");
        allKeywordsList.add("head shavers for bald men wet and dry");
        allKeywordsList.add("head trimmer for men");
        allKeywordsList.add("skullshaver");
        allKeywordsList.add("electric razor for men head shaver");
        allKeywordsList.add("pitbull head shaver");
        allKeywordsList.add("electric head shaver");
        allKeywordsList.add("head shavers");
        allKeywordsList.add("the pitbull shaver");
        allKeywordsList.add("flex series grooming kit");
        allKeywordsList.add("bald shaver");
        allKeywordsList.add("flexseries grooming kit");
        allKeywordsList.add("pitbull shaver gold");
        allKeywordsList.add("skull shaver pitbull");
        allKeywordsList.add("bulldog razor");
        allKeywordsList.add("remington balder pro head shaver");
        allKeywordsList.add("best clippers for bald heads");
        allKeywordsList.add("pitt bull shaver");
        allKeywordsList.add("pitbull gold");
        allKeywordsList.add("bald shavers for men head");
        allKeywordsList.add("pitbull shavers for bald men");
        allKeywordsList.add("headshaver");
        allKeywordsList.add("pitbull head shavers for men");
        allKeywordsList.add("pitbull gold shaver");
        allKeywordsList.add("best head shavers for bald men");
        allKeywordsList.add("scalp shaver");
        allKeywordsList.add("flex series grooming kit head shaver");
        allKeywordsList.add("electric shavers for men bald head");
        allKeywordsList.add("pitbull platinum pro head and face shaver");
        allKeywordsList.add("men head shaver");
        allKeywordsList.add("razor for bald head shaving");
        allKeywordsList.add("shaver for bald head men");
        allKeywordsList.add("bald head");
        allKeywordsList.add("palm shavers for bald head");
        allKeywordsList.add("pitbull razor");
        allKeywordsList.add("head trimmer");
        allKeywordsList.add("skull razor");
        allKeywordsList.add("bulldog head shaver");
        allKeywordsList.add("skull shaver gold pro");
        allKeywordsList.add("skull shaver blades");
        allKeywordsList.add("head shaver for bald men");
        allKeywordsList.add("men's head shaver");
        allKeywordsList.add("remington rx5");
        allKeywordsList.add("remington rx5 head shaver");
        allKeywordsList.add("bald head");
        allKeywordsList.add("head shaver for bald men");
        allKeywordsList.add("pitbull razors for men");
        allKeywordsList.add("skull shaver pitbull silver pro");
        allKeywordsList.add("aidallswellup 5-in-1 electric head shaver");
        allKeywordsList.add("head electric shaver");
        allKeywordsList.add("flexseries");
        allKeywordsList.add("eagle bald head shaver");
        allKeywordsList.add("skull head shavers for men");
        allKeywordsList.add("freedom razor");
        allKeywordsList.add("bald mermaid");
        allKeywordsList.add("bald mermaid");
        allKeywordsList.add("men's head shaver");
        allKeywordsList.add("pitbull shaver platinum pro");
        allKeywordsList.add("skull shavers");
        allKeywordsList.add("bald eagle pro shaver");
        allKeywordsList.add("palm shaver");
        allKeywordsList.add("shave bald");
        allKeywordsList.add("head shaver for men");
        allKeywordsList.add("skullshaverpitbull");
        allKeywordsList.add("mens head shavers");
        allKeywordsList.add("the best shaver");
        allKeywordsList.add("5 head electric razor");
        allKeywordsList.add("pitbull gold skull");
        allKeywordsList.add("best head shavers for men");
        allKeywordsList.add("head razor for bald men");
        allKeywordsList.add("groomie baldie pro shaver");
        allKeywordsList.add("freedom groomer");
        allKeywordsList.add("pit bull head shaver");
        allKeywordsList.add("mens head razor");
        allKeywordsList.add("head and face shaver for men");
        allKeywordsList.add("shaving for bald men");
        allKeywordsList.add("best razor for men bald head");
        allKeywordsList.add("electric skull shavers for men");
        allKeywordsList.add("electric skull shavers for men");
        allKeywordsList.add("head shavers for bald men razor blade");
        allKeywordsList.add("mens head shaver bald");
        allKeywordsList.add("4d electric shaver for men");
        allKeywordsList.add("bald head razors");
        allKeywordsList.add("grooming shavers for men");
        allKeywordsList.add("freedom grooming head shaver");
        Collections.sort(allKeywordsList);

        misspelledWordsList = new ArrayList<>();
        misspelledWordsList.add(new MisspelledWord("head", "hed"));
        misspelledWordsList.add(new MisspelledWord("head", "haed"));
        misspelledWordsList.add(new MisspelledWord("head", "ead"));
        misspelledWordsList.add(new MisspelledWord("bald", "bldg"));
        misspelledWordsList.add(new MisspelledWord("bald", "blvd"));
        misspelledWordsList.add(new MisspelledWord("men's", "mens"));
        misspelledWordsList.add(new MisspelledWord("men's", "ens"));
        misspelledWordsList.add(new MisspelledWord("mens", "ens"));
        misspelledWordsList.add(new MisspelledWord("best", "ebst"));
        misspelledWordsList.add(new MisspelledWord("best", "bst"));
        misspelledWordsList.add(new MisspelledWord("gold", "golds"));
        misspelledWordsList.add(new MisspelledWord("face", "fave"));
        misspelledWordsList.add(new MisspelledWord("face", "face"));
        misspelledWordsList.add(new MisspelledWord("face", "fae"));
        misspelledWordsList.add(new MisspelledWord("face", "fase"));
        misspelledWordsList.add(new MisspelledWord("wet", "weet"));
        misspelledWordsList.add(new MisspelledWord("dry", "dy"));
        misspelledWordsList.add(new MisspelledWord("dry", "dr"));
        misspelledWordsList.add(new MisspelledWord("dry", "dryish"));
        misspelledWordsList.add(new MisspelledWord("flex", "flexi"));
        misspelledWordsList.add(new MisspelledWord("series", "seris"));
        misspelledWordsList.add(new MisspelledWord("scalp", "scap"));
        misspelledWordsList.add(new MisspelledWord("shaving", "shvoong"));
        misspelledWordsList.add(new MisspelledWord("shave", "have"));
        misspelledWordsList.add(new MisspelledWord("rotary", "rotory"));
        misspelledWordsList.add(new MisspelledWord("rotary", "rotar"));
        misspelledWordsList.add(new MisspelledWord("rotary", "rotarty"));

        finalPPCList = new ArrayList<>();
    }

    public static ArrayList<String> replaceWithMisspelling() {
        for (int currentKeyword = 0; currentKeyword < allKeywordsList.size(); currentKeyword++) {
            int countOfMisspellings = 0;
            for (int currentMisspelling = 0; currentMisspelling < misspelledWordsList.size(); currentMisspelling++) {
                if (allKeywordsList.get(currentKeyword).contains(misspelledWordsList.get(currentMisspelling).getIntention())) {

                }
            }
        }
        return null;
    }
}
