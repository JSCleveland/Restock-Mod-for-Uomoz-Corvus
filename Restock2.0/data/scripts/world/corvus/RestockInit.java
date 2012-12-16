package data.scripts.world.corvus;

import java.util.List;

import com.fs.starfarer.api.campaign.CampaignFleetAPI;
import com.fs.starfarer.api.campaign.CargoAPI;
import com.fs.starfarer.api.campaign.FleetAssignment;
import com.fs.starfarer.api.campaign.SectorAPI;
import com.fs.starfarer.api.campaign.SectorEntityToken;
import com.fs.starfarer.api.campaign.SectorGeneratorPlugin;
import com.fs.starfarer.api.campaign.StarSystemAPI;
import com.fs.starfarer.api.campaign.CargoAPI.CrewXPLevel;
import com.fs.starfarer.api.fleet.FleetMemberType;

@SuppressWarnings("unchecked")
public class RestockInit implements SectorGeneratorPlugin {

	public void generate(SectorAPI sector) {
		StarSystemAPI system = sector.getStarSystem("Corvus");

		
		SectorEntityToken token = system.createToken(-1000, 1000);
		system.addSpawnPoint(new RestockSpawnPoint(sector, system, 1, 1, token));

	}
}
