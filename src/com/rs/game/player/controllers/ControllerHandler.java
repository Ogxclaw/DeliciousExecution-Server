package com.rs.game.player.controllers;

import java.util.HashMap;

import com.rs.game.minigames.BrimhavenAgility;
import com.rs.game.minigames.RefugeOfFear;
import com.rs.game.minigames.clanwars.FfaZone;
import com.rs.game.minigames.clanwars.RequestController;
import com.rs.game.minigames.clanwars.WarControler;
import com.rs.game.minigames.creations.StealingCreationGame;
import com.rs.game.minigames.creations.StealingCreationLobby;
import com.rs.game.minigames.duel.DuelArena;
import com.rs.game.minigames.duel.DuelControler;
import com.rs.game.player.controllers.castlewars.CastleWarsPlaying;
import com.rs.game.player.controllers.castlewars.CastleWarsWaiting;
import com.rs.game.player.controllers.events.DeathEvent;
import com.rs.game.player.controllers.fightpits.FightPitsArena;
import com.rs.game.player.controllers.fightpits.FightPitsLobby;
import com.rs.game.player.controllers.pestcontrol.PestControlGame;
import com.rs.game.player.controllers.pestcontrol.PestControlLobby;
import com.rs.utils.Logger;

public class ControllerHandler {

	private static final HashMap<Object, Class<Controller>> handledControllers = new HashMap<Object, Class<Controller>>();

	@SuppressWarnings("unchecked")
	public static final void init() {
		try {
			Class<Controller> value1 = (Class<Controller>) Class
					.forName(Wilderness.class.getCanonicalName());
			handledControllers.put("Wilderness", value1);
			Class<Controller> value2 = (Class<Controller>) Class
					.forName(Kalaboss.class.getCanonicalName());
			handledControllers.put("Kalaboss", value2);
			Class<Controller> value4 = (Class<Controller>) Class
					.forName(GodWars.class.getCanonicalName());
			handledControllers.put("GodWars", value4);
			Class<Controller> value5 = (Class<Controller>) Class
					.forName(ZGDControler.class.getCanonicalName());
			handledControllers.put("ZGDControler", value5);
			/*Class<Controller> value6 = (Class<Controller>) Class
					.forName(TutorialIsland.class.getCanonicalName());
			handledControlers.put("TutorialIsland", value6);
			Class<Controller> value7 = (Class<Controller>) Class
					.forName(StartTutorial.class.getCanonicalName());
			handledControlers.put("StartTutorial", value7);*/
			Class<Controller> value9 = (Class<Controller>) Class
					.forName(DuelArena.class.getCanonicalName());
			handledControllers.put("DuelArena", value9);
			Class<Controller> value10 = (Class<Controller>) Class
					.forName(DuelControler.class.getCanonicalName());
			handledControllers.put("DuelControler", value10);
			Class<Controller> value11 = (Class<Controller>) Class
					.forName(CorpBeastController.class.getCanonicalName());
			handledControllers.put("CorpBeastControler", value11);
			Class<Controller> value14 = (Class<Controller>) Class
					.forName(DTController.class.getCanonicalName());
			handledControllers.put("DTControler", value14);
			Class<Controller> value15 = (Class<Controller>) Class
					.forName(JailController.class.getCanonicalName());
			handledControllers.put("JailControler", value15);
			Class<Controller> value17 = (Class<Controller>) Class
					.forName(CastleWarsPlaying.class.getCanonicalName());
			handledControllers.put("CastleWarsPlaying", value17);
			Class<Controller> value18 = (Class<Controller>) Class
					.forName(CastleWarsWaiting.class.getCanonicalName());
			handledControllers.put("CastleWarsWaiting", value18);
//			Class<Controler> value99 = (Class<Controler>) Class
//					.forName(DungeonControler.class.getCanonicalName());
//			handledControlers.put("DungeonControler", value99);
			Class<Controller> value20 = (Class<Controller>) Class
					.forName(NewHomeController.class.getCanonicalName());
			handledControllers.put("NewHomeControler", value20);
			handledControllers.put("clan_wars_request", (Class<Controller>) Class.forName(RequestController.class.getCanonicalName()));
			handledControllers.put("clan_war", (Class<Controller>) Class.forName(WarControler.class.getCanonicalName()));
			handledControllers.put("clan_wars_ffa", (Class<Controller>) Class.forName(FfaZone.class.getCanonicalName()));
			handledControllers.put("NomadsRequiem", (Class<Controller>) Class.forName(NomadsRequiem.class.getCanonicalName()));
			handledControllers.put("BorkControler", (Class<Controller>) Class.forName(BorkController.class.getCanonicalName()));	
			handledControllers.put("BrimhavenAgility", (Class<Controller>) Class.forName(BrimhavenAgility.class.getCanonicalName()));
			handledControllers.put("FightCavesControler", (Class<Controller>) Class.forName(FightCaves.class.getCanonicalName()));
			handledControllers.put("FightKilnControler", (Class<Controller>) Class.forName(FightKiln.class.getCanonicalName()));
			handledControllers.put("FightPitsLobby", (Class<Controller>) Class.forName(FightPitsLobby.class.getCanonicalName()));
			handledControllers.put("FightPitsArena", (Class<Controller>) Class.forName(FightPitsArena.class.getCanonicalName()));
			handledControllers.put("PestControlGame", (Class<Controller>) Class.forName(PestControlGame.class.getCanonicalName()));
			handledControllers.put("PestControlLobby", (Class<Controller>) Class.forName(PestControlLobby.class.getCanonicalName()));
			handledControllers.put("Barrows", (Class<Controller>) Class.forName(Barrows.class.getCanonicalName()));
			handledControllers.put("RefugeOfFear", (Class<Controller>) Class.forName(RefugeOfFear.class.getCanonicalName()));
			handledControllers.put("Falconry", (Class<Controller>) Class.forName(Falconry.class.getCanonicalName()));
			handledControllers.put("QueenBlackDragonControler", (Class<Controller>) Class.forName(QueenBlackDragonController.class.getCanonicalName()));
			handledControllers.put("HouseControler", (Class<Controller>) Class.forName(HouseController.class.getCanonicalName()));
			handledControllers.put("RuneSpanControler", (Class<Controller>) Class.forName(RunespanController.class.getCanonicalName()));
			handledControllers.put("DeathEvent", (Class<Controller>) Class.forName(DeathEvent.class.getCanonicalName()));
			handledControllers.put("SorceressGarden", (Class<Controller>) Class.forName(SorceressGarden.class.getCanonicalName()));
			handledControllers.put("CrucibleControler", (Class<Controller>) Class.forName(CrucibleController.class.getCanonicalName()));
			handledControllers.put("StealingCreationsGame", (Class<Controller>) Class.forName(StealingCreationGame.class.getCanonicalName()));
			handledControllers.put("StealingCreationsLobby", (Class<Controller>) Class.forName(StealingCreationLobby.class.getCanonicalName()));
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	public static final void reload() {
		handledControllers.clear();
		init();
	}

	public static final Controller getController(Object key) {
		if (key instanceof Controller)
			return (Controller) key;
		Class<Controller> classC = handledControllers.get(key);
		if (classC == null)
			return null;
		try {
			return classC.newInstance();
		} catch (Throwable e) {
			Logger.handle(e);
		}
		return null;
	}
}
