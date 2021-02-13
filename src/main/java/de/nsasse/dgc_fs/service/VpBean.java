package de.nsasse.dgc_fs.service;

import de.nsasse.dgc_fs.model.VillageParty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class VpBean {

    @Inject
    VillageParty villageParty;

    public VpBean() {
    }

    public VillageParty getVpSession() {
        if (villageParty == null) {
            return null;
        }
        return villageParty;
    }

    public void setVpSession(VillageParty newVillageParty) {
        villageParty = newVillageParty;
    }
}
