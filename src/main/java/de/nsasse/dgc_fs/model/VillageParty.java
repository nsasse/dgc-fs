package de.nsasse.dgc_fs.model;

import java.util.List;
import java.util.Map;

public class VillageParty {
    int currentCardIndex;
    List<VPCard> cardList;
    VPCard activeRuleOne;
    VPCard activeRuleTwo;
    Map<Integer, RuleAssignment> ruleAssignmentMap;
}
